package com.bxcode.fundamental.app.controlador;


import com.bxcode.fundamental.app.entidad.TblPersona;
import com.bxcode.fundamental.app.repositorio.ITblPersonDao;
import com.bxcode.fundamental.app.repositorio.TblPersonDao;
import com.bxcode.fundamental.app.view.PersonView;
import lombok.extern.log4j.Log4j2;

import java.util.List;


@Log4j2
public class PersonController {


    public static void main(String[] args) {

        PersonView view = new PersonView();
        ITblPersonDao repositorio = new TblPersonDao();

        boolean noFinalizar = true;

        while (noFinalizar) {
            switch (view.getMenu()) {


                case 1:
                    log.info("listar personas");
                    List<TblPersona> lista = repositorio.read();
                    view.listar(lista);
                    break;
                case 2:
                    TblPersona persona = new TblPersona();
                    view.create(persona);
                    String insert = repositorio.create(persona);
                    log.info(insert);
                    break;
                case 3:
                    log.info("actualizar persona");
                    List<TblPersona> listaActualizar = repositorio.read();
                    int id = view.findByIdPerson(listaActualizar);
                    TblPersona update = repositorio.readId(id);
                    view.update(update);
                    String updated = repositorio.update(update);
                    log.info(updated);
                    break;
                case 4:
                    log.info("eliminar persona");
                    List<TblPersona> listaEliminar = repositorio.read();
                    int idEliminar = view.findByIdPerson(listaEliminar);
                    String eliminado = repositorio.delete(idEliminar);
                    log.info(eliminado);
                    break;

                case 0:
                    noFinalizar = false;
                    log.info("Saliendo del programa");
                    break;
                default:
                    break;
            }
        }
    }
}