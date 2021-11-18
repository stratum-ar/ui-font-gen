package com.stratum.uiserver.graphics.font;

public class $$NAME$$BitmapFont extends BitmapFont {
    private int[] codePoints = new int[]{
        $$CODEPOINTS$$
    };
    private int[] characterWidths = new int[]{
        $$WIDTHS$$
    };
    private int[] characterXOffsets = new int[]{
        $$OFFSETS$$
    };

    private int bitmapDataWidth = $$WIDTH$$;
    private int lineHeight = $$HEIGHT$$;
    private byte[] bitmapData = new byte[]{
        $$DATA$$
    };

    public $$NAME$$BitmapFont() {
        setFontData(codePoints, characterWidths, characterXOffsets, bitmapDataWidth, lineHeight, bitmapData);
    }
}
