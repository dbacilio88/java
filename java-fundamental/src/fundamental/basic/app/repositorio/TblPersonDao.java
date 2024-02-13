package fundamental.basic.app.repositorio;

import fundamental.basic.app.db.Conectar;
import fundamental.basic.app.entidad.TblPersona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TblPersonDao implements ITblPersonDao {

    private final Conectar conectar;
    private String message;

    public TblPersonDao() {
        this.conectar = new Conectar();
    }


    @Override
    public String create(TblPersona persona) {
        String psql = "INSERT INTO TBL_PERSONA(PE_ID, PE_NOMBRE, PE_APELLIDO, PE_EDAD, PE_DNI) VALUES (nextval('TBL_PERSONA_SEQ'),?,?,?,?)";
        try (Connection connection = this.conectar.getConnection();
             PreparedStatement pst = connection.prepareStatement(psql);
        ) {
            pst.setString(1, persona.getNombre());
            pst.setString(2, persona.getApellido());
            pst.setInt(3, persona.getEdad());
            pst.setString(4, persona.getDni());


            int rs = pst.executeUpdate();

            if (rs == 0) {
                message = "No se registro";
            } else {
                message = "Se registro con éxito";
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<TblPersona> read() {
        List<TblPersona> lista = null;
        String psql = "SELECT PE_ID,PE_NOMBRE,PE_APELLIDO,PE_EDAD,PE_DNI FROM TBL_PERSONA;";
        try (Connection connection = this.conectar.getConnection();
             PreparedStatement pst = connection.prepareStatement(psql);
             ResultSet rs = pst.executeQuery();
        ) {
            lista = new ArrayList<>();
            while (rs.next()) {
                TblPersona persona = new TblPersona();
                persona.setId(rs.getInt("PE_ID"));
                persona.setNombre(rs.getString("PE_NOMBRE"));
                persona.setApellido(rs.getString("PE_APELLIDO"));
                persona.setEdad(rs.getInt("PE_EDAD"));
                persona.setDni(rs.getString("PE_DNI"));
                lista.add(persona);
            }
        } catch (SQLException e) {
            message = e.getMessage();
        }

        return lista;
    }

    @Override
    public TblPersona readId(int id) {
        TblPersona persona = null;
        String psql = "SELECT PE_ID,PE_NOMBRE,PE_APELLIDO,PE_EDAD,PE_DNI FROM TBL_PERSONA WHERE PE_ID = ?;";
        try (Connection connection = this.conectar.getConnection();
             PreparedStatement pst = connection.prepareStatement(psql)) {
            pst.setInt(1, id);
            try {
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    persona = new TblPersona();
                    persona.setId(rs.getInt("PE_ID"));
                    persona.setNombre(rs.getString("PE_NOMBRE"));
                    persona.setApellido(rs.getString("PE_APELLIDO"));
                    persona.setEdad(rs.getInt("PE_EDAD"));
                    persona.setDni(rs.getString("PE_DNI"));
                }
            } catch (SQLException e) {

                message = e.getMessage();
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return persona;
    }

    @Override
    public String update(TblPersona persona) {
        String psql = "UPDATE TBL_PERSONA SET PE_NOMBRE=?, PE_APELLIDO=?, PE_EDAD=?, PE_DNI=? WHERE PE_ID = ?;";
        try (Connection connection = this.conectar.getConnection();
             PreparedStatement pst = connection.prepareStatement(psql);
        ) {
            pst.setString(1, persona.getNombre());
            pst.setString(2, persona.getApellido());
            pst.setInt(3, persona.getEdad());
            pst.setString(4, persona.getDni());
            pst.setInt(5, persona.getId());

            int rs = pst.executeUpdate();

            if (rs == 0) {
                message = "No se actualizo";
            } else {
                message = "Se actualizo con éxito";
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public String delete(int id) {
        String psql = "DELETE FROM TBL_PERSONA WHERE PE_ID = ?;";
        try (Connection connection = this.conectar.getConnection();
             PreparedStatement pst = connection.prepareStatement(psql);
        ) {
            pst.setInt(1, id);
            int rs = pst.executeUpdate();

            if (rs == 0) {
                message = "No se actualizo";
            } else {
                message = "Se actualizo con éxito";
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}


