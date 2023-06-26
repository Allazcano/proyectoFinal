<%-- 
    Document   : ServiciosAgupados
    Created on : 03-06-2023, 12:54:57
    Author     : alexl
--%>


<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>
<head>
    <title>Servicios Agrupados</title>
</head>
<%
     if (!session.getAttribute("rol").equals(1)) {
         response.sendRedirect("login.jsp");
     }%>
<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Servicios Realizados</h2>

        </div>
        <a href="ServicioControlador?accion=nuevo" class="btn btn-primary">Nuevo Registro</a>
        <br/><br/>

        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Servicio</th>
                                <th>Realizados</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="servicios" items="${lista}">
                                <tr>
                                    <td><c:out value="${servicios.servicio}"/></td>
                                    <td><c:out value="${servicios.realizadas}"/></td>

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
