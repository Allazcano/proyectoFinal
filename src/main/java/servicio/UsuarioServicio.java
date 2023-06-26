/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Usuario;


/**
 *
 * @author alexl
 */
public interface UsuarioServicio {

    List<Usuario> listarUsuario();

    List<Usuario> listarUsuarioPorNombre();

    List<Usuario> listarUsuarioPorId();

    List<Usuario> listarUsuarioPorRol();

    Usuario mostrarUsuario(int id);

    boolean insertarUsuario(Usuario usuario);

    boolean actualizarUsuario(Usuario usuario);

    boolean eliminarUsuario(int id);

}
