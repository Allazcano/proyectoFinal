package controlador;

import static Log.CrearLog.errorLog;
import conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alexl
 */
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//instancia a clase conexion
        Connection conexion;
        Conexion con = new Conexion();
        conexion = con.getConexion();
//obtiene datos desde formulario login.jsp
        String u = request.getParameter("usuario");
        String c = request.getParameter("contrasena");
        HttpSession session = request.getSession();
        
//realiza consulta a base de datos 
        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = conexion.prepareStatement("SELECT u.idusuario, nombreUsuario, contraseña, correo, rol_idrol,\n"
                                            + "idprofesional, p.nombre, p.rut, p.telefono, p.direccion, p.comuna, p.idusuario\n"
                                            + "idcliente, IFNULL(c.nombre,''), IFNULL(c.rut,''), IFNULL(c.telefono,''), IFNULL(c.direccion,''), IFNULL(c.comuna,''),IFNULL(c.rubro,''), IFNULL(c.idusuario,'')\n" +
                                             "FROM usuario u LEFT JOIN profesional p ON(u.idusuario=p.idusuario)  LEFT JOIN clientes c ON(u.idusuario=c.idusuario)  WHERE u.nombreUsuario=? AND u.contraseña=?" );
            ps.setString(1, u);
            ps.setString(2, c);
            rs = ps.executeQuery();
            
//si la consulta es correcta       
            if (rs.next()) {
 //asigna datos obtenidos a variables               
                int rol = rs.getInt("rol_idrol");
                int idprofesional= rs.getInt("idProfesional");
                String NombrePro = rs.getString("p.nombre");
                String NombreCliente = rs.getString("IFNULL(c.nombre,'')");
 //asigna atributos a la sesion               
                session.setAttribute("usuario", u);
                session.setAttribute("idprofesional", idprofesional);
                session.setAttribute("NombrePro", NombrePro);
                session.setAttribute("rol", rol);
                session.setAttribute("NombreCliente", NombreCliente);
                
//redirecciona segun rol de la sesion                
                switch (rol) {
                    case 1: {
                        RequestDispatcher requestDispatcher = request
                                .getRequestDispatcher("Vistas/VistaAdmin.jsp");
                        requestDispatcher.forward(request, response);
                        break;
                    }
                    case 2: {
                        RequestDispatcher requestDispatcher = request
                                .getRequestDispatcher("Vistas/VistaPro.jsp");
                        requestDispatcher.forward(request, response);
                        break;
                    }
                    case 3: {
                        RequestDispatcher requestDispatcher = request
                                .getRequestDispatcher("Vistas/VistaCliente.jsp");
                        requestDispatcher.forward(request, response);
                        break;
                    }
                }
            }
//cerrar sesion
            String accion = request.getParameter("accion") != null ? String.valueOf(request.getParameter("accion")) : "";
            if (accion.equals("CerrarSesion")) {
                session.invalidate();
                RequestDispatcher requestDispatcher = request
                        .getRequestDispatcher("index.jsp");
                requestDispatcher.forward(request, response);

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            errorLog(e.toString());
        }
//advertencia en caso de usuario o constraseña incorrecta
        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Debe ingresar un usuario valido')");
            out.println("location='login.jsp';");
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }

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
