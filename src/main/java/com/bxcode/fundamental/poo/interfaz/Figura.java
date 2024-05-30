package com.bxcode.fundamental.poo.interfaz;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Figura implements ICuadrado, ITriangulo, ICirculo {

    @Override
    public void calcularAreaCuadrado(int lado) {
        double area = Math.pow(lado, 2);

        log.info("area cuadrado = {}", area);
    }

    @Override
    public void calcularAreaTriangulo(int altura, int base) {
        int area = (altura * base) / 2;
        log.info("area triangulo = {}", area);
    }

    @Override
    public void calcularAreaCirculo(int radio) {
        double area = Math.PI * Math.pow(radio, 2);
        log.info("area circulo = {}", area);
    }
}
