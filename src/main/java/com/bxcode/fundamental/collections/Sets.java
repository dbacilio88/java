package com.bxcode.fundamental.collections;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.Set;

@Log4j2
public class Sets {

    public static void main(String[] args) {
        //los sets, not aceptan elementos duplicados, elementos no ordenados, y solo acepta un null
        setsInteger();
        setsString();
    }

    static void setsInteger() {
        Set<Integer> integers = new HashSet<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(null);
        integers.remove(0);
        integers.add(4);
        integers.clear();
    }

    static void setsString() {
        Set<String> strings = new HashSet<>();
        strings.add("44910167");
        strings.add("44910168");
        strings.add("44910166");
        log.info("integers = {}", strings);
        log.info("integers.size() = {}", strings.size());
    }
}
