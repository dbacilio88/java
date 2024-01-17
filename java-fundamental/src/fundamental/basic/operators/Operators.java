package fundamental.basic.operators;

public class Operators {

    public static void main(String[] args) {
        //OPERADORES ARITMÉTICOS COMBINADOS
        System.out.println("OPERADORES ARITMÉTICOS");
        int opa = 15;
        int opb = 3;
        System.out.println("a+b= " + (opa + opb));
        System.out.println("a-b= " + (opa - opb));
        System.out.println("a*b= " + (opa * opb));
        System.out.println("a/b= " + (opa / opb));
        System.out.println("a%b= " + (opa % opb));

        //OPERADORES ARITMÉTICOS COMBINADOS
        System.out.println("OPERADORES ARITMÉTICOS COMBINADOS");
        int oaca = 15;
        int oacb = 4;

        System.out.println("a == b = " + (oaca += oacb));

        int edad = 21;

        if (edad > 15 && edad < 20) {
            System.out.println("descuento = 10 % " + edad);
        } else {
            System.out.println("No hay descuento");
        }

        //OPERADORES ARITMÉTICOS INCREMENTALES
        System.out.println("OPERADORES ARITMÉTICOS INCREMENTALES");
        int op = 10;
        op = op++;
        int ops = 10;
        System.out.println("op = " + op + 2);
        System.out.println("ops = " + ++ops);

        //OPERADORES LÓGICOS O BOOLEANOS
        System.out.println("OPERADORES LÓGICOS O BOOLEANOS");
        System.out.println("true y true " + (true && true));
        System.out.println("true y false " + (true && false));
        System.out.println("false y true " + (false && true));
        System.out.println("false y false " + (false && false));
        System.out.println("true o true " + (true || true));
        System.out.println("true o false " + (true || false));
        System.out.println("false o true " + (false || true));
        System.out.println("false o false " + (false || false));
        System.out.println("!false " + (!false));
        System.out.println("!true " + (!true));

        //EL OPERADOR CONDICIONAL
        System.out.println("EL OPERADOR CONDICIONAL");
        int number = 25;
        String value = (number >= 25) ? "Verdadero" : "Falso";
        System.out.println("value = " + value);

        //OPERADOR CONCATENACIÓN DE CADENAS
        System.out.println("OPERADOR CONCATENACIÓN DE CADENAS");
        String nombre = "Christian";
        nombre = nombre + " Bacilio";
        System.out.println("nombre = " + nombre);
    }
}
