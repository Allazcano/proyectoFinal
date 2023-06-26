<%-- 
    Document   : NuevoServicioPor
    Created on : 29-05-2023, 18:07:23
    Author     : alexl
--%>


<%@include file="../html/navbarAcceso.html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <title>Nuevo Servicio</title>
</header>
<%
     if (!session.getAttribute("rol").equals(2)) {
         response.sendRedirect("login.jsp");
     }%>
<section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Agregar Servicio</h2>

        </div>
    </div>

    <form action="ServicioControlador?accion=insertarPor" method="post" autocomplete="off">
        <input id="idProfesional" name="idProfesional" type="number" class="form-control" hidden="on" >
         <input type="hidden" name="idP"  value="<%= session.getAttribute("idprofesional")%>">
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
                                <td>idCliente </td>
                                <td><select id="idCliente" name="idCliente" class="form-control">
                                     <c:forEach var="perfilCliente" items="${listaC}">
                                     <option value="<c:out value="${perfilCliente.idCliente}"/>"><c:out value="${perfilCliente.nombre}"/></option>
                                      </c:forEach>
                                      </select></td>
                                
                            </tr>


                            <tr>
                                <td></td>
                                <td><button id="guardar" type="submit"  name="guardar" class="btn btn-primary"><i class="bi bi-person-plus-fill"></i> Guardar</button></td>
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
