package io.iztok.katas;

import java.util.HexFormat;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        var format = HexFormat.of().withUpperCase();
        return format.formatHex(new byte[] {round(r), round(g), round(b)});
    }

    private static byte round(int n) {
        return (byte) Math.min(Math.max(n, 0), 255);
    }
}
