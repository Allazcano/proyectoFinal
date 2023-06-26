<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>
<head>
    <title>Administrar/Usuarios</title>
</head>
<body>
    <%
        if (!session.getAttribute("rol").equals(1)) {
            response.sendRedirect("login.jsp");
        }%>
<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Administrar usuarios</h2>

        </div>
     
        <br/><br/>
        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead >
                            <tr >
                                <th><a href="UsuariosControlador?accion=PorId">ID</a></th>
                                <th><a href="UsuariosControlador?accion=PorNombre"> Nombre Usuario</a></th>
                                <th>Contraseña</th>
                                <th>correo </th>
                                <th><a href="UsuariosControlador?accion=PorRol"> Rol</a></th>
                                <th>Modificar</th>
                                <th>Eliminar</th>
                            </tr>

                        </thead>
                        <tbody>
                            <c:forEach var="usuario" items="${lista}">
                                <tr>
                                    <td><a href="http://localhost:8080/proyectoFinal/api/rest/get/<c:out value="${usuario.idUsuario}"/>"><c:out value="${usuario.idUsuario}"/></a></td>
                                    <td><c:out  value="${usuario.nombreUsuario}"/></td>
                                    <td><c:out value="${usuario.contraseña}" /></td>
                                    <td><c:out value="${usuario.correo}"/></td>
                                    <td><c:out value="${usuario.tipo}"/></td>
                                    <td><a href="UsuariosControlador?accion=modificar&idUsuario=<c:out value="${usuario.idUsuario}" />" class="btn btn-primary"  >Modificar</a> </td>

                                    <td> <a href="UsuariosControlador?accion=eliminar&idUsuario=<c:out value="${usuario.idUsuario}" />" class="btn btn-primary"  >Eliminar</a> </td>
                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
</section>
    <%@include file="NuevoUsuario.jsp"%>
    
</body>
</html>
