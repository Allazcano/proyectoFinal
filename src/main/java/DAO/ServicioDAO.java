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
import modelo.Servicios;

/**
 *
 * @author alexl
 */
public class ServicioDAO {
//conexion a base de datos
    Connection conexion;

    public ServicioDAO() {
        //instacia a la clase conexion que establece los parametros de conexion a base de datos
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    public List<Servicios> listarServicios() {
        PreparedStatement ps;
        ResultSet rs;
        List<Servicios> lista = new ArrayList();
        
//consulta a base de datos de tabla servicios, profesional y cliente
        try {
            ps = conexion.prepareStatement("SELECT idServicio, servicio, fecha, hora, duracion, lugar, s.idprofesional, s.idCliente,\n"
                    + "p.idprofesional, p.nombre, p.rut, p.telefono, p.direccion, p.comuna, p.idusuario,\n"
                    + "c.idcliente, c.nombre, c.rut, c.telefono, c.direccion, c.comuna, c.rubro, c.idusuario\n"
                    + "FROM servicios s LEFT JOIN profesional p ON(s.idprofesional=p.idprofesional)  LEFT JOIN clientes c ON(s.idCliente=c.idcliente)   ");
            rs = ps.executeQuery();
//se almacena datos desde base de datos y se asignan a variables
            while (rs.next()) {
                int idServicio = rs.getInt("idServicio");
                String servicio = rs.getString("servicio");
                String fecha = rs.getString("fecha");
                String hora = rs.getString("hora");
                int duracion = rs.getInt("duracion");
                String lugar = rs.getString("lugar");
                int idProfesional = rs.getInt("s.idprofesional");
                int idCliente = rs.getInt("s.idCliente");
                String nombrePro = rs.getString("p.nombre");
                String nombreCliente = rs.getString("c.nombre");
                
//se ingresan variables a instacia de clase servicio
                Servicios servicios = new Servicios(idServicio, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente, 0, nombrePro, nombreCliente);

                lista.add(servicios);
            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
    }
//consulta a base de datos de tabla servicios, profesional y cliente segun id
    public List<Servicios> listarServiciosPorProfesional(int id) {
        PreparedStatement ps;
        ResultSet rs;
        List<Servicios> lista = new ArrayList();

        try {
             ps = conexion.prepareStatement("SELECT idServicio, servicio, fecha, hora, duracion, lugar, s.idprofesional, s.idCliente,\n"
                    + "p.idprofesional, p.nombre, p.rut, p.telefono, p.direccion, p.comuna, p.idusuario,\n"
                    + "c.idcliente, c.nombre, c.rut, c.telefono, c.direccion, c.comuna, c.rubro, c.idusuario\n"
                    + "FROM servicios s LEFT JOIN profesional p ON(s.idprofesional=p.idprofesional)  LEFT JOIN clientes c ON(s.idCliente=c.idcliente) WHERE  p.idprofesional = ?   "); 
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                int idServicio = rs.getInt("idServicio");
                String servicio = rs.getString("servicio");
                String fecha = rs.getString("fecha");
                String hora = rs.getString("hora");
                int duracion = rs.getInt("duracion");
                String lugar = rs.getString("lugar");
                int idProfesional = rs.getInt("idprofesional");
                int idCliente = rs.getInt("idCliente");
                String nombrePro = rs.getString("p.nombre");
                String nombreCliente = rs.getString("c.nombre");

                Servicios servicios = new Servicios(idServicio, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente, 0, nombrePro, nombreCliente);

                lista.add(servicios);
            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
    }
//consulta a base de datos realizando agrupacion y conteo de servicio de la tabla servicios
    public List<Servicios> agruparServicios() {
        PreparedStatement ps;
        ResultSet rs;
        List<Servicios> lista = new ArrayList();

        try {
            ps = conexion.prepareStatement("SELECT servicio, COUNT(*) AS realizadas FROM servicios GROUP BY servicio; ");
            rs = ps.executeQuery();

            while (rs.next()) {

                String servicio = rs.getString("servicio");
                int realizadas = rs.getInt("realizadas");

                Servicios servicios = new Servicios(0, servicio, null, null, 0, null, 0, 0, realizadas,null,null);

                lista.add(servicios);
            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
    }
//mostrar servicio especifico segun id
    public Servicios mostrarServicio(int id) {
        PreparedStatement ps;
        ResultSet rs;
        Servicios servicios = null;

        try {
            ps = conexion.prepareStatement("SELECT idServicio, servicio, fecha, hora, duracion, lugar, s.idprofesional, s.idCliente,\n"
                    + "p.idprofesional, p.nombre, p.rut, p.telefono, p.direccion, p.comuna, p.idusuario,\n"
                    + "c.idcliente, c.nombre, c.rut, c.telefono, c.direccion, c.comuna, c.rubro, c.idusuario\n"
                    + "FROM servicios s LEFT JOIN profesional p ON(s.idprofesional=p.idprofesional)  LEFT JOIN clientes c ON(s.idCliente=c.idcliente) WHERE idServicio=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                int idServicio = rs.getInt("idServicio");
                String servicio = rs.getString("servicio");
                String fecha = rs.getString("fecha");
                String hora = rs.getString("hora");
                int duracion = rs.getInt("duracion");
                String lugar = rs.getString("lugar");
                int idProfesional = rs.getInt("idprofesional");
                int idCliente = rs.getInt("idCliente");
                String nombrePro = rs.getString("p.nombre");
                String nombreCliente = rs.getString("c.nombre");

               servicios = new Servicios(idServicio, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente, 0, nombrePro, nombreCliente);

            }
            return servicios;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return null;
        }
    }
//insertar un nuevo servicio a tabla servicios de la base de datos
    public boolean insertarServicio(Servicios servicios) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO servicios( servicio, fecha, hora, duracion, lugar, idprofesional, idCliente) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, servicios.getServicio());
            ps.setString(2, servicios.getFecha());
            ps.setString(3, servicios.getHora());
            ps.setInt(4, servicios.getDuracion());
            ps.setString(5, servicios.getLugar());
            ps.setInt(6, servicios.getIdProfesional());
            ps.setInt(7, servicios.getIdCliente());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return false;
        }
    }
//actualiza datos de la tabla servicios en base de datos
    public boolean actualizarServicio(Servicios servicios) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE servicios  SET servicio=?, fecha=?, hora=?, duracion=?, lugar=?, idprofesional=?, idCliente=? WHERE idServicio=?;");

            ps.setString(1, servicios.getServicio());
            ps.setString(2, servicios.getFecha());
            ps.setString(3, servicios.getHora());
            ps.setInt(4, servicios.getDuracion());
            ps.setString(5, servicios.getLugar());
            ps.setInt(6, servicios.getIdProfesional());
            ps.setInt(7, servicios.getIdCliente());
            ps.setInt(8, servicios.getIdServicio());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return false;
        }
    }

    //elimina servicio especifico segun id
    public boolean eliminarServicio(int idServicio) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM servicios  WHERE idServicio=?");
            ps.setInt(1, idServicio);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            errorLog(e.toString());
            return false;
        }
    }
}
