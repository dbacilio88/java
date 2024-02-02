package fundamental.basic.poo.herencia;

public class Estudiante extends Persona {
    private String ciclo;

    public Estudiante() {
        super();
    }

    public Estudiante(String ciclo) {
        super();
        this.ciclo = ciclo;
    }

    public Estudiante(String nombre, String apellido, int edad, String ciclo) {
        super(nombre,apellido,edad);
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {

        String mensaje = super.toString() +
                "\nMi ciclo es: " + this.ciclo;
        return mensaje;
    }
}
