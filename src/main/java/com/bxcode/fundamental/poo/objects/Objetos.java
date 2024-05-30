package com.bxcode.fundamental.poo.objects;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Objetos {

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria("");
        cb.consultarSaldo();
        cb.retirarDinero(5f);
        cb.consultarSaldo();
        cb.retirarDinero(12);
        cb.consultarSaldo();
        cb.depositarDinero(100f);
        cb.consultarSaldo();
        cb.setEmail("tra@gmail.com");
        reloj();
    }

    private static void reloj() {
        Reloj relojA = new Reloj();
        relojA.set(10, 25, 25);
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        relojA.incrementar();
        Reloj relojB = new Reloj();
        relojB.set(12, 40, 20);
        relojB.incrementar();
        relojB.incrementar();
    }
}
