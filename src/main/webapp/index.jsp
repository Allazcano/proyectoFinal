<%-- 
    Document   : index
    Created on : 25-05-2023, 20:57:30
    Author     : alexl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PrevencionRiesgos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
   
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">

                <a href="index.jsp" class="navbar-brand"> <span class="text-primary">Prevencion</span>Riesgos </a>
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
                            <a href="#" class="nav-link">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a href="#nosotros" class="nav-link">Nosotros</a>
                        </li>
                        <li class="nav-item">
                            <a href="#servicios" class="nav-link">Servicios</a>
                        </li>
                        <li class="nav-item">
                            <a href="#areas" class="nav-link">Areas</a>
                        </li>
                        <li class="nav-item">
                            <a href="#equipo" class="nav-link">Equipo</a>
                        </li>
                        <li class="nav-item">
                            <a href="#contacto" class="nav-link">Contacto</a>
                        </li>
                        <li class="nav-item">
                            <a href="login.jsp" class="nav-link"><i class="bi bi-door-closed-fill"></i></a>
                        </li>
                    </ul>


                </div>
            </div>
        </nav>
<div id="carouselE" class="carousel slide" data-bs-ride="carousel">

    <div class="carousel-indicators">
        <button type="button" 
                data-bs-target="#carouselE"
                data-bs-slide-to="0"
                class="active"
                aria-current="true"
                aria-label="Slide 1"
                ></button>
        <button type="button" 
                data-bs-target="#carouselE"
                data-bs-slide-to="1"

                aria-current="true"
                aria-label="Slide 2"
                ></button> 
        <button type="button" 
                data-bs-target="#carouselE"
                data-bs-slide-to="2"

                aria-current="true"
                aria-label="Slide 3"
                ></button> 

    </div>

    <div class="carousel-inner">

        <div class="carousel-item active">
            <img src="img/1.jpg" class="d-block w-100" alt="alt"/>
            <div class="carousel-caption">
                <h5>Asesorias </h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                    quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </p>
                <a href="#" class="btn-btn-primary mt-3">Mas informacion</a>
            </div>
        </div>
        <div class="carousel-item ">
            <img src="img/2.jpg" class="d-block w-100" alt="alt"/>
            <div class="carousel-caption">
                <h5>Capcacitaciones </h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                    quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </p>
                <a href="#" class="btn-btn-primary mt-3">Mas informacion</a>
            </div>
        </div>
        <div class="carousel-item">
            <img src="img/3.jpg" class="d-block w-100" alt="alt"/>
            <div class="carousel-caption">
                <h5>Evaluacion de condiciones </h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                    quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </p>
                <a href="#" class="btn-btn-primary mt-3">Mas informacion</a>
            </div>
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselE" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" arial-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselE" data-bs-slide="next">
        <span class="carousel-control-next-icon" arial-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>

</div> 





<a href=""id="nosotros"></a>
<section  class="about section-padding">

    <div class="container">
        <div class="row">
            <div class="col-lg-4 col-md-12 col-12" >
                <div class="about-img">
                    <img src="img/1.jpg" class="img-fluid">
                </div>
            </div>
            <div class="col-lg-8 col-md-12 col-12 ps-lg-5 mt-md-5">
                <div class="about-text text-white">
                    <h2>Asesorias <br> Terreno</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    <a href="#" class="btn btn-primary"> Mas info</a>
                    <a href=""id="servicios"></a>     
                </div>
            </div>
        </div>
    </div>
</section>


<section class="services section-padding">

    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-header text-center text-white pb-5">
                    <h2>Servicios</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                    </p>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-12 col-md-12 col-lg-4">
                <div class="card text-white text-center bg-dark pb-2">
                    <div class="card-body">
                        <i class="bi bi-laptop"></i>
                        <h3 class="card-title">Asesorias</h3>
                        <p class="lead">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                    
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-12 col-lg-4">
                <div class="card text-white text-center bg-dark pb-2">
                    <div class="card-body">
                        <i class="bi bi-book"></i>
                        <h3 class="card-title">Capacitaciones</h3>
                        <p class="lead">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        
                    </div>
                </div>
            </div>                        


            <div class="col-12 col-md-12 col-lg-4">
                <div class="card text-white text-center bg-dark pb-2">
                    <div class="card-body">
                        <i class="bi bi-ear-fill"></i>
                        <h3 class="card-title">Mediciones</h3>
                        <p class="lead">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        
                        <a href=""id="areas"></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="areas section-padding">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-header text-center text-white pb-5">
                    <h2>Areas</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    </p>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-12 col-md-12 col-lg-4">
                <div class="card text-light text-center bg-dark pb-2"> 
                    <div class="card-body text-white">
                        <div class="img-area mb-4">
                            <img src="img/1.jpg" class="img-fluid">
                        </div>
                        <h3>Medicion Silice</h3>
                        <p class="lead">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        
                    </div>
                </div>
            </div>


            <div class="col-12 col-md-12 col-lg-4">
                <div class="card text-light text-center bg-dark pb-2"> 
                    <div class="card-body text-white">
                        <div class="img-area mb-4">
                            <img src="img/2.jpg" class="img-fluid">
                        </div>
                        <h3>Medicion ruido</h3>
                        <p class="lead">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                       
                    </div>
                </div>
            </div>


            <div class="col-12 col-md-12 col-lg-4">
                <div class="card text-light text-center bg-dark pb-2"> 
                    <div class="card-body text-white">
                        <div class="img-area mb-4">
                            <img src="img/3.jpg" class="img-fluid">
                        </div>
                        <h3>Medicion radiacion</h3>
                        <p class="lead">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        
                        <a href=""id="equipo"></a>
                    </div>
                </div>
            </div>
        </div>
    </div> 
</div>
</div>
</section>


<section class="team section-padding">

    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-header text-center text-white pb-5">
                    <h2>Asesores</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                        quis nostrud exerc

                    </p>
                </div>
            </div>

        </div>

        <div class="row">

            <div class="col-12 col-md-6 col-lg-3">
                <div class="card text-center bg-dark ">
                    <div class="card-body text-white">
                        <img src="img/perfil.png" class="img-fluid rounded-circle">
                        <h3 class="card-title py-2">lorem</h3>
                        <p class="card-text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt   
                        </p>
                        <p class="socials">
                            <i class="bi bi-twitter text-white mx-1"></i>
                            <i class="bi bi-facebook text-white mx-1"></i>
                            <i class="bi bi-instagram text-white mx-1"></i>
                            <i class="bi bi-linkedin text-white mx-1"></i>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-6 col-lg-3">
                <div class="card text-center bg-dark ">
                    <div class="card-body text-white">
                        <img src="img/perfil.png" class="img-fluid rounded-circle">
                        <h3 class="card-title py-2">lorem</h3>
                        <p class="card-text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt   
                        </p>
                        <p class="socials">
                            <i class="bi bi-twitter text-white mx-1"></i>
                            <i class="bi bi-facebook text-white mx-1"></i>
                            <i class="bi bi-instagram text-white mx-1"></i>
                            <i class="bi bi-linkedin text-white mx-1"></i>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-6 col-lg-3">
                <div class="card text-center bg-dark ">
                    <div class="card-body text-white">
                        <img src="img/perfil.png" class="img-fluid rounded-circle">
                        <h3 class="card-title py-2">lorem</h3>
                        <p class="card-text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt   
                        </p>
                        <p class="socials">
                            <i class="bi bi-twitter text-white mx-1"></i>
                            <i class="bi bi-facebook text-white mx-1"></i>
                            <i class="bi bi-instagram text-white mx-1"></i>
                            <i class="bi bi-linkedin text-white mx-1"></i>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-6 col-lg-3">
                <div class="card text-center bg-dark ">
                    <div class="card-body text-white">
                        <img src="img/perfil.png" class="img-fluid rounded-circle">
                        <h3 class="card-title py-2">lorem</h3>
                        <p class="card-text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                            tempor incididunt   
                        </p>
                        <p class="socials">
                            <i class="bi bi-twitter text-white mx-1"></i>
                            <i class="bi bi-facebook text-white mx-1"></i>
                            <i class="bi bi-instagram text-white mx-1"></i>
                            <i class="bi bi-linkedin text-white mx-1"></i>
                        </p>
                        <a href=""id="contacto"></a>
                    </div>
                </div>
            </div>

        </div>
    </div>
</section>

<section class="contact section-padding">
    <div class="container mt-5 mb-5">
        <div class="row">
            <div class="col-md-12">
                <div class="section-header text-center text-white pb-5">
                    <h2>Contacto</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

                </div>
            </div>
        </div>

        <div class="row m-0">
            <div class="col-md-12 p-0 pt-4 pb-4">
                <form action="ContactoControlador?accion=insertar" class="bg-dark p-4 m-auto" method="post">
                    <div class="row"> 
                        <div class="col-md-12">
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Nombre" name="nombre" required>
                            </div>
                        </div> 
                        <div class="col-md-12">
                            <div class="mb-3">
                                <input type="email" class="form-control" placeholder="Correo" name="correo" required>
                            </div>
                        </div>

                        <div class="col-md-12">
                            <div class="mb-3">
                                <textarea class="form-control"rows="3" placeholder="Mensaje" name="mensaje" required></textarea>
                            </div>
                        </div>
                        <button class="btn btn-primary btn-lg btn-block mt-3" type="submit">Enviar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<footer class="bg-dark p-2 text-center">
    <div class="container">
        <p class="text-white"> Empresa de Asesorías de Prevención de Riesgos</p>
        <p class="socials">
            <i class="bi bi-twitter text-white mx-1"></i>
            <i class="bi bi-facebook text-white mx-1"></i>
            <i class="bi bi-instagram text-white mx-1"></i>
            <i class="bi bi-linkedin text-white mx-1"></i>
        </p>
    </div>

</footer>
</body>
</html>