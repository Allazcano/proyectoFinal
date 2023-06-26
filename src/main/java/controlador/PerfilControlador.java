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
public class PerfilControlador extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PerfilesDAO perfilesDAO = new PerfilesDAO();
        ServicioDAO servicioDAO = new ServicioDAO();
        
        RequestDispatcher dispatcher=null;
        String accion = request.getParameter("accion");
        
        int rol = Integer.parseInt(request.getParameter("rol"));
        if(rol==2){
            
        if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("perfiles/PerfilPro.jsp");
            
        
        }else if (accion.equals("insertar")) {
            String nombre = request.getParameter("nombre");
            String rut = request.getParameter("rut");
            int telefono = Integer.parseInt(request.getParameter("telefono"));
            String direccion = request.getParameter("direccion");
            String comuna = request.getParameter("comuna");
            int idusuario = Integer.parseInt(request.getParameter("idusuario"));
            
            
            PerfilPro perfil =new PerfilPro(0,nombre, rut, telefono, direccion, comuna,idusuario);
            perfilesDAO.insertarPerfilPro(perfil);
            
            dispatcher = request.getRequestDispatcher("Vistas/VistaPro.jsp");
            int id = Integer.parseInt(request.getParameter("idP"));
            List<Servicios> listaServicio = servicioDAO.listarServiciosPorProfesional(id);
            request.setAttribute("lista", listaServicio);
            List<PerfilCliente> listaCliente = perfilesDAO.listarPerfilCliente();
            request.setAttribute("listaC", listaCliente);
            
        }  
        
        }
        
        
           dispatcher = request.getRequestDispatcher("Vistas/VistaPro.jsp");
        
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
