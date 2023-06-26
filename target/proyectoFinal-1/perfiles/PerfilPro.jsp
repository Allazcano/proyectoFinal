<%-- 
    Document   : PerfilPro
    Created on : 14-06-2023, 21:53:04
    Author     : alexl
--%>


<%@include file="../html/navbarAcceso.html"%>
<header>
    <title><%= session.getAttribute("usuario")%></title>
</header>
<%
     if (!session.getAttribute("rol").equals(2) && !session.getAttribute("rol").equals(1)) {
         response.sendRedirect("login.jsp");
     }%>
<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Agregar Servicio</h2>

        </div>
    </div>

    <form action="UsuariosControlador?accion=insertar" method="post" autocomplete="off">
        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>Servicio</td>
                                <td><select id="servicio" name="servicio" type="text" class="form-control">
                                        <option value="Capacitacion">Capacitacion</option>
                                        <option value="Asesoria">Asesoria</option></select>
                                </td>
                            </tr>

                            <tr>
                                <td>Fecha</td>
                                <td><input id="fecha" name="fecha" type="date" class="form-control"></td>
                            </tr>
                            <tr>
                                <td>hora </td>
                                <td><input id="hora" name="hora" type="time" class="form-control"></td>
                            </tr>
                            <tr>
                                <td>duracion </td>
                                <td><input id="duracion" name="duracion" type="number" class="form-control"></td>
                            </tr>
                            <tr>
                                <td>lugar </td>
                                <td><input id="lugar" name="lugar" type="text" class="form-control"></td>
                            </tr>
                            <tr>
                                <td>idProfesional </td>
                                <td><input id="idProfesional" name="idProfesional" type="number" class="form-control"></td>
                            </tr>
                            <tr>
                                <td>idCliente </td>
                                <td><input id="idCliente" name="idCliente" type="number" class="form-control"></td>
                            </tr>


                            <tr>
                                <td></td>
                                <td><button id="guardar" type="submit"  name="guardar" class="btn btn-primary">Guardar</button></td>
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
