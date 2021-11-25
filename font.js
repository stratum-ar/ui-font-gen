const jimp = require("jimp")
const { readFileSync, writeFileSync } = require("fs")
const { join } = require("path")

if (process.argv.length !== 3) {
    console.log("Usage: node font <font_name>")
} else {
    const fontDir = join(__dirname, "fonts", process.argv[2])
    const charset = readFileSync(join(fontDir, "charset.txt"), "utf-8").split("")

    jimp.read(join(fontDir, "font.png")).then(img => {
        const imageData = []
        const characterWidths = []
        const characterOffsets = []

        let xOffset = 0

        img.scan(0, 0, img.getWidth(), img.getHeight(), (x, y) => {
            const rgb = jimp.intToRGBA(img.getPixelColor(x, y))

            if (y === 0 && rgb.r === 255 && rgb.g === 0) {
                characterWidths.push(x - xOffset)
                characterOffsets.push(xOffset + 1)
                imageData.push(0)

                xOffset = x
            } else {
                imageData.push(Math.round(rgb.b / 255 * 127))
            }
        })

        const arrayBuffer = new ArrayBuffer(
            2 + 2 +
            charset.length +
            characterOffsets.length * 2 +
            characterWidths.length +
            imageData.length
        )
        const view = new DataView(arrayBuffer)

        view.setUint8(0, charset.length)
        view.setUint8(1, img.getHeight())
        view.setUint16(2, img.getWidth())

        let offset = 4
        for (let i = 0; i < charset.length; i++) {
            view.setUint8(offset, charset[i].codePointAt(0))
            offset += 1
        }
        for (let i = 0; i < characterOffsets.length; i++) {
            view.setUint16(offset, characterOffsets[i])
            offset += 2
        }
        for (let i = 0; i < characterWidths.length; i++) {
            view.setUint8(offset, characterWidths[i])
            offset += 1
        }
        for (let i = 0; i < imageData.length; i++) {
            view.setUint8(offset, imageData[i])
            offset += 1
        }

        writeFileSync(join(fontDir, `${process.argv[2]}_font.bin`), Buffer.from(arrayBuffer))
    }).catch(e => {
        console.error(e)
    })
}