package persistencia.mysql;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class MySQLConnection {
    final String URL ="jdbc:mysql://localhost:3306/";
    final String BD="dukeb";
    final String USERNAME="root";
    final String PASSWORD="";
    Connection connection;
    //metodos
    public Connection establecerConexion(){
        try {
            connection= DriverManager.getConnection(URL+BD,USERNAME,PASSWORD);
            System.out.println("Conexion con base de datos "+BD+" ha sido abierta");
            //crea la tabla de la base de datos solo se puede hacer una vez
            //String sql = "CREATE TABLE dukeb (id INTEGER PRIMARY KEY AUTO_INCREMENT,"+
           // "mascota VARCHAR(255), propietario VARCHAR(255), fecha_nacimiento DATE)";
           //  PreparedStatement stmt = connection.prepareStatement(sql);
           //  stmt.execute();
           // stmt.close();
//insetar datos en la base
           // String sqlInsert="INSERT INTO dukeb (nombre,apellido,fecha_nacimiento VALUES (?,?,?)";
            //creamos el objeto para insertar los datos
     //       PreparedStatement stmtInsert = connection.prepareStatement(sqlInsert);
      // stmtInsert.setString(1,"Merlina");
      // stmtInsert.setString(2,"Leal");
       //stmtInsert.setDate(3, Date.valueOf("1892-09-20"));
        //   stmtInsert.executeUpdate();
        //    stmtInsert.close();
// borrar base de dato no aconsejable
         //   String deleteSQL = "DELETE FROM dukeb WHERE id=?";
           // PreparedStatement stmtDelete=connection.prepareStatement(stmtDelete);
        //deleteSQL.setInt(1,1);
            //deleteSQL.executeUpdate();
            //setDelete.close();

        }catch (SQLException e){
            System.out.println("No se pudo establecer la conexion con la base de datos");
            e.printStackTrace();
        }
        return this.connection;
    }
    public void cerrarConexion(Connection connection){
        try {
            connection.close();
            System.out.println("Conexion con base de datos "+BD+" ha sido cerrada");
        }catch (SQLException e){
            System.out.println("No se ha podido cerrar la coneccion con la base de datos");
            e.printStackTrace();
        }
    }
    public PreparedStatement enviarConsulta(Connection connection,String consultaSQL){
        try {
            return connection.prepareStatement(consultaSQL);
        }catch (SQLException e){
            System.out.println("No se ha podido generar el objeto PrepareStatement");
            e.printStackTrace();
        }
        return null;
    }

    public Connection getConnection() {
        return connection;
    }
}
