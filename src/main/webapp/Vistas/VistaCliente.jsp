<%-- 
    Document   : VistaPro
    Created on : 08-06-2023, 20:25:28
    Author     : alexl
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>

<head>
    <title>cliente</title>
</head>
    <%
        if (!session.getAttribute("rol").equals(3)) {           
            response.sendRedirect("./login.jsp");} %>
            
        <% if(session.getAttribute("NombreCliente")==null){
            response.sendRedirect("./perfiles/InfoPerfil.jsp");}%>
       
        
        <section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Ver Servicios</h2>

        </div>
        
        <br/><br/>
        <!--  <form action="ServicioControlador?accion=PorProfesional" method="post">
           <input type="hidden" name="idP"  value="<%= session.getAttribute("idCliente")%>">
           
           <input type="submit" value="Cargar" class="btn btn-primary">
        </form>-->
       
            
       

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
