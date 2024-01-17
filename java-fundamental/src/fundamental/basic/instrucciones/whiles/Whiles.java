package fundamental.basic.instrucciones.whiles;

public class Whiles {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            //System.out.println("count: " + i);
        }

        boolean close = true;

        int i = 0;

        //repite una instrucción hasta que la condición sea falsa, depender de la condición
        while (close) {
            System.out.println("count: " + i);

            if (i == 100) {
                close = false;
            }
            i++;
        }

        do {
            System.out.println("i = " + i);
        } while (true);


    }
}
