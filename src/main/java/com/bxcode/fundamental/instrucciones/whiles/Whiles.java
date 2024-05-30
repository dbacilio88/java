package com.bxcode.fundamental.instrucciones.whiles;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Whiles {

    public static void main(String[] args) {

        boolean close = true;

        int i = 0;

        //repite una instrucción hasta que la condición sea falsa, depender de la condición
        while (close) {
            log.info("count: {}", i);

            if (i == 100) {
                close = false;
            }
            i++;
        }

        do {
            log.info("i = {}", i);
        } while (true);


    }
}
