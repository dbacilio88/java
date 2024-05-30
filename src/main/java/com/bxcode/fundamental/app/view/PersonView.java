package com.bxcode.fundamental.app.view;

import com.bxcode.fundamental.app.entidad.TblPersona;
import com.bxcode.fundamental.app.io.Consola;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Objects;

@Log4j2
public class PersonView {
    private final Consola consola;

    public PersonView() {
        this.consola = new Consola();
    }

    /*una opción que seleccione*/
    public Integer getMenu() {
        Integer opc;
        do {
            opc = this.consola.getInteger(this.consola.getMenu());
        } while (opc == null || opc > 4 || opc < 0);//verdadera
        return opc;
    }

    public void listar(List<TblPersona> lista) {
        String line = "--------------------------------------------------";
        log.info(line);
        System.out.printf("| %-2s | %-7s | %-10s | %-7s | %-8s |%n", "ID", "Nombre", "Apellido", "Edad", "Dni");
        log.info(line);
        lista.forEach(persona -> System.out.printf("| %-2s | %-7s | %-10s | %-7d | %-8s |%n", persona.getId(), persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.getDni()));
        log.info(line);
    }

    public void create(TblPersona persona) {
        String nombre;
        String apellido;
        String dni;
        Integer edad;

        do {
            nombre = this.consola.getString("Ingrese el Nombre (max. 50): ");
        } while (nombre.isEmpty() || nombre.length() > 50);
        do {
            apellido = this.consola.getString("Ingrese el Apellido (max. 70): ");
        } while (apellido.isEmpty() || apellido.length() > 70);
        do {
            dni = this.consola.getString("Ingrese el Dni (8): ");
        } while (dni.length() != 8);
        do {
            edad = this.consola.getInteger("Ingrese la edad: ");
        } while (edad == null);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        persona.setEdad(edad);
    }

    public void update(TblPersona persona) {
        Integer opc;
        do {
            opc = this.consola.getInteger(mostrarDatos(persona).toString());
        } while (opc == null || opc > 4 || opc < 0);//verdadera

        switch (opc) {
            case 1:
                String nombre;

                do {
                    nombre = this.consola.getString("Ingrese el Nombre (max. 50): ");
                } while (nombre.isEmpty() || nombre.length() > 50);

                persona.setNombre(nombre);
                break;
            case 2:
                String apellido;

                do {
                    apellido = this.consola.getString("Ingrese el Apellido (max. 70): ");
                } while (apellido.isEmpty() || apellido.length() > 70);

                persona.setApellido(apellido);
                break;
            case 3:
                String dni;

                do {
                    dni = this.consola.getString("Ingrese el Dni (8): ");
                } while (dni.length() != 8);
                persona.setDni(dni);
                break;
            case 4:
                Integer edad;

                do {
                    edad = this.consola.getInteger("Ingrese la edad: ");
                } while (edad == null);
                persona.setEdad(edad);
                break;
            default:
                break;
        }

    }

    public Integer findByIdPerson(List<TblPersona> lista) {
        Integer id;

        do {
            lista.forEach(persona -> System.out.printf("| %-2s | %-7s | %-10s | %-7d | %-8s |%n", persona.getId(), persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.getDni()));

            id = consola.getInteger("\tId Persona: ");

        } while (id == null || !existeId(lista, id));

        return id;
    }

    private boolean existeId(List<TblPersona> personas, Integer id) {
        boolean existe = false;

        for (TblPersona p : personas) {
            if (Objects.equals(p.getId(), id)) {
                existe = true;
                break;
            }
        }

        return existe;
    }


    private StringBuilder mostrarDatos(TblPersona persona) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n[1]");
        builder.append(persona.getNombre());
        builder.append("\n[2]");
        builder.append(persona.getApellido());
        builder.append("\n[3]");
        builder.append(persona.getEdad());
        builder.append("\n[4]");
        builder.append(persona.getDni());
        builder.append("\n[0] Cancelar");
        builder.append("\n\t Elija una opción: ");
        return builder;
    }


}


