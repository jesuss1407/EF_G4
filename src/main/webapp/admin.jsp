
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<jsp:useBean id="usuario" scope="session" type="com.example.ef_g4.Beans.Empleado" class="com.example.ef_g4.Beans.Empleado"/>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'/>

    <title>Reportes
    </title>
    <style>
        body {

        }

        .container {
            padding-right: 0 !important;
            padding-left: 0 !important;
        }

        .titlecolor {
            background: linear-gradient(0deg, #1d1d1d 0%, #525252 130%);
        }

        .navbar {
            padding-left: 20px !important;
            padding-right: 20px !important;
            background-color: rgba(14, 47, 5, 0.94) !important;
        }

        .table-transparent {
            background-color: #343a4000 !important
        }

        .tabla {
            background-color: #1d1d1d;
            padding-left: 30px;
            padding-right: 30px;
            padding-bottom: 50px;
            padding-top: 40px;
        }

        thead {
            border-top: hidden;
            font-size: 14px;
        }

        .table td {
            padding: 0.5rem;
            font-weight: 500;
        }

        .table th {
            padding: 0.5rem;
            font-weight: 100;
        }

        .fila-red {
            background-color: #ba49498c;
        }

        .fila-blue {
            background-color: #2441ac8c;
        }

        .fila-purple {
            background-color: #a4219a8c;
        }

        .fila-yellow {
            background-color: #f0e01f91;
        }


    </style>

</head>

<body>
<div class='container'>

    <jsp:include page="/includes/navbar_admin.jsp">

        <jsp:param name="perfil" value="<%=usuario.getApellido()%>, <%=usuario.getNombre()%>"/>
    </jsp:include>

    <div class="pb-5 pt-4 px-3 titlecolor d-flex justify-content-between align-items-center">
        <div class="col-lg-6">
            <br>
            <br>
            <h1 class='text-light'>Reportes</h1>

        </div>

    </div>
    <div class="tabla">


        <table class="table table-dark table-transparent table-hover">
            <thead>
            <tr>
                <th>Cantidad de empleados sin jefe</th>
                <th>FECHA RESERVA</th>
                <th></th>


            </tr>
            <tr>
                <th>Cantidad de películas en 3D</th>
                <th>FECHA RESERVA</th>
                <th></th>


            </tr>
            <tr>
                <th>Cantidad de cines cuyos empleados tengan un salario mayor a 9700</th>
                <th>FE</th>
                <th></th>


            </tr>
            <tr>
                <th>Cadena de cine con la mayor cantidad de películas en cartelera</th>
                <th></th>
                <th></th>


            </tr>
            </thead>
            <tbody>




            </td>




            </tr>


            </tbody>
        </table>

    </div>
</div>

</body>
</html>
