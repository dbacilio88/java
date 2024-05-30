package com.bxcode.fundamental.poo.objects;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public void set(int h, int m, int s) {
        hora = h % 24;
        minuto = m % 60;
        segundo = s % 60;
    }

    public void incrementar() {
        segundo = (segundo + 1) % 60;
        if (segundo == 0) {
            minuto = (minuto + 1) & 60;
            if (minuto == 0) {
                hora = (hora + 1) % 24;
            }
        }
        print();
        getHora();
    }

    public String getHora() {
        return hora + ":" + minuto + ":" + segundo;
    }

    private void print() {
        log.info("Hola mundo");
    }

}
