package lecture9;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isShadeOfGray(int red, int green, int blue) {
        return Math.abs(red - green) < 30 && Math.abs(red - blue) < 30 && Math.abs(green - blue) < 30;
    }

    public static int createRGBFromColors(int red, int green, int blue) {
        return 0xFF000000 | red << 16 | green << 8 | blue ;
    }

    public static int getBlue(int rgb) {
        return rgb & 0x00000011;
    }

    public static int getGreen(int rgb) {
        return rgb & 0x00001100 >> 8;
    }

    public static int getRed(int rgb) {
        return rgb & 0x00110000 >> 16;
    }
}
