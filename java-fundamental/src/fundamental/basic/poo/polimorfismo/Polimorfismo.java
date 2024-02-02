package fundamental.basic.poo.polimorfismo;

import fundamental.basic.poo.herencia.*;

public class Polimorfismo {

    public static void main(String[] args) {
        //para que exista el polimorfismo, primero debe existir herencia
        Estudiante e1 = new Estudiante("David", "Garcia", 10, "Primero");
        System.out.println(e1.toString());
        Empleado emp = new Empleado("David", "Garcia", 10, "arquitecto", 50f);
        System.out.println(emp.toString());

        Persona p1 = new Empleado();
        Persona p2 = new Estudiante();
        Persona p3 = new Gerente();
        Persona p4 = new Administrativo();
    }

}
