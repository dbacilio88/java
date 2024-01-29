package fundamental.basic.collections;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        //es ordenada, acepta duplicados, acepta nulos, y objetos o clases
        listString();
    }

    private static void listCarros() {
        List<Carro> carros = new ArrayList<>();

        //new = crear una instancia o un objeto de la clase Carro (constructor)
        Carro ferrari = new Carro();
        ferrari.setColor("Rojo");
        ferrari.setFab(1988);

        Carro chevrolet = new Carro();
        chevrolet.setColor("Amarillo");
        chevrolet.setFab(2000);


        carros.add(ferrari);
        carros.add(chevrolet);

        for (int i = 0; i < carros.size(); i++) {
            System.out.println("color = " + carros.get(i).getColor() + " año de fab. " + carros.get(i).getFab());
        }

    }

    private static void listString() {
        List<String> strings = new ArrayList<>();
        strings.add("Casa");
        strings.add("Departamento");
        strings.add("Cuarto");
        strings.add(null);
        strings.add(null);
        strings.add(null);
        strings.add(null);
        System.out.println("strings = " + strings);
        strings.remove("Departamento");
        System.out.println("strings = " + strings);
    }

    private static void listInteger() {
        //interface: definir los métodos o atributos para ser implementados en una clase;
        //clase: estructura que puede contener métodos, propiedades;
        int[] num = new int[10];
        //[1, 2, 3, 4, 5, 6]
        // 0, 1, 2 ,3, 4, 5
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(5);
        integers.add(4);
        integers.add(6);
        integers.add(6);
        integers.add(2);
        integers.add(7);
        integers.add(7);
        System.out.println("integers = " + integers);
        System.out.println("tamaño de la lista = " + integers.size() + " elementos");
        System.out.println("tamaño de la lista = " + integers.isEmpty() + " elementos");
        System.out.println("tamaño de la lista = " + integers.contains(2) + " elementos");
        System.out.println("tamaño de la lista = " + integers.remove(0) + " elementos");

        integers.clear();

        System.out.println("tamaño de la lista = " + integers.size() + " elementos");

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("integers = " + integers.get(i));
        }


    }


}
