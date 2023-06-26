/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexl
 */
public class Servicios {
  private  int idServicio;
  private  String servicio;
  private  String fecha;
  private  String hora;
  private  int duracion;
  private  String lugar;
  private  int idProfesional;
  private  int idCliente;
  private int realizadas;
  private String nombrePro;
  private String nombreCliente;

    public Servicios(int idServicio, String servicio, String fecha, String hora, int duracion, String lugar, int idProfesional, int idCliente, int realizadas, String nombrePro, String nombreCliente) {
        this.idServicio = idServicio;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.lugar = lugar;
        this.idProfesional = idProfesional;
        this.idCliente = idCliente;
        this.realizadas = realizadas;
        this.nombrePro = nombrePro;
        this.nombreCliente = nombreCliente;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getRealizadas() {
        return realizadas;
    }

    public void setRealizadas(int realizadas) {
        this.realizadas = realizadas;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    
}
