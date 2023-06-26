
<%-- 
    Document   : NuevoUsuario
    Created on : 22-05-2023, 20:17:49
    Author     : alexl
--%>
<%@include file="../html/navbarAcceso.html"%>
<header>
    <title>Nuevo Usuario</title>
</header>
<%
    if (!session.getAttribute("rol").equals(1)) {
        response.sendRedirect("login.jsp");
    }%>
<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Agregar Usuario</h2>

        </div>
    </div>

    <form action="UsuariosControlador?accion=insertar" method="post" autocomplete="off">
        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>Nombre de Usuario: </td>
                                <td><input id="nombreUsuario" name="nombreUsuario" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>Contraseña:</td>
                                <td><input id="contrasena" name="contrasena" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>correo: </td>
                                <td><input id="correo" name="correo" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>rol: </td>
                                <td><select id="rol_idrol" name="rol_idrol" type="text" class="form-control" required>
                                        <option value="1">Administrador</option>
                                        <option value="2">Profesional</option>
                                        <option value="3">Cliente</option></select></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><button id="insertar" type="submit"  name="insertar" class="btn btn-primary">Guardar</button></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </form>
    
</div>


</section>
</body>
</html>
