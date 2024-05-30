package com.bxcode.fundamental.poo.herencia;

public class Empleado extends Persona {
    private String carrera;
    private float bonificacion;

    public Empleado(){
        super();
    }
    public Empleado(String nombre, String apellido, int edad, String carrera, float bonificacion) {
        super(nombre,apellido,edad);
        this.carrera = carrera;
        this.bonificacion = bonificacion;
    }
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMi carrera es: " + this.carrera
                + "\nMi bonificación es: " + this.bonificacion;
    }
}
