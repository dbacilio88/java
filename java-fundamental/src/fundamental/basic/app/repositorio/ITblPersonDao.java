package fundamental.basic.app.repositorio;

import fundamental.basic.app.entidad.TblPersona;

import java.util.List;

//CRUD
//DAO=DATA ACCESS OBJECT
public interface ITblPersonDao {
    String create(TblPersona persona);

    /**
     * SELECT * FROM TBL_PERSONA;
     */
    List<TblPersona> read();

    /*
     * SELECT * FROM TBL_PERSONA where PE_ID = 1;
     */
    TblPersona readId(int id);

    String update(TblPersona persona);

    String delete(int id);

    String getMessage();
}
