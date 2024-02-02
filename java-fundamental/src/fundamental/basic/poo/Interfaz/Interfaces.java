package fundamental.basic.poo.Interfaz;

public class Interfaces {

    public static void main(String[] args) {
        ICuadrado cuadrado = new Figura();
        cuadrado.calcularAreaCuadrado(30);

        ITriangulo triangulo = new Figura();
        triangulo.calcularAreaTriangulo(20, 5);

        ICirculo circulo = new Figura();
        circulo.calcularAreaCirculo(8);

    }
}
