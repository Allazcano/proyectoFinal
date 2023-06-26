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
import modelo.Usuario;


/**
 *
 * @author alexl
 */
public class UsuarioDAO {
    Connection conexion;
    public UsuarioDAO(){
        //instacia a clase conexion 
     Conexion con=new Conexion();
     conexion=con.getConexion();
    }

        public List<Usuario> listarUsuario(){
            PreparedStatement ps;
            ResultSet rs;
           List<Usuario> lista = new ArrayList();
 
//realiza consulta a tabla usuarios y rol de la base de datos           
            try {
                ps=conexion.prepareStatement("SELECT u.idUsuario, u.nombreUsuario, u.contraseña, u.correo, u.rol_idrol, r.tipo  FROM usuario u JOIN rol r WHERE u.rol_idrol=r.idrol");
                rs = ps.executeQuery();
 //almacena en variables los datos obtenidos               
                while(rs.next()){
                int idUsuario = rs.getInt ("idUsuario");
                String nombreUsuario = rs.getString ("nombreUsuario");
                String contraseña = rs.getString ("contraseña");
                String correo = rs.getString ("correo");
                int rol_idrol = rs.getInt ("rol_idrol");
                String tipo = rs.getString ("tipo");
                
 //ingresa variables a la clase usuario                    
                    Usuario usuario= new Usuario(idUsuario, nombreUsuario, contraseña, correo, rol_idrol,tipo);
                    
                    lista.add(usuario);
                                }
                return lista;
                
            } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
        }
//realiza consulta a tabla usuarios y rol de la base de datos ordenados por nombre
        public List<Usuario> listarUsuarioPorNombre(){
            PreparedStatement ps;
            ResultSet rs;
            List<Usuario> lista = new ArrayList();
//realiza consulta a tabla usuarios y rol de la base de datos                
            try {
                ps=conexion.prepareStatement("SELECT idUsuario,nombreUsuario, contraseña, correo, rol_idrol, tipo  FROM usuario JOIN rol WHERE rol_idrol=idrol ORDER BY nombreUsuario");
                rs = ps.executeQuery();
  //almacena en variables los datos obtenidos                
                while(rs.next()){
                int idUsuario = rs.getInt ("idUsuario");
                String nombreUsuario = rs.getString ("nombreUsuario");
                String contraseña = rs.getString ("contraseña");
                String correo = rs.getString ("correo");
                int rol_idrol = rs.getInt ("rol_idrol");
                String tipo = rs.getString ("tipo");
//ingresa variables a la clase usuario                      
                  Usuario usuario= new Usuario(idUsuario, nombreUsuario, contraseña, correo, rol_idrol,tipo);
                    
                    lista.add(usuario);
                                }
                return lista;
                
            } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
        }
        
//realiza consulta a tabla usuarios y rol de la base de datos ordenados por id
        public List<Usuario> listarUsuarioPorId(){
            PreparedStatement ps;
            ResultSet rs;
            List<Usuario> lista = new ArrayList();
 //realiza consulta a tabla usuarios y rol de la base de datos               
            try {
                ps=conexion.prepareStatement("SELECT idUsuario,nombreUsuario, contraseña, correo, rol_idrol, tipo  FROM usuario JOIN rol WHERE rol_idrol=idrol ORDER BY idUsuario");
                rs = ps.executeQuery();
 //almacena en variables los datos obtenidos           
                while(rs.next()){
                int idUsuario = rs.getInt ("idUsuario");
                String nombreUsuario = rs.getString ("nombreUsuario");
                String contraseña = rs.getString ("contraseña");
                String correo = rs.getString ("correo");
                int rol_idrol = rs.getInt ("rol_idrol");
                String tipo = rs.getString ("tipo");
//ingresa variables a la clase usuario                      
                  Usuario usuario= new Usuario(idUsuario, nombreUsuario, contraseña, correo, rol_idrol,tipo);
                    
                    lista.add(usuario);
                                }
                return lista;
                
            } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
        }
//realiza consulta a tabla usuarios y rol de la base de datos ordenados por rol
        public List<Usuario> listarUsuarioPorRol(){
            PreparedStatement ps;
            ResultSet rs;
            List<Usuario> lista = new ArrayList();
//realiza consulta a tabla usuarios y rol de la base de datos                
            try {
                ps=conexion.prepareStatement("SELECT idUsuario,nombreUsuario, contraseña, correo, rol_idrol, tipo  FROM usuario JOIN rol WHERE rol_idrol=idrol ORDER BY rol_idrol");
                rs = ps.executeQuery();
  //almacena en variables los datos obtenidos              
                while(rs.next()){
                int idUsuario = rs.getInt ("idUsuario");
                String nombreUsuario = rs.getString ("nombreUsuario");
                String contraseña = rs.getString ("contraseña");
                String correo = rs.getString ("correo");
                int rol_idrol = rs.getInt ("rol_idrol");
                String tipo = rs.getString ("tipo");
 //ingresa variables a la clase usuario                     
                  Usuario usuario= new Usuario(idUsuario, nombreUsuario, contraseña, correo, rol_idrol,tipo);
                    
                    lista.add(usuario);
                                }
                return lista;
                
            } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
        }
//mostrar usuario especifico segun id 
        public Usuario mostrarUsuario(int id){
                   PreparedStatement ps;
                   ResultSet rs;
                   Usuario usuario=null;
                  
                 
//realiza consulta a base de datos de tabla usuario segun id
                   try {
                       ps=conexion.prepareStatement("SELECT idUsuario,nombreUsuario,contraseña,correo,rol_idrol FROM Usuario WHERE idusuario=?");
                       ps.setInt(1, id);
                       rs=ps.executeQuery();
 //almacena en variables los datos obtenidos 
                       while(rs.next()){
                       int idUsuario = rs.getInt ("idUsuario");
                       String nombreUsuario = rs.getString ("nombreUsuario");
                       String contraseña = rs.getString ("contraseña");
                       String correo = rs.getString ("correo");
                       int rol_idrol = rs.getInt ("rol_idrol");
//ingresa variables a la clase usuario   
                       usuario= new Usuario(idUsuario, nombreUsuario, contraseña, correo, rol_idrol,null);

                                       }
                       return usuario;

                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return null;
               }
               }
//inserta datos de en tabla usuario de base de datos
        public boolean insertarUsuario(Usuario usuario){
                   PreparedStatement ps;
                                 
//realiza insert en base de datos con los datos obtenidos desde clase usuario
                   try {
                       ps=conexion.prepareStatement("INSERT INTO usuario (nombreUsuario, contraseña, correo, rol_idrol) VALUES(?,?,?,?)");
                       ps.setString(1, usuario.getNombreUsuario());
                       ps.setString(2, usuario.getContraseña());
                       ps.setString(3, usuario.getCorreo());
                       ps.setInt(4, usuario.getRol_idrol());
                       ps.execute();
                       return true;
                      
                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return false;
               }
               }
//actualiza datos de tabla usuario
        public boolean actualizarUsuario(Usuario usuario){
                   PreparedStatement ps;
                                 
//realiza update en tabla usuario con datos obtenidos desde la clase usuario
                   try {
                       ps=conexion.prepareStatement("UPDATE usuario  SET nombreUsuario=?, contraseña=?, correo=?, rol_idrol=? WHERE idUsuario=?");
                       ps.setString(1, usuario.getNombreUsuario());
                       ps.setString(2, usuario.getContraseña());
                       ps.setString(3, usuario.getCorreo());
                       ps.setInt(4, usuario.getRol_idrol());
                       ps.setInt(5, usuario.getIdUsuario());
                       ps.execute();
                       return true;
                      
                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return false;
               }
               }
//elimina usuario segun id  
         public boolean eliminarUsuario(int id){
                   PreparedStatement ps;
                                 

                   try {
                       ps=conexion.prepareStatement("DELETE FROM usuario  WHERE idUsuario=?");
                       
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
