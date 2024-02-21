package fundamental.basic.app.controlador;

import fundamental.basic.app.entidad.TblPersona;
import fundamental.basic.app.io.Consola;
import fundamental.basic.app.repositorio.ITblPersonDao;
import fundamental.basic.app.repositorio.TblPersonDao;
import fundamental.basic.app.view.PersonView;

import java.util.List;

public class PersonController {


    public static void main(String[] args) {
        Consola consola = new Consola();

        PersonView view = new PersonView(consola);
        ITblPersonDao repositorio = new TblPersonDao();

        boolean noFinalizar = true;

        while (noFinalizar) {

            //System.out.println("Menu " + view.getMenu());
            // opciones:
            switch (view.getMenu()) {


                case 1:
                    System.out.println("listar personas");
                    List<TblPersona> lista = repositorio.read();
                    view.listar(lista);
                    break;
                case 2:
                    TblPersona persona = new TblPersona();
                    view.create(persona); // cargar la información de la persona
                    String insert = repositorio.create(persona);
                    System.out.println(insert);
                    break;
                case 3:
                    System.out.println("actualizar persona");
                    List<TblPersona> listaActualizar = repositorio.read();
                    int id = view.findByIdPerson(listaActualizar);
                    TblPersona update = repositorio.readId(id);
                    view.update(update);
                    String updated = repositorio.update(update);
                    System.out.println(updated);
                    break;
                case 4:
                    System.out.println("eliminar persona");
                    List<TblPersona> listaEliminar = repositorio.read();
                    int idEliminar = view.findByIdPerson(listaEliminar);
                    String eliminado = repositorio.delete(idEliminar);
                    System.out.println(eliminado);
                    break;

                case 0:
                    noFinalizar = false;
                    System.out.println("Saliendo del programa");
                    break;
            }

        }


    }


}


