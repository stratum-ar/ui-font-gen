package com.stratum.uiserver.graphics.font;

public class ShaleBitmapFont extends BitmapFont {
    private int[] codePoints = new int[]{
        32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126
    };
    private int[] characterWidths = new int[]{
        4, 5, 5, 8, 7, 8, 8, 5, 4, 4, 5, 7, 5, 7, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 7, 7, 7, 7, 8, 7, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 9, 7, 7, 7, 4, 6, 4, 7, 7, 5, 7, 7, 7, 7, 7, 5, 7, 7, 4, 4, 7, 4, 9, 7, 7, 7, 7, 6, 7, 5, 7, 7, 9, 7, 7, 7, 5, 5, 5, 7
    };
    private int[] characterXOffsets = new int[]{
        1, 5, 10, 15, 23, 30, 38, 46, 51, 55, 59, 64, 71, 76, 83, 88, 94, 101, 108, 115, 122, 129, 136, 143, 150, 157, 164, 169, 174, 181, 188, 195, 202, 210, 217, 225, 232, 239, 246, 253, 260, 267, 274, 281, 288, 295, 304, 313, 320, 327, 334, 341, 348, 355, 362, 369, 378, 385, 392, 399, 403, 409, 413, 420, 427, 432, 439, 446, 453, 460, 467, 472, 479, 486, 490, 494, 501, 505, 514, 521, 528, 535, 542, 548, 555, 560, 567, 574, 583, 590, 597, 604, 609, 614, 619
    };

    private int bitmapDataWidth = 626;
    private int lineHeight = 16;
    private byte[] bitmapData = new byte[]{
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 61, 124, 127, 127, 124, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 61, 124, 127, 0, 127, 0, 0, 0, 0, 127, 124, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 101, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 127, 0, 0, 127, 0, 0, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 61, 124, 127, 124, 61, 0, 0, 61, 120, 61, 0, 0, 127, 0, 0, 61, 124, 124, 61, 0, 0, 0, 0, 0, 127, 0, 0, 0, 124, 13, 0, 0, 13, 123, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 123, 0, 0, 61, 124, 127, 124, 61, 0, 0, 127, 124, 61, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 63, 124, 124, 63, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 127, 127, 0, 0, 63, 124, 124, 63, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 63, 124, 127, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 0, 127, 127, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 63, 124, 124, 95, 124, 124, 63, 0, 0, 63, 124, 124, 63, 0, 0, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 61, 124, 127, 124, 61, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 124, 13, 0, 0, 123, 7, 0, 0, 0, 0, 13, 123, 0, 0, 0, 32, 113, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 117, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 127, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 0, 127, 0, 0, 0, 13, 124, 0, 0, 0, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 124, 13, 127, 13, 123, 0, 0, 124, 27, 124, 0, 0, 127, 0, 0, 124, 13, 13, 124, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 127, 127, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 46, 88, 0, 0, 124, 13, 0, 13, 124, 0, 0, 0, 13, 123, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 124, 13, 13, 124, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 124, 13, 13, 124, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 124, 13, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 124, 13, 13, 127, 13, 13, 124, 0, 0, 124, 13, 13, 124, 0, 0, 127, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 123, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 89, 46, 0, 0, 0, 0, 0, 127, 0, 0, 32, 117, 58, 117, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 104, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 13, 120, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 127, 0, 0, 127, 0, 127, 0, 127, 0, 0, 124, 27, 123, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 89, 46, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 48, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 125, 5, 0, 5, 125, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 110, 36, 0, 36, 110, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 26, 115, 0, 0, 127, 0, 0, 0, 46, 88, 0, 0, 0, 0, 0, 127, 0, 0, 100, 32, 0, 32, 104, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 63, 124, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 124, 13, 127, 0, 0, 0, 0, 61, 119, 61, 0, 13, 123, 0, 0, 124, 13, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 121, 7, 0, 0, 127, 0, 127, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 36, 110, 0, 0, 0, 0, 13, 124, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 124, 13, 13, 124, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 5, 80, 106, 21, 0, 0, 127, 127, 127, 127, 127, 0, 0, 21, 107, 80, 5, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 63, 124, 124, 63, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 13, 124, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 124, 13, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 99, 32, 0, 33, 98, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 32, 117, 61, 117, 32, 0, 0, 120, 17, 0, 17, 120, 0, 0, 0, 0, 9, 111, 44, 0, 0, 127, 0, 0, 0, 7, 121, 7, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 63, 124, 127, 127, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 127, 124, 63, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 127, 124, 95, 124, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 127, 127, 0, 0, 63, 124, 127, 127, 0, 0, 63, 124, 127, 127, 127, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 13, 124, 0, 0, 0, 0, 127, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 61, 123, 127, 124, 61, 0, 0, 0, 0, 32, 121, 123, 61, 0, 0, 93, 127, 127, 127, 127, 127, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 46, 88, 0, 0, 0, 127, 0, 127, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 32, 117, 32, 0, 0, 0, 127, 127, 125, 63, 0, 0, 124, 13, 0, 127, 0, 0, 0, 127, 127, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 0, 0, 0, 36, 110, 0, 0, 95, 127, 127, 125, 63, 0, 0, 124, 13, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 21, 107, 79, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 80, 107, 21, 0, 0, 0, 0, 63, 120, 63, 0, 0, 124, 13, 13, 124, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 125, 63, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 127, 127, 125, 63, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 61, 123, 127, 124, 61, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 68, 63, 0, 63, 68, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 56, 126, 56, 0, 0, 0, 55, 109, 26, 109, 55, 0, 0, 0, 2, 94, 69, 0, 0, 0, 127, 0, 0, 0, 0, 89, 46, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 124, 13, 0, 0, 127, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 127, 127, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 13, 124, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 13, 127, 13, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 0, 127, 0, 0, 124, 13, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 127, 127, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 110, 36, 0, 36, 110, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 36, 110, 0, 0, 127, 95, 0, 0, 0, 0, 127, 0, 0, 0, 0, 95, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 127, 13, 123, 0, 0, 61, 124, 121, 32, 0, 0, 0, 0, 124, 13, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 0, 0, 0, 0, 0, 89, 46, 0, 0, 0, 127, 0, 127, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 32, 117, 32, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 63, 124, 127, 127, 127, 0, 0, 0, 0, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 0, 0, 32, 117, 32, 0, 0, 124, 13, 0, 13, 124, 0, 0, 63, 124, 127, 127, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 111, 85, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 85, 111, 0, 0, 0, 0, 124, 13, 0, 0, 0, 127, 0, 0, 127, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 127, 127, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 124, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 125, 63, 0, 0, 0, 0, 0, 13, 123, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 37, 94, 0, 94, 37, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 32, 117, 61, 117, 32, 0, 0, 0, 59, 127, 59, 0, 0, 0, 0, 69, 93, 1, 0, 0, 0, 127, 0, 0, 0, 0, 46, 88, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 13, 124, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 122, 11, 0, 11, 122, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 32, 117, 61, 117, 32, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 32, 117, 32, 0, 0, 13, 124, 0, 0, 0, 0, 127, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 127, 0, 0, 124, 13, 0, 61, 120, 61, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 121, 7, 0, 0, 0, 127, 0, 127, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 32, 117, 32, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 32, 117, 32, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 107, 80, 5, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 5, 80, 106, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 32, 117, 32, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 8, 121, 5, 121, 7, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 110, 36, 0, 36, 110, 0, 0, 0, 0, 127, 0, 0, 0, 0, 44, 111, 9, 0, 0, 0, 0, 127, 0, 0, 0, 0, 7, 121, 7, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 127, 127, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 124, 63, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 125, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 78, 61, 0, 62, 78, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 56, 126, 56, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 32, 117, 32, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 127, 0, 0, 127, 0, 127, 0, 127, 0, 0, 127, 0, 0, 124, 27, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 46, 88, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 110, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 110, 36, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 80, 107, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 107, 79, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 36, 110, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 103, 56, 103, 0, 0, 0, 127, 0, 2, 127, 2, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 115, 26, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 89, 46, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 23, 114, 5, 115, 22, 0, 0, 127, 0, 2, 127, 2, 0, 127, 0, 0, 32, 117, 61, 117, 32, 0, 0, 127, 0, 0, 0, 127, 0, 0, 32, 117, 32, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 124, 13, 127, 13, 123, 0, 0, 127, 0, 0, 124, 27, 123, 0, 0, 124, 13, 0, 13, 123, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 89, 46, 0, 0, 0, 0, 124, 13, 0, 13, 123, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 0, 0, 0, 127, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 0, 127, 0, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 48, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 48, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 124, 13, 0, 127, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 124, 13, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 124, 13, 0, 13, 123, 0, 0, 0, 0, 127, 0, 0, 0, 0, 124, 13, 0, 13, 124, 0, 0, 0, 73, 120, 72, 0, 0, 0, 123, 27, 72, 119, 72, 27, 123, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 46, 88, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 127, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 13, 124, 0, 0, 124, 13, 0, 0, 127, 0, 0, 124, 13, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 124, 13, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 124, 13, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 124, 13, 0, 13, 124, 0, 0, 127, 0, 0, 13, 124, 0, 0, 124, 13, 0, 0, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 124, 13, 0, 0, 0, 124, 13, 0, 0, 127, 0, 0, 0, 95, 93, 94, 0, 0, 0, 123, 27, 72, 119, 72, 27, 123, 0, 0, 110, 36, 0, 36, 110, 0, 0, 124, 13, 0, 0, 127, 0, 0, 110, 36, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 61, 123, 127, 123, 61, 0, 0, 127, 0, 0, 61, 119, 61, 0, 0, 61, 123, 127, 123, 61, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 13, 123, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 123, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 123, 7, 0, 0, 0, 0, 61, 123, 127, 123, 61, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 0, 0, 0, 127, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 0, 127, 0, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 0, 127, 0, 0, 0, 13, 123, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 63, 124, 127, 127, 124, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 0, 0, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 127, 0, 0, 0, 0, 0, 127, 0, 0, 127, 0, 0, 63, 124, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 0, 0, 0, 127, 0, 0, 61, 123, 127, 123, 61, 0, 0, 0, 0, 127, 0, 0, 0, 0, 63, 124, 127, 124, 63, 0, 0, 0, 30, 125, 30, 0, 0, 0, 60, 111, 83, 25, 83, 111, 60, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 0, 127, 0, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 124, 13, 0, 0, 0, 0, 8, 123, 0, 0, 13, 123, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 0, 0, 0, 0, 63, 124, 127, 127, 127, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 124, 63, 0, 0, 63, 124, 127, 127, 127, 0, 0, 63, 124, 127, 127, 0, 0, 0, 127, 0, 0, 0, 0, 63, 124, 127, 127, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 63, 124, 127, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 127, 0, 0, 0, 127, 0, 0, 63, 124, 127, 124, 63, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 127, 127, 0, 0, 127, 0, 0, 0, 0, 0, 127, 127, 127, 124, 63, 0, 0, 63, 124, 127, 127, 0, 63, 124, 127, 127, 127, 0, 0, 0, 33, 121, 33, 0, 0, 0, 60, 111, 83, 25, 83, 111, 60, 0, 0, 127, 0, 0, 0, 127, 0, 0, 63, 124, 127, 127, 127, 0, 0, 127, 127, 127, 127, 127, 0, 0, 0, 124, 13, 0, 0, 0, 127, 0, 0, 0, 13, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 61, 123, 127, 127, 123, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 120, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 61, 123, 127, 0, 0, 0, 0, 127, 0, 127, 123, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 127, 0, 0, 127, 0, 0, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 63, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 124, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    public ShaleBitmapFont() {
        setFontData(codePoints, characterWidths, characterXOffsets, bitmapDataWidth, lineHeight, bitmapData);
    }
}
