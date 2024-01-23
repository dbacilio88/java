package fundamental.basic.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//type o una estructura
public class Arreglos {


    public static void main(String[] args) {
        setInteger();
        //Arreglo = arreglo de objetos
        //List = lista de objetos
        //Set = set de elementos
        //Map = palabra:significado (clave:valor) diccionario
    }



    private static void getListEstudiantes() {
        //Un ArrayList no puede contener datos primitivos, sólo Objetos
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante obj0 = new Estudiante();
        obj0.carrera = "Medicina";
        obj0.ciclo = 1;
        obj0.nombre = "Carlos";

        estudiantes.add(obj0);


        Estudiante obj1 = new Estudiante();
        obj1.carrera = "Arquitectura";
        obj1.ciclo = 4;
        obj1.nombre = "Luis";

        estudiantes.add(obj1);
        estudiantes.add(obj1);
        estudiantes.add(obj1);
        estudiantes.add(obj1);
        estudiantes.add(obj1);
        estudiantes.add(obj1);
        estudiantes.add(obj1);
        estudiantes.add(obj1);
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).ciclo);
            System.out.println(estudiantes.get(i).nombre);
            System.out.println(estudiantes.get(i).carrera);
        }

    }

    private static void getArrEstudiantes() {
        //Un ArrayList tiene un tamaño dinámico, mientras que el de un Array es definido en su creación

        int[][] xy = new int[2][3];


        Estudiante[] arr = new Estudiante[2];
        Estudiante obj0 = new Estudiante();
        obj0.carrera = "Medicina";
        obj0.ciclo = 1;
        obj0.nombre = "Carlos";
        arr[0] = obj0;
        Estudiante obj1 = new Estudiante();
        obj1.carrera = "Arquitectura";
        obj1.ciclo = 4;
        obj1.nombre = "Luis";
        arr[1] = obj1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].ciclo);
            System.out.println(arr[i].nombre);
            System.out.println(arr[i].carrera);
        }

    }

    private static void getArray() {
        //

        //
        int num = 10;
        System.out.println(num);
        // Arreglo = permitir almacenar una serie de datos pero de un mismo tipo.
        // Arreglo de enteros (int):
        int[] arr = new int[10];
        //n: numero de posiciones
        //i=0 ultima posición: n-1 10-1=9
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;


        System.out.println(arr[4]);
    }


    private static void arrChar() {
        //vocales
        char a = 'A';
        char[] vocales = new char[5];
        vocales[0] = 'A';
        vocales[1] = 'E';
        vocales[2] = 'I';
        vocales[3] = 'O';
        vocales[4] = 'U';
        print(vocales);
    }

    private static void print(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
    }

    private static void arrInt() {
        int[] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;
        printFor(numeros);
    }

    private static void printFor(int[] arr) {
        for (int num : arr) {
            System.out.println("arr = " + num);
        }
    }

    private static void listInteger() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("integers = " + integers.get(i));
        }
    }

    private static void setInteger() {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(1);
        integers.add(1);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("integers = " + integers);
        }
    }

    private static void listString() {
        List<String> strings = new ArrayList<>();
        strings.add("Casa");
        strings.add("Departamento");
        strings.add("Lote");
        strings.add("Dirección");
        strings.add("Localidad");


        for (int i = 0; i < strings.size(); i++) {
            System.out.println("strings = " + strings.get(i));
        }
    }


}
