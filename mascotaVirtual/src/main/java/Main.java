import enumeradores.AlmacenamientoEnum;
import enumeradores.EntretenimientoEnum;
import modelos.DukeMascota;
import persistencia.mysql.MySQLConnection;
import persistencia.persistenceCollections.MascotaPersistenceUselist;
import utils.actas.RegistroCivilMascotas;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws SQLException {
        MascotaPersistenceUselist persistence=new MascotaPersistenceUselist();
        DukeMascota duke = new DukeMascota("Duke-Merlina","Leal");
        DukeMascota duke2 = new DukeMascota("Duke-Cordobes","Leal");
        DukeMascota duke3 = new DukeMascota("Duke-Porteño","Leal");
        DukeMascota duke4 = new DukeMascota("Duke-Santiagueño","Leal");
persistence.guardar(duke);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);
      //  for (Mascota mascota:persistence.getAllMascotas()){
     //       System.out.println(mascota);
      //  }
        System.out.println(duke);
        RegistroCivilMascotas.confeccionarActa(duke);
        duke.comer(AlmacenamientoEnum.POCHOCLOS);
        duke.comer(AlmacenamientoEnum.POCHOCLOS);
        duke.comer(AlmacenamientoEnum.POCHOCLOS);
        duke.comer(AlmacenamientoEnum.POCHOCLOS);
        duke.comer(AlmacenamientoEnum.POCHOCLOS);
       duke.comer(AlmacenamientoEnum.POCHOCLOS);
       duke.comer(AlmacenamientoEnum.POCHOCLOS);
        duke.comer(AlmacenamientoEnum.POCHOCLOS);
       duke.comer(AlmacenamientoEnum.POCHOCLOS);
       duke.comer(AlmacenamientoEnum.POCHOCLOS);
       RegistroCivilMascotas.confeccionarActa(duke);
        MySQLConnection conexion =new MySQLConnection();
        Connection connection= conexion.establecerConexion();
        conexion.cerrarConexion(connection);
    }
}