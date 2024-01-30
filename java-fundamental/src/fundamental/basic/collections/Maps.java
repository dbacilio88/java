package fundamental.basic.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        mapCarros();
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
        for (Map.Entry carro : carroHashMap.entrySet()) {
            System.out.println("key: " + carro.getKey() + " value: " + carro.getValue().toString());
        }
    }

    private static void mapNombres() {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(924, "Amalia Núñez");
        m.put(921, "Cindy Nero");
        m.put(700, "César Vázquez");
        m.put(219, "Víctor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito ");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
        System.out.println(m.entrySet());

        //System.out.println("\nEntradas del diccionario extraído una a una:");
        for (Map.Entry pareja : m.entrySet()) {
            System.out.println(pareja);
        }

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

        System.out.println("stringMap = " + stringMap);
        System.out.println("stringMap.size() = " + stringMap.size());
        System.out.println("stringMap.isEmpty() = " + stringMap.isEmpty());
        System.out.println("stringMap. value = " + stringMap.get(3));

        //stringMap.clear();

        System.out.println(stringMap.containsKey(2));

    }

}
