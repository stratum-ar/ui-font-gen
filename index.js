const jimp = require("jimp")
const { readFileSync, writeFileSync } = require("fs")
const { join } = require("path")
const { rgba } = require("jimp")

if (process.argv.length !== 3) {
    console.log("Usage: node index.js <font_name>")
} else {
    const fontDir = join(__dirname, "fonts", process.argv[2])
    const charset = readFileSync(join(fontDir, "charset.txt"), "utf-8").split("")

    jimp.read(join(fontDir, "font.png")).then(img => {
        const byteData = []
        const characterWidths = []
        const characterOffsets = []

        let xOffset = 0

        img.scan(0, 0, img.getWidth(), img.getHeight(), (x, y) => {
            const rgb = jimp.intToRGBA(img.getPixelColor(x, y))

            if (y === 0 && rgb.r === 255 && rgb.g === 0) {
                characterWidths.push(x - xOffset)
                characterOffsets.push(xOffset)
                byteData.push(0)

                xOffset = x
            } else {
                byteData.push(Math.round(rgb.b / 255 * 127))
            }
        })

        const template = readFileSync(join(__dirname, "template.java"), "utf-8").replace(
            /\$\$NAME\$\$/g, process.argv[2]
        ).replace(
            "$$CODEPOINTS$$", charset.map(x => x.codePointAt(0)).join(", ")
        ).replace(
            "$$WIDTHS$$", characterWidths.join(", ")
        ).replace(
            "$$OFFSETS$$", characterOffsets.join(", ")
        ).replace(
            "$$WIDTH$$", img.getWidth()
        ).replace(
            "$$HEIGHT$$", img.getHeight()
        ).replace(
            "$$DATA$$", byteData.join(", ")
        )

        writeFileSync(join(fontDir, `${process.argv[2]}BitmapFont.java`), template, "utf-8")
    }).catch(e => {
        console.error(e)
    })
}