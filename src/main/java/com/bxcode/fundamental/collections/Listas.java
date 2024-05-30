package com.bxcode.fundamental.collections;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;


@Log4j2
public class Listas {
    public static void main(String[] args) {

        //es ordenada, acepta duplicados, acepta nulos, y objetos o clases
        listString();
        listCarros();
        listInteger();
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

        for (Carro carro : carros) {
            log.info("color {},  año de fab. {} = ", carro.getColor(), carro.getFab());
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
        log.info("strings = {}", strings);
        strings.remove("Departamento");
    }

    private static void listInteger() {
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
        log.info("integers = {}", integers);
        integers.clear();

    }
}