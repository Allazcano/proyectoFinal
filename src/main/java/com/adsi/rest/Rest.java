package com.adsi.rest;

import DAO.PerfilesDAO;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import javax.ws.rs.PathParam;
import modelo.PerfilCliente;
import modelo.PerfilPro;


@Path("/rest")
public class Rest {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/get/{idUsuario}")
    public String get(@PathParam("idUsuario") int idUsuario) {
    System.out.println("entra a get");
     
    
    // Crear un objeto Java que deseas convertir a JSON
    PerfilesDAO perfilesDAO = new PerfilesDAO();
    PerfilPro perfilPro = (PerfilPro) perfilesDAO.mostrarPerfilPro(idUsuario);
    PerfilCliente perfilCliente = null;
     Gson gson = new Gson();
//si idUsuario no corresponde a profesional crea instancia a metodo perfilCliente
    if(perfilPro == null){
       perfilCliente = (PerfilCliente) perfilesDAO.mostrarPerfilCliente(idUsuario);
        gson = new Gson();
//si idUsuario no corresponde a profesional ni a cliente no se a completado esta informacion
       if( perfilCliente == null){
    
        String Advertencia = "Datos no completados, contactar a usuario para que los complete";
        gson = new Gson();
        return gson.toJson(Advertencia);
      } 
       return gson.toJson(perfilCliente);
    }
  //retorna archivo json        
     return gson.toJson(perfilPro);
    
    
    //http://localhost:8080/proyectoFinal/api/rest/get/2
    
    }
}