/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexl
 */
public class Asistentes {
   private int idAsistentes;
   private String nombreCompleto;
   private String rut;
   private String cargo;
   private int idCapacitacion;

    public Asistentes(int idAsistentes, String nombreCompleto, String rut, String cargo, int idCapacitacion) {
        this.idAsistentes = idAsistentes;
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.cargo = cargo;
        this.idCapacitacion = idCapacitacion;
    }

    public Asistentes() {
    }

    @Override
    public String toString() {
        return "Asistentes{" + "idAsistentes=" + idAsistentes + ", nombreCompleto=" + nombreCompleto + ", rut=" + rut + ", cargo=" + cargo + ", idCapacitacion=" + idCapacitacion + '}';
    }

    public int getIdAsistentes() {
        return idAsistentes;
    }

    public void setIdAsistentes(int idAsistentes) {
        this.idAsistentes = idAsistentes;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }
   
   
}
