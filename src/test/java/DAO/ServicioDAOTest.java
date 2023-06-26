/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;


import modelo.Servicios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexl
 */
public class ServicioDAOTest {

    public ServicioDAOTest() {
    }

    /**
     * prueba de metodo insertarServicio de la clase ServicioDAO.
     */
    @Test
    public void testInsertarServicio() {
        System.out.println("insertarServicio");
        Servicios servicios = null;
        ServicioDAO instance = new ServicioDAO();
        String servicio = "prueba";
        String fecha = "2023/06/07";
        String hora = "00:00";
        int duracion = 60;
        String lugar = "lugar";
        int idProfesional = 1;
        int idCliente = 1;
        servicios= new Servicios( 0, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente,0,null,null);
        boolean expResult = true;
        boolean result = instance.insertarServicio(servicios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * prueva de metodo actualizarServicio, de la clase ServicioDAO.
     */
    @Test
    public void testActualizarServicio() {
        System.out.println("actualizarServicio");
        Servicios servicios = null;
        ServicioDAO instance = new ServicioDAO();
        int idServicio = 42;
        String servicio = "actualizar";
        String fecha = "2023/06/07";
        String hora = "00:00";
        int duracion = 60;
        String lugar = "otro lugar";
        int idProfesional = 1;
        int idCliente = 1;
        servicios= new Servicios( idServicio, servicio, fecha, hora, duracion, lugar, idProfesional, idCliente,0,null,null);
        boolean expResult = true;
        boolean result = instance.actualizarServicio(servicios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarServicio method, of class ServicioDAO.
     */
    @Test
    public void testEliminarServicio() {
        System.out.println("eliminarServicio");
        int idServicio = 42;
        ServicioDAO instance = new ServicioDAO();
        boolean expResult = true;
        boolean result = instance.eliminarServicio(idServicio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
