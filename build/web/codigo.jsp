<%-- 
    Document   : codigo
    Created on : 5/11/2018, 02:27:49 PM
    Author     : castañosinning
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SOLUTIONS</title>
        <!--boostrap-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>
        <!--estlos css e iconeos de fontello-->
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/fontello.css" rel="stylesheet" type="text/css"/>
    </head
    <body>
        <!--=========================================header==========================================-->
        <header>
            <div class="contactos">
                <ul>
                    <li><a href="#"><samp>Call:  </samp>+57 3008139505</a></li>
                    <li><a href="#"><samp>EMAIL:  </samp>softUnicor@mail.com</a></li>
                </ul>
            </div>
            <a class="logo" href="">
                <img src="img/logo.png" alt="">
            </a>
            <div class="buscar-bar">
                <input type="checkbox" id="buscar">
                <label class="icon-search" for="buscar"></label>
            </div>
            <nav class="menu">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Portafolio</a></li>
                    <li><a href="#">paginas</a></li>
                    <li><a href="#">compras</a></li>
                    <li><a href="#">Noticias</a></li>
                </ul>
            </nav>

            <div class="buscar-menu" id="routs">
                <ul>
                    <li><a href="vistas/crear.html">Crear</a></li>
                    <li><a href="vistas/listar.html">Listar</a></li>
                    <li><a href="vistas/actualizar.html">Actualizar</a></li>
                </ul>

            </div>

        </header>
        <!--============================================header end==================================-->
        <!--============================================section=====================================-->
        <section id="banner">
            <img src="img/1.jpg">
            <div id="contenido"></div>
        </section>
        <!--=======================================section end=====================================-->
        <!--=======================================footer==========================================-->
        <footer>
            <div class="autores">
                <samp>softUnicor Area web &copy; 2018 / Juan David Castaño & Mario Andres Medrano </samp>
            </div>
            <div class="redes-sociales">
                <ul>
                    <li><a class="icon-facebook" href="#">Facebook</a></li>
                    <li><a class="icon-twitter" href="#">twitter</a></li>
                    <li><a class="icon-instagram" href="#">instagram</a></li>
                    <li><a class="icon-pinterest-circled" href="#">pinterest</a></li>
                    <li><a class="icon-tumbler" href="#">tumblr</a></li>
                </ul>
            </div>
        </footer>
        <!--=====================================footer end====================================-->
        <!--extenciones ajax y jquery-->
        <script src="js/jquery.js"></script>
        <!--Validacion-->
        <script src="js/routs.js"></script>
        <script src="js/Informacion.js"></script>
    </body>
</html>
