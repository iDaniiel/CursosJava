package test;

import java.sql.*;
public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); //esta linea podria ser requerida
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next())
            {
                System.out.print("id Persona: " + resultado.getInt("id_persona") );
                System.out.print(" nombre: " + resultado.getString("nombre") );
                System.out.print(" apellido: " + resultado.getString("apellido") );
                System.out.print(" email: " + resultado.getString("email") );
                System.out.print(" telefono: " + resultado.getString("telefono") );
                System.out.print("\n");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
