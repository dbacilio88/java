package fundamental.basic.types;

public class Envoltorio {

    /**
     * @param args = String[]
     */
    public static void main(String[] args) {
        getByte();
        getTodo();
        getShort();
    }

    private static void getTodo() {
        //tipo de dato Integer: -32768, 32767
        int a = 1; //tipo de dato primitivo
        System.out.println("a = " + a);
        //cadena: "001"
        int numero = Integer.parseInt("1111", 2);
        int entero = Integer.parseInt("10");
        double doble = Double.parseDouble("11");
        float flotante = Float.parseFloat("11");

        System.out.println("numero = " + numero);
        System.out.println("entero = " + entero);

        System.out.println("doble = " + doble);
        System.out.println("flotante = " + flotante);
        String nombre = "Hugo";
        int letras = nombre.length();
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre = " + nombre.toLowerCase());
        System.out.println("letras = " + letras);
    }

    private static void getShort() {
        //tipo de dato Short: -32768, 32767
        short a = 1; //tipo de dato primitivo
        System.out.println("a = " + a);
        Short number = 32767; //tipo de dato wrapper
        int numberInt = number.intValue();
        byte numberByte = number.byteValue();//estrechamiento
        String cadena = number.toString();

        System.out.println("numberInt = " + numberInt);
        System.out.println("cadena = " + cadena);
        System.out.println("numberByte = " + numberByte);
    }

    /**
     * @apiNote Este método realiza procedimiento de números byte, tipo de comentario de documentación javadoc
     * @author Christian bacilio
     * @since 12/01/2024
     */
    private static void getByte() {
        //tipo de dato Byte: -128, 127
        byte a = 1; //tipo de dato primitivo
        System.out.println("a = " + a);
        Byte number = 127; //tipo de dato wrapper
        int numberInt = number.intValue();
        String cadena = number.toString();
        System.out.println("numberInt = " + numberInt);
        System.out.println("cadena = " + cadena);
    }

}
