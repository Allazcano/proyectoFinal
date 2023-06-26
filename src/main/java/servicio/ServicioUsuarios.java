/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import DAO.UsuarioDAO;
import java.util.List;
import modelo.Usuario;



/**
 *
 * @author alexl
 */

public class ServicioUsuarios implements UsuarioServicio{
   UsuarioDAO usuarioDAO;

  
    public ServicioUsuarios() {
        this.usuarioDAO = new UsuarioDAO ();
    }

    
    @Override
    public List<Usuario> listarUsuario() {
        return usuarioDAO.listarUsuario();
    }

    @Override
    public List<Usuario> listarUsuarioPorNombre() {
       return usuarioDAO.listarUsuarioPorNombre();
    }

    @Override
    public List<Usuario> listarUsuarioPorId() {
        return usuarioDAO.listarUsuarioPorId();
    }

    @Override
    public List<Usuario> listarUsuarioPorRol() {
        return usuarioDAO.listarUsuarioPorRol();
    }

    @Override
    public Usuario mostrarUsuario(int id) {
        return usuarioDAO.mostrarUsuario(id);
    }

    @Override
    public boolean insertarUsuario(Usuario usuario) {
        return usuarioDAO.insertarUsuario(usuario);
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        return usuarioDAO.actualizarUsuario(usuario);
    }

    @Override
    public boolean eliminarUsuario(int id) {
        return usuarioDAO.eliminarUsuario(id);
    
}
}
