package fundamental.basic.poo.Interfaz;

import java.util.Map;

public class Figura implements ICuadrado, ITriangulo, ICirculo {

    public Figura() {

    }

    @Override
    public void calcularAreaCuadrado(int lado) {
        double area = Math.pow(lado, 2);

        System.out.println("area cuadrado = " + area);
    }

    @Override
    public void calcularAreaTriangulo(int altura, int base) {
        int area = (altura * base) / 2;
        System.out.println("area triangulo = " + area);
    }

    @Override
    public void calcularAreaCirculo(int radio) {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("area circulo = " + area);
    }
}
