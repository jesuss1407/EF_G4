<%@ page import="com.example.ef_g4.DTO.CartelerasDTO" %><%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 0012, 12 de julio del 2022
  Time: 12:47p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:useBean id="cartelera" scope="request" type="java.util.ArrayList<com.example.ef_g4.DTO.CartelerasDTO>" />
<html style="position:relative;min-height: 100%;padding-bottom: 160px">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">


<head>

    <title>Cartelera-T3L3 C4MP30N FUTS4L S.A.C 2019</title>


    <style>
        .titulox{
            color:white;
            font-weight: bold;
            font-size: 35px;

        }

        @font-face { font-family: "Akzidenz-Grotesk"; src: url('<%=request.getContextPath()%>/Imagenes/akzidenz.otf'); }
        a {
            text-decoration: none !important;
        }

        body{
            background: rgb(147, 151, 157);
            background: linear-gradient(0deg, rgb(183, 185, 189) 0%, rgb(103, 103, 103) 80%);
            background-repeat: no-repeat ;
            background-size: cover;
            background-position: center center;
            background-attachment: fixed;
        }
    </style>


</head>

<body class="d-flex flex-column min-vh-100">



<nav class="navbar navbar-dark" style="background:#082c0b;">
    <a class="navbar-brand"  style="color: white; margin-left: 20px "> BIENVENIDO, axd </A>
    <div style="margin-right: 15px">


        <a href="${pageContext.request.contextPath}/loguin?action=logout" class="my-1 mx-1" style="color: white;font-weight: bold;font-size: 17px;font-family: Akzidenz-Grotesk"><button type="button" class="btn btn-danger">Cerrar Sesión <i class="bi bi-box-arrow-right"></i></button></a>

    </div>
</nav>





<div class="container">
    <div class="d-flex flex-row bd-highlight mb-1">
        <p class="titulox"><br>Cartelera</p>
        <br>

    </div>
    <button type="button" class="btn btn-success" style="margin-top: -15px"><p class="my-1 mx-1" STYLE="color: white">Crear funcion</p></button>
    <br>
    <br>
    <table class="table">
        <thead>
        <tr class="titulos">
            <th style="color:white ">Cadena</th>
            <th style="color:white ">Pelicula</th>
            <th style="color:white ">Cine</th>
            <th style="color:white ">Horario</th>
            <th style="color:white ">Editar Función</th>
            <th style="color:white ">Eliminar función</th>

        </tr>
        </thead>
        <tbody>

        <%for (CartelerasDTO carteleras : cartelera) { %>


        <tr>
            <td><%=carteleras.getNombreComercial()%></td>

            <td style="color:white ">
                <div style="color:white;font-size: 20px "><strong><%=carteleras.getNombrePelicula()%></strong></div>
                <br>
                <strong><%=carteleras.getCarteleratresD()%></strong>
                <br>

                <strong><%=carteleras.getCarteleraSubtitulada()%></strong>
                <br>

                <strong><%=carteleras.getCarteleraDoblada()%></strong>
                <br>

            </td>
            <td>Cine</td>
            <td>Horario</td>
            <td><button type="button" class="btn btn-primary">Editar Función</button></td>
            <td><button type="button" class="btn btn-danger">Eliminar Función</button></td>


        </tr>




        <%}%>





        </tbody>

    </table>




</div>
</body>
</html>
