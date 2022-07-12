<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!-- Required meta 2 tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">


<nav class="navbar navbar-dark" style="background:#082c0b;">
    <a class="navbar-brand"  style="color: white; "> BIENVENIDO, <%=request.getParameter("perfil")%> </A>
    <div >
        <a href="${pageContext.request.contextPath}/inicio?action=registrado" class="my-1 mx-1" style="color: white;font-weight: bold;font-size: 17px;font-family: Akzidenz-Grotesk">Inicio⠀<i class="bi bi-house-fill"></i> </a>
        <a href="${pageContext.request.contextPath}/PerfildeUsuario?a=perfil" class="my-1 mx-1" style="color: white;font-weight: bold;font-size: 17px;font-family: Akzidenz-Grotesk"><%=request.getParameter("perfil")%>⠀<i class="bi bi-person-circle"></i></a>
        <a href="${pageContext.request.contextPath}/PerfildeUsuario?a=tickets" class="my-1 mx-1" style="color: white;font-weight: bold;font-size: 17px;font-family: Akzidenz-Grotesk"> Mis tickets⠀<i class="bi bi-ticket-perforated"></i> </a>
        <a href="${pageContext.request.contextPath}/loguin?action=logout" class="my-1 mx-1" style="color: white;font-weight: bold;font-size: 17px;font-family: Akzidenz-Grotesk">Cerrar Sesión⠀<i class="bi bi-box-arrow-right"></i></a>
    </div>
</nav>

<body class="bodycolor">

</body>

<style>
    .nav2{
        margin-left: 0px;
    }
    .bodycolor {
        background: rgb(147, 151, 157);
        background: linear-gradient(0deg, rgb(183, 185, 189) 0%, rgb(103, 103, 103) 80%);
        background-repeat: no-repeat ;
        background-size: cover;
        background-position: center center;
        background-attachment: fixed;
    }
    @font-face { font-family: "Akzidenz-Grotesk"; src: url('<%=request.getContextPath()%>/Imagenes/akzidenz.otf'); }

</style>

<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
