package fundamental.basic.types;

public class Primitivos {

    public static void main(String[] arg) {
        getCharacter();
        getFloat();
        getLong();
        getInt();
        getByte();
        getShort();
        getBoolean();
        getDouble();
    }

    private static void getCharacter() {
        //tipo de dato character: '';
        char data = '\u00C1';
        System.out.println("character = " + data);
    }

    private static void getDouble() {
        //tipo de dato doble: -1.2F - 1.2F;
        double number = -1.2d;
        System.out.println("number = " + number);
    }

    private static void getFloat() {
        //tipo de dato float: -1.2F - 1.2F;
        float number = -1.2F;
        System.out.println("number = " + number);
    }

    private static void getLong() {
        //tipo de dato long: -9223372036854775808L, 9223372036854775807L
        long number = -9223372036854775808L;
        System.out.println("number = " + number);
    }

    private static void getInt() {
        //tipo de dato int: -2147483648, 2147483647
        //23248516
        int number = -2147483648;
        System.out.println("number = " + number);
    }

    private static void getShort() {
        //tipo de dato short: -32768, 32767
        short number = 32767;
        System.out.println("number = " + number);
    }

    private static void getByte() {
        //tipo de dato byte: -128, 127
        byte number = 127;
        System.out.println("number = " + number);
    }

    private static void getBoolean() {
        //tipo de dato boolean: false, true
        boolean isOpen = false;
        boolean isActive = false;
        System.out.println("isActive = " + isActive);
        System.out.println("isOpen = " + isOpen);
    }
}