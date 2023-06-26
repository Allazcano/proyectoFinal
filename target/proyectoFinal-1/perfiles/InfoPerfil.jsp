<%-- 
    Document   : VistaPerfil
    Created on : 14-06-2023, 21:51:49
    Author     : alexl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
        <link rel="stylesheet" type="text/css" href="../css/estilo.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  
    
    </head>
   
            
   
    <%
     if (!session.getAttribute("rol").equals(1) && !session.getAttribute("rol").equals(2) && !session.getAttribute("rol").equals(3)) {
         response.sendRedirect("login.jsp");
     }%>
    
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">

                <a href="../index.jsp" class="navbar-brand"> <span class="text-primary">Prevencion</span>Riesgos </a>
                <button class="navbar-toggler" type="button"
                        data-bs-toggle="collapse"
                        data-bs-target="#navbarS"
                        aria-controls="navbarS"
                        aria-expanded="false"
                        aria-label="Toggle navigation"
                        >                        
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarS">
                    <ul class="navbar-nav ms-auto mb-2 mb-1g-0">
                        <li class="nav-item">
                            <a href="InfoPerfil.jsp" class="nav-link"><%= session.getAttribute("usuario")%></a>
                        </li>
                        <li class="nav-item">
                             <form action="../Login?accion=CerrarSesion" method="post">
                                 <a href="../index.jsp" class="nav-link" ><i class="bi bi-door-open-fill"><input type="submit" hidden="on"></i></a> </form>
                        </li>
                    </ul>
                  </div>
            </div>
        </nav>

        <section class="admin section-padding">
    <div class="container">
        <div class="section-header text-center text-white pb-5 mt-5 pt-5">
            <h2>Informacion de perfil</h2>

        </div>
    </div>

    <form action="../PerfilControlador?accion=insertar" method="post" autocomplete="off">
        <input type="hidden" name="rol"  value="<%= session.getAttribute("rol")%>">
        <div class="container ">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>nombre: </td>
                                <td><input id="nombre" name="nombre" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>rut</td>
                                <td><input id="rut" name="rut" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>telefono</td>
                                <td><input id="telefono" name="telefono" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>direccion </td>
                                <td><input id="direccion" name="direccion" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>comuna </td>
                                <td><input id="comuna" name="comuna" type="text" class="form-control" required></td>
                            </tr>
                            <tr>
                                <td>idusuario </td>
                                <td><input id="idusuario" name="idusuario" type="number" class="form-control" required></td>
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
