/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.ClassNotFoundException;


/**
 *
 * @author alexl
 */
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ruta de conexion a base de datos, nombre de BD, usuario, contraseña
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
            return conexion;
        } catch (SQLException e) {
            System.out.println(e.toString());
             return null;
        
        }  catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       
    }
   
}
