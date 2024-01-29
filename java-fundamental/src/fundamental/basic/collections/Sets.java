package fundamental.basic.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        //los sets, not aceptan elementos duplicados, elementos no ordenados, y solo acepta un null
        setsString();
    }

    private static void setsInteger() {
        Set<Integer> integers = new HashSet<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(null);
        System.out.println("integers = " + integers);
        integers.remove(0);
        System.out.println("integers = " + integers);
        integers.add(4);
        integers.clear();
        System.out.println("integers.size() = " + integers.size());

    }

    private static void setsString() {
        Set<String> strings = new HashSet<>();
        strings.add("44910167");
        strings.add("44910168");
        strings.add("44910166");
        strings.add("44910167");
        System.out.println("integers = " + strings);
        System.out.println("integers.size() = " + strings.size());
    }
}
