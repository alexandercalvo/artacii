package com.learning;

public class PaintPicture {

    public static void main(String[] args) {
        drawCat();
    }

    public static void drawCat() {

        System.out.printf("%20s", "/\\_/\\");
        System.out.printf("%n %12s %s %1s %s %s", "____", "/", "0", "0", "\\");
        System.out.printf("%n  %6s %1s %s %2s %1s", "/", "~", "____", "==", "/");
        System.out.printf("%n %18s", "(_______)_M_M");

    }
}
