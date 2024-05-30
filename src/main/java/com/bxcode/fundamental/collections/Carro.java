package com.bxcode.fundamental.collections;

public class Carro {
    //pertenencia: this.
    //encapsulamiento: private, public, protected
    private String color;
    private int fab;

    //crear dos métodos: GET (obtener), SET (modificar)
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFab(int fab) {
        this.fab = fab;
    }

    public int getFab() {
        return this.fab;
    }

    public String toString() {
        return "color : " + this.color + " año fab " + this.fab;
    }

}
