const jimp = require("jimp")
const { readFileSync, writeFileSync } = require("fs")
const { join } = require("path")
const { rgba } = require("jimp")

if (process.argv.length !== 3) {
    console.log("Usage: node icon <icons_name>")
} else {
    const fontDir = join(__dirname, "icons", process.argv[2])

    jimp.read(join(fontDir, "icons.png")).then(img => {
        const byteData = new Uint8ClampedArray(img.getWidth() * img.getHeight())

        let i = 0
        img.scan(0, 0, img.getWidth(), img.getHeight(), (x, y) => {
            const rgb = jimp.intToRGBA(img.getPixelColor(x, y))

            byteData[i] = Math.round(rgb.b / 255 * 127)
            i++
        })

        writeFileSync(join(fontDir, `${process.argv[2]}_icons.bin`), Buffer.from(byteData))
    }).catch(e => {
        console.error(e)
    })
}