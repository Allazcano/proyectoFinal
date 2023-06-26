/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;


import DAO.PerfilesDAO;
import DAO.ServicioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.PerfilCliente;
import modelo.PerfilPro;
import modelo.Servicios;

/**
 *
 * @author alexl
 */
public class ServicioControlador extends HttpServlet {

//controlador de los servicios CRUD    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServicioDAO servicioDAO=new ServicioDAO();
       PerfilesDAO perfilesDAO=new PerfilesDAO();
        String accion;
        RequestDispatcher dispatcher=null;
        
        accion = request.getParameter("accion");

//muestra listado de servicios para la vista administrador
        if(accion==null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("Servicios/AdministrarServicio.jsp");
            List<Servicios> listaServicio = servicioDAO.listarServicios();
            request.setAttribute("lista", listaServicio);
             List<PerfilPro> listaPro = perfilesDAO.listarPerfilPro();
            request.setAttribute("listaP", listaPro);
            List<PerfilCliente> listaCliente = perfilesDAO.listarPerfilCliente();
            request.setAttribute("listaC", listaCliente);
           
            
//muestra listado de servicios para la vista profesional segun id de la sesion 
         } else if (accion.equals("PorProfesional")) {    
            dispatcher = request.getRequestDispatcher("Vistas/VistaPro.jsp");
            int id = Integer.parseInt(request.getParameter("idP"));
            List<Servicios> listaServicio = servicioDAO.listarServiciosPorProfesional(id);
            request.setAttribute("lista", listaServicio);
            List<PerfilCliente> listaCliente = perfilesDAO.listarPerfilCliente();
            request.setAttribute("listaC", listaCliente);
            
 //agrupa por tipo servicios listados para la vista administrador  
        } else if (accion.equals("agrupar")) {
            dispatcher = request.getRequestDispatcher("Servicios/ServiciosAgupados.jsp");
            List<Servicios> listaServicio = servicioDAO.agruparServicios();
            request.setAttribute("lista", listaServicio);
            
//muestra formulario para ingresar nuevo servicio             
        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Servicios/NuevoServicio.jsp");
            
            
           
//inserta los datos del formulario de servicio nuevo a base de datos   
        } else if (accion.equals("insertar")) {
            String servicio = request.getParameter("servicio");
            String fecha = request.getParameter("fecha");
            String hora = request.getParameter("hora");
            int duracion = Integer.parseInt(request.getParameter("duracion"));
            String lugar = request.getParameter("lugar");
            int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            
            Servicios servicios =new Servicios(0,servicio, fecha, hora, duracion, lugar, idProfesional, idCliente,0,null,null);
            servicioDAO.insertarServicio(servicios);
                
             dispatcher = request.getRequestDispatcher("Servicios/AdministrarServicio.jsp");
            List<Servicios> listaServicio = servicioDAO.listarServicios();
            request.setAttribute("lista", listaServicio);
            
//muestra formulario para ingresar nuevo servicio vista de profesional              
        } else if (accion.equals("nuevoPor")) {
            dispatcher = request.getRequestDispatcher("Servicios/NuevoServicioPor.jsp");
            
//inserta los datos del formulario de servicio nuevo a base de datos             
        } else if (accion.equals("insertarPor")) {
            String servicio = request.getParameter("servicio");
            String fecha = request.getParameter("fecha");
            String hora = request.getParameter("hora");
            int duracion = Integer.parseInt(request.getParameter("duracion"));
            String lugar = request.getParameter("lugar");
            int idProfesional = Integer.parseInt(request.getParameter("idP"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            
            Servicios servicios =new Servicios(0,servicio, fecha, hora, duracion, lugar, idProfesional, idCliente,0,null,null);
            servicioDAO.insertarServicio(servicios);
                
            dispatcher = request.getRequestDispatcher("Vistas/VistaPro.jsp");
            int id = Integer.parseInt(request.getParameter("idP"));
            List<Servicios> listaServicio = servicioDAO.listarServiciosPorProfesional(id);
            request.setAttribute("lista", listaServicio);
            
//Muestra los datos del servicio existente segun su id desde la base de datos             
        }else if (accion.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Servicios/ModificarServicio.jsp");
            int idServicio = Integer.parseInt(request.getParameter("idServicio"));
            Servicios servicio = servicioDAO.mostrarServicio(idServicio);
            request.setAttribute("servicio", servicio);
            
//Muestra los datos del servicio existente segun su id desde la base de datos vista profesional               
        }else if (accion.equals("modificarPor")) {
            dispatcher = request.getRequestDispatcher("Servicios/ModificarServicioPor.jsp");
            int idServicio = Integer.parseInt(request.getParameter("idServicio"));
            Servicios servicio = servicioDAO.mostrarServicio(idServicio);
            request.setAttribute("servicio", servicio);

//Actualiza los datos del servicio existente segun su id en la base de datos                
        }else if (accion.equals("actualizar")) {

            int idServicio = Integer.parseInt(request.getParameter("idServicio"));
            String servicio = request.getParameter("servicio");
            String fecha = request.getParameter("fecha");
            String hora = request.getParameter("hora");
            int duracion = Integer.parseInt(request.getParameter("duracion"));
            String lugar = request.getParameter("lugar");
            int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            Servicios servicios = new Servicios(idServicio, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente,0,null,null);
            servicioDAO.actualizarServicio(servicios);

            dispatcher = request.getRequestDispatcher("Servicios/AdministrarServicio.jsp");
            List<Servicios> listaServicio = servicioDAO.listarServicios();
            request.setAttribute("lista", listaServicio);

//Actualiza los datos del servicio existente segun su id en la base de datos realizado por perfil profesional
         }else if (accion.equals("actualizarPor")) {

            int idServicio = Integer.parseInt(request.getParameter("idServicio"));
            String servicio = request.getParameter("servicio");
            String fecha = request.getParameter("fecha");
            String hora = request.getParameter("hora");
            int duracion = Integer.parseInt(request.getParameter("duracion"));
            String lugar = request.getParameter("lugar");
            int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            Servicios servicios = new Servicios(idServicio, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente,0,null,null);
            servicioDAO.actualizarServicio(servicios);

            dispatcher = request.getRequestDispatcher("Vistas/VistaPro.jsp");
            int id = Integer.parseInt(request.getParameter("idP"));
            List<Servicios> listaServicio = servicioDAO.listarServiciosPorProfesional(id);
            request.setAttribute("lista", listaServicio);

//elimina un servicio existente de la base de datos            
         } else if (accion.equals("eliminar")) {

            int idServicio = Integer.parseInt(request.getParameter("idServicio"));

            servicioDAO.eliminarServicio(idServicio);
            dispatcher = request.getRequestDispatcher("Servicios/AdministrarServicio.jsp");
            List<Servicios> listaServicio = servicioDAO.listarServicios();
            request.setAttribute("lista", listaServicio);  
    
        }else {
            dispatcher = request.getRequestDispatcher("Servicios/AdministrarServicio.jsp");
            List<Servicios> listaServicio = servicioDAO.listarServicios();
            request.setAttribute("lista", listaServicio);
        }
        dispatcher.forward(request, response);
        
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
