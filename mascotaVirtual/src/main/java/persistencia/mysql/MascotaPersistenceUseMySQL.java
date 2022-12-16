package persistencia.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import modelos.Mascota;
import persistencia.IMascotaPersistemce;


public class MascotaPersistenceUseMySQL implements IMascotaPersistemce {
    MySQLConnection mySQLConnection;
    Connection connection;
    //constructor
    public MascotaPersistenceUseMySQL() throws SQLException {
        this.mySQLConnection=new MySQLConnection();
        this.connection= mySQLConnection.establecerConexion();
    }

    @Override
    public void guardar(Mascota mascota) {

    }

    @Override
    public Mascota getMascota(int id) {
        return null;
    }

    @Override
    public Mascota getMascota(String nombre) {
        return null;
    }

    @Override
    public List<Mascota> getAllMascotas() {
        return null;
    }

    @Override
    public void updateMascota(int id, Mascota mascota) {

    }

    @Override
    public void deleteMascota(int id) {

    }
}
