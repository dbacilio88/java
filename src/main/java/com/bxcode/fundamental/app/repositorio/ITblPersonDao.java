package com.bxcode.fundamental.app.repositorio;

import com.bxcode.fundamental.app.entidad.TblPersona;

import java.util.List;

//CRUD
//DAO=DATA ACCESS OBJECT
public interface ITblPersonDao {
    String create(TblPersona persona);

    List<TblPersona> read();

    TblPersona readId(int id);

    String update(TblPersona persona);

    String delete(int id);

    String getMessage();
}
