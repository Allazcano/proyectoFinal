<%-- 
    Document   : ModificarServicio
    Created on : 30-05-2023, 14:06:20
    Author     : alexl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>
<head>
    <title>Modificar</title>
</head>
<%
     if (!session.getAttribute("rol").equals(1)) {
         response.sendRedirect("login.jsp");
     }%>


<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Modificar Servicio</h2>

        </div>

        <form action="ServicioControlador?accion=actualizar" method="post" autocomplete="off" >
            <input id="idServicio" name="idServicio" type="hidden"  value="<c:out value="${servicio.idServicio}" />"/>
            <div class="container ">
                <div class="row">
                    <div class="col">
                        <table class="table">
                            <tbody>
                                <tr>
                                    <td>Servicio</td>
                                    <td><select id="Servicio" name="servicio" type="text" value="<c:out value="${servicio.servicio}" />" required class="form-control">
                                            <option value="Capacitacion">Capacitacion</option>
                                            <option value="Asesoria">Asesoria</option></select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Fecha</td>
                                    <td><input id="Fecha" name="fecha" type="date" value="<c:out value="${servicio.fecha}" />" required class="form-control"/></td>
                                </tr>
                                <tr>
                                    <td>Hora</td>
                                    <td><input id="Hora" name="hora" type="time" value="<c:out value="${servicio.hora}" />" required class="form-control"/></td>
                                </tr>
                                <tr>
                                    <td>Duracion</td>
                                    <td><input id="Duracion" name="duracion" type="text" value="<c:out value="${servicio.duracion}" />" required class="form-control"/> </td>

                                </tr>
                                <tr>
                                    <td>Lugar</td>
                                    <td><input id="Lugar" name="lugar" type="text" value="<c:out value="${servicio.lugar}" />" required class="form-control"/> </td>

                                </tr>
                                <tr>
                                    <td>ID Profesional</td>
                                    <td><input id="Profesional" name="idProfesional" type="text" value="<c:out value="${servicio.idProfesional}" />" required class="form-control"/> </td>

                                </tr>
                                <tr>
                                    <td>ID Cliente</td>
                                    <td><input id="Cliente" name="idCliente" type="text" value="<c:out value="${servicio.idCliente}" />" required class="form-control"/> </td>

                                </tr>
                                <tr>
                                    <td></td>
                                    <td><button id="guardar" name="guardar" type="submit" class="btn btn-primary">Guardar</button></td>
                                </tr>
                            </tbody>
                        </table>


                    </div>
                </div>
            </div>
        </form>
</section>
</body>

</html>
