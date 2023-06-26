/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import DAO.ContactoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Contacto;

/**
 *
 * @author alexl
 */
public class ContactoControlador extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//instancia a contactoDAO        
         ContactoDAO contactoDAO=new ContactoDAO();
        String accion;
        RequestDispatcher dispatcher=null;
        
        accion = request.getParameter("accion");
//lista los registro de contacto desde base de datos        
        if(accion==null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("Contacto/AdministrarContacto.jsp");
            List<Contacto> listaContacto = contactoDAO.listarContacto();
            request.setAttribute("lista", listaContacto);
            
//Envia registro a base de datos          
        } else if (accion.equals("insertar")) {
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String mensaje = request.getParameter("mensaje");
                      
            Contacto contacto =new Contacto(0,nombre,correo,mensaje);
            contactoDAO.insertarContacto(contacto);

//confirma el envio del mensaje
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mensaje enviado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mensaje enviado</h1>");
            out.println("<a href='index.jsp'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
            
 //elimna registro en la base de datos       
         } else if (accion.equals("eliminar")) {

            int idContacto = Integer.parseInt(request.getParameter("idContacto"));

            contactoDAO.eliminarMensaje(idContacto);
             dispatcher = request.getRequestDispatcher("Contacto/AdministrarContacto.jsp");
            List<Contacto> listaContacto = contactoDAO.listarContacto();
            request.setAttribute("lista", listaContacto);
    
        }else {
             dispatcher = request.getRequestDispatcher("Contacto/AdministrarContacto.jsp");
            List<Contacto> listaContacto = contactoDAO.listarContacto();
            request.setAttribute("lista", listaContacto);
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
