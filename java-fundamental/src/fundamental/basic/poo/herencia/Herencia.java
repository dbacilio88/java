package fundamental.basic.poo.herencia;

public class Herencia {
    public static void main(String[] args) {

        Gerente produccion = new Gerente();
        produccion.setNombre("Nombre A");
        produccion.setApellido("Apellido A");
        produccion.setEdad(35);
        produccion.setCarrera("Mecanica");

        Gerente construccion = new Gerente();
        construccion.setNombre("Nombre B");
        construccion.setApellido("Apellido B");
        construccion.setEdad(40);
        construccion.setCarrera("Ing Civil");

        Administrativo rrhh = new Administrativo();
        rrhh.setNombre("Eliseo");
        rrhh.setApellido("Juarez");
        rrhh.setEdad(40);
        rrhh.setCarrera("Administracion");

        Estudiante arq = new Estudiante();
        arq.setEdad(20);
        arq.setNombre("Jose");
        arq.setApellido("Ramos");
        arq.setCiclo("Octavo");


    }

    static void getPadre() {
        Padre padre = new Padre();
        padre.setApellido("Flores");
        padre.setFecha("18-02-1980");


        Hija hija = new Hija();
        hija.setApellido("Flores");
        hija.setFecha("19-01-2010");

        System.out.println(padre.getApellido());
        System.out.println(padre.getFecha());
        System.out.println(hija.getApellido());
        System.out.println(hija.getFecha());
    }
}
