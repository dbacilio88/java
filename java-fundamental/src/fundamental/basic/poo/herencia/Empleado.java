package fundamental.basic.poo.herencia;

public class Empleado extends Persona {
    private String carrera;
    private float bonificacion;
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
}
