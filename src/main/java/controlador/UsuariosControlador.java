package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import servicio.ServicioUsuarios;



/**
 *
 * @author alexl
 */
@WebServlet(name = "UsuariosControlador", urlPatterns = {"/UsuariosControlador"})
public class UsuariosControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServicioUsuarios servicioUsuario = new ServicioUsuarios();
        
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");
// Lista los usuarios registrados
        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuario();
            request.setAttribute("lista", listaUsuario);
            
// Lista por nombre los usuarios registrados
        } else if (accion.equals("PorNombre")) {
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuarioPorNombre();
            request.setAttribute("lista", listaUsuario);
            
// Lista por id los usuarios registrados            
        } else if (accion.equals("PorId")) {
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuarioPorId();
            request.setAttribute("lista", listaUsuario);
            
// Lista por rol los usuarios registrados
        } else if (accion.equals("PorRol")) {
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuarioPorRol();
            request.setAttribute("lista", listaUsuario);
            
//Ingresa al formulario de nuevo usuario            
        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("Usuarios/NuevoUsuario.jsp");
            
//Inserta los datos del fomulario de nuevo usuario a DB
        } else if (accion.equals("insertar")) {
            String nombreUsuario = request.getParameter("nombreUsuario");
            String contraseña = request.getParameter("contrasena");
            String correo = request.getParameter("correo");
            int rol_idrol = Integer.parseInt(request.getParameter("rol_idrol"));
            Usuario usuario = new Usuario(0, nombreUsuario, contraseña, correo, rol_idrol, null);
            servicioUsuario.insertarUsuario(usuario);
            
// redirije a lista de usuarios
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuario();
            request.setAttribute("lista", listaUsuario);

// muestra datos de usuario espesifico segun id
        } else if (accion.equals("modificar")) {
            dispatcher = request.getRequestDispatcher("Usuarios/ModificarUsuarios.jsp");
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            Usuario usuario = servicioUsuario.mostrarUsuario(idUsuario);
            request.setAttribute("usuario", usuario);
            
//actualiza datos ingresados en DB
        } else if (accion.equals("actualizar")) {

            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            String nombreUsuario = request.getParameter("nombreUsuario");
            String contraseña = request.getParameter("contrasena");
            String correo = request.getParameter("correo");
            int rol_idrol = Integer.parseInt(request.getParameter("rol_idrol"));
            Usuario usuario = new Usuario(idUsuario, nombreUsuario, contraseña, correo, rol_idrol, null);
            servicioUsuario.actualizarUsuario(usuario);

            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuario();
            request.setAttribute("lista", listaUsuario);

//Elimina usuario espesifico segun su id            
        } else if (accion.equals("eliminar")) {

            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));

            servicioUsuario.eliminarUsuario(idUsuario);
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuario();
            request.setAttribute("lista", listaUsuario);

        } else {
            dispatcher = request.getRequestDispatcher("Usuarios/AdministrarUsuarios.jsp");
            List<Usuario> listaUsuario = servicioUsuario.listarUsuario();
            request.setAttribute("lista", listaUsuario);
        }
        dispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
