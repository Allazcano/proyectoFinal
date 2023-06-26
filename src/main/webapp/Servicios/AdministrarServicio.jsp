<%-- 
    Document   : AdministrarCapacitacion
    Created on : 29-05-2023, 17:24:47
    Author     : alexl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>
<head>
    <title>Administrar/Servicios</title>
</head>
<%
     if (!session.getAttribute("rol").equals(1)) {
         response.sendRedirect("login.jsp");
     }%>

<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Administrar Servicios</h2>

        </div>

        <br/><br/>
        <form action="ServicioControlador?accion=agrupar" method="post">
            <a href="Servicios/ServiciosAgrupados.jsp" ><input type="submit" class="btn btn-primary" value="Agrupar"></a>
        </form>

        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Servicio</th>
                                <th>Fecha</th>
                                <th>Hora</th>
                                <th>Duracion(min)</th>
                                <th>Lugar</th>
                                <th>Profesional</th>
                                <th>Cliente</th>
                                <th>Modificar</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="servicios" items="${lista}">
                                <tr>
                                    <td><c:out value="${servicios.idServicio}"/></td>
                                    <td><c:out value="${servicios.servicio}"/></td>
                                    <td><c:out value="${servicios.fecha}"/></td>
                                    <td><c:out value="${servicios.hora}"/></td>
                                    <td><c:out value="${servicios.duracion}"/></td>
                                    <td><c:out value="${servicios.lugar}"/></td>
                                    <td><c:out value="${servicios.nombrePro}"/></td>
                                    <td><c:out value="${servicios.nombreCliente}"/></td>
                                    <td><a href="ServicioControlador?accion=modificar&idServicio=<c:out value="${servicios.idServicio}" />" class="btn btn-primary"  >Modificar</a> </td>

                                    <td> <a href="ServicioControlador?accion=eliminar&idServicio=<c:out value="${servicios.idServicio}" />" class="btn btn-primary"  >Eliminar</a> </td>
                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<%@include file="NuevoServicio.jsp"%>

</body>
</html>
