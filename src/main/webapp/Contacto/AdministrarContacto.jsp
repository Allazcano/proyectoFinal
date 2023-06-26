<%-- 
    Document   : AdministrarContacto
    Created on : 05-06-2023, 19:05:36
    Author     : alexl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>
<head>
    <title>Administrar/Contacto</title>
</head>
<%
     if (!session.getAttribute("rol").equals(1)) {
         response.sendRedirect("login.jsp");
     }%>
<section class=" section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Administrar Contacto</h2>

        </div>

        <br/><br/>

        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Correo</th>
                                <th>Mensaje</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="contacto" items="${lista}">
                                <tr>
                                    <td><c:out value="${contacto.idContacto}"/></td>
                                    <td><c:out value="${contacto.nombre}"/></td>
                                    <td><c:out value="${contacto.correo}"/></td>
                                    <td><c:out value="${contacto.mensaje}"/></td>
                                    <td> <a href="ContactoControlador?accion=eliminar&idContacto=<c:out value="${contacto.idContacto}" />" class="btn btn-primary"  >Eliminar</a> </td>
                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>