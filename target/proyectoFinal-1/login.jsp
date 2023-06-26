<%-- 
    Document   : login
    Created on : 25-05-2023, 17:54:06
    Author     : alexl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PrevencionRiesgos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <script type="text/javascript" src="js/script.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">

                <a href="index.jsp" class="navbar-brand"> <span class="text-primary">Prevencion</span>Riesgos </a>

            </div>
        </div>
    </nav>

    <section class="login section-padding">
        <div class="container mt-5 mb-5">
            <div class="row">
                <div class="col-md-12">
                    <div class="section-header text-center text-white pb-5 mt-5">
                        <h2>Iniciar Sesion</h2>

                    </div>
                </div>
            </div>

            <div class="row m-0">
                <div class="col-12 md-5 p-5 pt-4 pb-4 ">
                    <form action="Login" class="bg-dark col-5 p-4 m-auto" method="post">
                        <div class="row"> 
                            <div class="col-md-12 ">

                                <div class="input-group mb-3">
                                    <span class="input-group-text"><i class="bi bi-person-fill"></i></span>
                                    <div class="form-floating">
                                        <input type="text" class="form-control" id="floatingInputGroup1" placeholder="Usuario"  name="usuario">
                                        <label for="floatingInputGroup1">Usuario</label>
                                    </div>
                                </div>
                            </div> 
                            <div class="col-md-12">
                                <div class="input-group mb-3">
                                    <span class="input-group-text"><i class="bi bi-lock-fill"></i></span>
                                    <div class="form-floating">
                                        <input ID="txtPassword" type="Password" class="form-control" placeholder="Contraseña" aria-label="Recipient's username" aria-describedby="button-addon2" name="contrasena">
                                        <label for="floatingInputGroup1">Contraseña</label>
                                    </div>
                                    <button id="show_password" class="btn btn-primary" type="button" onclick="mostrarPassword()"> 
                                        <span class="fa fa-eye-slash icon"></span> 
                                    </button>

                                </div>

                            </div>

                            <button class="btn btn-primary btn-lg btn-block mt-3" type="submit"> Ingresar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>

</body>
</html>