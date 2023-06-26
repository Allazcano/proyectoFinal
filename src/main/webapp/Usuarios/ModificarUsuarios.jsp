<%-- 
    Document   : Modificar
    Created on : 22-05-2023, 20:24:15
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
            <h2>Modificar usuarios</h2>

        </div>
        <form action="UsuariosControlador?accion=actualizar" method="post" autocomplete="off" >
            <input id="idUsuario" name="idUsuario" type="hidden"  value="<c:out value="${usuario.idUsuario}" />"/>
            <div class="container ">
                <div class="row">
                    <div class="col">
                        <table class="table">
                            <tbody>
                                <tr>
                                    <td>Nombre de Usuario:</td>
                                    <td><input id="nombreUsuario" name="nombreUsuario" type="text" value="<c:out value="${usuario.nombreUsuario}" />" required class="form-control" /></td>
                                </tr>
                                <tr>
                                    <td>Contraseña:</td>
                                    <td><input id="contrasena" name="contrasena" type="text" value="<c:out value="${usuario.contraseña}" />" required class="form-control"/></td>
                                </tr>
                                <tr>
                                    <td>Correo:</td>
                                    <td><input id="correo" name="correo" type="text" value="<c:out value="${usuario.correo}" />" required class="form-control"/></td>
                                </tr>
                                <tr>
                                    <td>Rol:</td>
                                    <td><select id="rol_idrol" name="rol_idrol" type="text" class="form-control"  required>
                                        <option value="1">Administrador</option>
                                        <option value="2">Profesional</option>
                                        <option value="3">Cliente</option></select></td>
                                    <!--  <td><input id="rol_idrol" name="rol_idrol" type="text" value="<c:out value="${usuario.rol_idrol}" />" required class="form-control"/> </td>-->

                                </tr>
                                <tr>
                                    <td></td>
                                    <td><button id="actualizar" name="actualizar" type="submit" class="btn btn-primary">Guardar</button></td>
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
