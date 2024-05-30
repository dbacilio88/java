package com.bxcode.fundamental.collections;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;


@Log4j2
public class Maps {

    public static void main(String[] args) {
        mapCarros();
        mapNombres();
        mapsString();
    }

    private static void mapCarros() {
        Map<String, Carro> carroHashMap = new HashMap<>();
        Carro ferrari = new Carro();
        ferrari.setColor("Rojo");
        ferrari.setFab(1988);
        Carro toyota = new Carro();
        toyota.setColor("Rojo");
        toyota.setFab(1988);
        Carro nissan = new Carro();
        nissan.setColor("Rojo");
        nissan.setFab(1987);

        carroHashMap.put("ferrari", ferrari);
        carroHashMap.put("toyota", toyota);
        carroHashMap.put("nissan", nissan);


        carroHashMap.forEach((k, v) -> log.info("key: {} value: {}", k, v.toString()));


    }

    private static void mapNombres() {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(924, "Amalia Núñez");
        m.put(921, "Cindy Nero");
        m.put(700, "César Vázquez");
        m.put(219, "Víctor Tilla");
        m.put(537, "Alan");
        m.put(605, "Esteban Quito ");

        log.info("Todas las entradas del diccionario extraídas con entrySet:");
        log.info(m.entrySet());

        m.forEach((k, v) -> log.info("keys: {}, value: {}", k, v));
    }

    private static void mapsString() {
        //Alfabéticamente, clave: definición
        //info persona
        //persona: dni: nombre, edad, fn, etc.
        //Map<K, V> donde: K= key o clave y V= valor || diccionario
        Map<Integer, String> stringMap = new HashMap<>();
        //list, set = add(objeto)
        stringMap.put(1, "Sistema de signos utilizado para escribir");
        stringMap.put(2, "Numero 1");
        stringMap.put(3, "Numero 2");

        log.info("stringMap = {}", stringMap);
        log.info("stringMap.size() = {}", stringMap.size());
        log.info("stringMap.isEmpty() = {}", stringMap.isEmpty());
        log.info("stringMap. value = {}", stringMap.get(3));
        log.info(stringMap.containsKey(2));
    }
}