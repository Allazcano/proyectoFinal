/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static Log.CrearLog.errorLog;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Contacto;

/**
 *
 * @author alexl
 */
public class ContactoDAO {
    

   Connection conexion;
    public ContactoDAO(){
     Conexion con=new Conexion();
     conexion=con.getConexion();
    }
        public List<Contacto> listarContacto(){
            PreparedStatement ps;
            ResultSet rs;
           List<Contacto> lista = new ArrayList();
 //realiza consulta a tabla contacto           
            try {
                ps=conexion.prepareStatement("SELECT * FROM contacto");
                rs = ps.executeQuery();
//almacena en variable datos de la consulta                
                while(rs.next()){
                int idContacto = rs.getInt ("idContacto");
                String nombre = rs.getString ("nombre");
                String correo = rs.getString ("correo");
                String mensaje = rs.getString ("mensaje");
//ingresa variables a clase contacto                     
                    Contacto contacto= new Contacto(idContacto, nombre, correo, mensaje);
                    
                    lista.add(contacto);
                                }
                return lista;
                
            } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
        }
        
        
        public boolean insertarContacto(Contacto contacto){
                   PreparedStatement ps;
                                 
//inserta datos a tabla contacto en base de datos
                   try {
                       ps=conexion.prepareStatement("INSERT INTO contacto (nombre,  correo, mensaje) VALUES(?,?,?)");
                       ps.setString(1, contacto.getNombre());
                       ps.setString(2, contacto.getCorreo());
                       ps.setString(3, contacto.getMensaje());
                       ps.execute();
                       return true;
                      
                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return false;
               }
               }
        
        
 //elimina datos de tabla contacto segun id       
         public boolean eliminarMensaje(int id){
                   PreparedStatement ps;
                                 

                   try {
                       ps=conexion.prepareStatement("DELETE FROM contacto  WHERE idContacto=?");
                       
                       ps.setInt(1, id);
                       ps.execute();
                       return true;
                      
                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return false;
               }
               }
    
}
