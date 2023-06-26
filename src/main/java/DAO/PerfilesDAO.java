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
import modelo.PerfilCliente;
import modelo.PerfilPro;


/**
 *
 * @author alexl
 */
public class PerfilesDAO {
    Connection conexion;
    public PerfilesDAO(){
     Conexion con=new Conexion();
     conexion=con.getConexion();
    }
      
          public List<PerfilPro> listarPerfilPro() {
        PreparedStatement ps;
        ResultSet rs;
        List<PerfilPro> listaP = new ArrayList();
        
//consulta a base de datos de tabla profesional
        try {
            ps = conexion.prepareStatement("SELECT idprofesional, nombre, rut, telefono, direccion, comuna, idusuario FROM profesional ORDER BY nombre");
            rs = ps.executeQuery();
//se almacena datos desde base de datos y se asignan a variables
            while (rs.next()) {
                int idprofesional = rs.getInt("idprofesional");
                String nombre = rs.getString("nombre");
                String rut = rs.getString("rut");
                int telefono = rs.getInt("telefono");
                String direccion = rs.getString("direccion");
                String comuna = rs.getString("comuna");
                int idusuario = rs.getInt("idusuario");
                
                
//se ingresan variables a instacia de clase perfilPro
                PerfilPro perfilPro = new PerfilPro(idprofesional, nombre, rut, telefono, direccion, comuna, idusuario);

                listaP.add(perfilPro);
            }
            return listaP;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
    }
        public PerfilPro mostrarPerfilPro(int id){
                   PreparedStatement ps;
                   ResultSet rs;
                   PerfilPro perfil=null;
                  
                 

                   try {
                       ps=conexion.prepareStatement("SELECT idprofesional, nombre, rut, telefono, direccion, comuna, idusuario FROM profesional WHERE idusuario=?");
                       ps.setInt(1, id);
                       rs=ps.executeQuery();

                       while(rs.next()){
                       
                        int idprofesional = rs.getInt ("idprofesional");
                        String nombre = rs.getString ("nombre");
                        String rut = rs.getString ("rut");
                        int telefono = rs.getInt ("telefono");
                        String direccion = rs.getString ("direccion");
                        String comuna = rs.getString ("comuna");
                        int idusuario = rs.getInt ("idusuario");
                       

                       perfil= new PerfilPro( idprofesional, nombre, rut, telefono, direccion, comuna, idusuario);

                                       }
                       return perfil;

                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return null;
               }
               }
        
         public List<PerfilCliente> listarPerfilCliente() {
        PreparedStatement ps;
        ResultSet rs;
        List<PerfilCliente> listaC = new ArrayList();
        
//consulta a base de datos de tabla clientes
        try {
            ps = conexion.prepareStatement("SELECT idCliente, nombre, rut, telefono, direccion, comuna, rubro, idusuario FROM clientes");
            rs = ps.executeQuery();
//se almacena datos desde base de datos y se asignan a variables
            while (rs.next()) {
                int idCliente = rs.getInt("idCliente");
                String nombre = rs.getString("nombre");
                String rut = rs.getString("rut");
                int telefono = rs.getInt("telefono");
                String direccion = rs.getString("direccion");
                String comuna = rs.getString("comuna");
                String rubro = rs.getString("rubro");
                int idusuario = rs.getInt("idusuario");
                
                
//se ingresan variables a instacia de clase perfilCliente
                PerfilCliente perfilCliente = new PerfilCliente(idCliente, nombre, rut, telefono, direccion, comuna, rubro,idusuario);

                listaC.add(perfilCliente);
            }
            return listaC;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
    }
        
        public PerfilCliente mostrarPerfilCliente(int id){
                   PreparedStatement ps;
                   ResultSet rs;
                   PerfilCliente perfil=null;
                  
                 

                   try {
                       ps=conexion.prepareStatement("SELECT idCliente, nombre, rut, telefono, direccion, comuna, rubro,idusuario FROM clientes WHERE idusuario=?");
                       ps.setInt(1, id);
                       rs=ps.executeQuery();

                       while(rs.next()){
                       
                        int idCliente = rs.getInt ("idCliente");
                        String nombre = rs.getString ("nombre");
                        String rut = rs.getString ("rut");
                        int telefono = rs.getInt ("telefono");
                        String direccion = rs.getString ("direccion");
                        String comuna = rs.getString ("comuna");
                        String rubro = rs.getString ("rubro");
                        int idusuario = rs.getInt ("idusuario");
                       

                       perfil= new PerfilCliente( idCliente, nombre, rut, telefono, direccion, comuna, rubro, idusuario);

                                       }
                       return perfil;

                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return null;
               }
               }
        
        public boolean insertarPerfilPro(PerfilPro perfil){
                   PreparedStatement ps;
                     
                   try {
                       ps=conexion.prepareStatement("INSERT INTO profesional( nombre, rut, telefono, direccion, comuna, idusuario) VALUES (?,?,?,?,?,?)");
                       ps.setString(1, perfil.getNombre());
                       ps.setString(2, perfil.getRut());
                       ps.setInt(3, perfil.getTelefono());
                       ps.setString(4, perfil.getDireccion());
                       ps.setString(5, perfil.getComuna());
                       ps.setInt(6, perfil.getIdUsuario());
                       ps.execute();
                        return true;
                     
                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                      return false;
                        }
                            }
        
        
        public boolean actualizarPerfilPro(PerfilPro perfil){
                   PreparedStatement ps;
                                 

                   try {
                       ps=conexion.prepareStatement("UPDATE profesional  SET nombre=?, rut=?, telefono=?, direccion=?, comuna=?, WHERE idprofesional=?;");
                       
                       ps.setString(1, perfil.getNombre());
                       ps.setString(2, perfil.getRut());
                       ps.setInt(3, perfil.getTelefono());
                       ps.setString(4, perfil.getDireccion());
                       ps.setString(5, perfil.getComuna());
                       ps.setInt(6, perfil.getIdprofesional());
                       ps.execute();
                       return true;
                      
                   } catch (SQLException e) {
                   System.out.println(e.toString());
                   errorLog(e.toString());
                   return false;
               }
               }
        
        

}

