

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/navbarAcceso.html"%>

<head>
    <title>Administrador</title>
</head>

            
 <section class="login section-padding">
            <div class="container mt-5 mb-5">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-header text-center text-white pb-5 mt-5">
                            <h2>ADMINISTRADOR</h2>
                        
                        </div>
                    </div>
                </div>
                
                <div class="row m-0 text-center d-flex justify-content-center">
                    <div class="col-6 md-3 p-0 pt-4 pb-4 d-flex justify-content-center ">
                        
                            <div class="row"> 
                                <div class="col-md-12">
                                    <div class="mb-5">
                                        <form action="UsuariosControlador?accion=" method="post">
                                            <a href="Usuarios/AdministrarUsuarios.jsp" ><input type="submit" class="btn btn-primary" value="Administrar Usuarios"></a>
                                        </form>
                                    </div>
                                </div> 
                                <div class="col-md-12">
                                    <div class="mb-5">
                                        <form action="ServicioControlador?accion=" method="post">
                                            <a href="Servicios/AdministrarServicio.jsp"><input type="submit" class="btn btn-primary" value="Administrar Servicios"></a>
                                        </form>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="mb-5">
                                        <form action="ContactoControlador?accion=" method="post">
                                            <a href="Contacto/AdministrarContacto.jsp" ><input type="submit" class="btn btn-primary" value="Administrar Contacto"></a>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
               
            </div>
        </section>
  
    </body>
</html>
