
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="indicador" scope="session" type="java.lang.String" class="java.lang.String"/>


<html>
<head >

    <meta charset="UTF-8">
    <title>Iniciar Sesión-T3L3 C4MP30N FUTS4L S.A.C 2019</title>

    <meta charset='utf-8'>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!--lin2k-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <link rel="icon" href=
            "icono_header.png"
          type="image/x-icon">

    <!--link-->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.0.0/crypto-js.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />

    <style>

        a {
            text-decoration: none !important;
        }
        @font-face { font-family: "Akzidenz-Grotesk"; src: url('<%=request.getContextPath()%>/akzidenz.otf'); }
    </style>
</head>
<body >
<section class="vh-100" style="background-color: #858585;">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col col-xl-10">
                <div class="card" style="border-radius: 1rem;">
                    <div class="row g-0">
                        <div class="col-md-6 col-lg-5 d-none d-md-block">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
                                 alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
                        </div>
                        <div class="col-md-6 col-lg-7 d-flex align-items-center">
                            <div class="card-body p-4 p-lg-5 text-black">

                                <form method="post" action="<%=request.getContextPath()%>/loguin">

                                    <div class="d-flex align-items-center mb-3 pb-1">
                                        <i class="fa fa-film fa-2x me-3" style="color: #ff6219;"></i>
                                        <span class="h1 fw-bold mb-0" STYLE="font-family: Akzidenz-Grotesk">T3L3 C4MP30N FUTS4L</span>
                                    </div>

                                    <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;font-family: Akzidenz-Grotesk">Ingresa a tu cuenta</h5>


                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="codigo">Ingresa tu DNI</label>
                                        <input required="required" type="number" id="codigo" name="codigo" pattern="^[0-9]*" maxlength="8" minlength="8" class="form-control form-control-lg" />

                                    </div>

                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="password">Contraseña</label>
                                        <input required="required" type="password" id="password" name="password" class="form-control form-control-lg" pattern="^[0-9]*([.,][0-9]+)?" title="Formato de Contraseña no válido"/>

                                    </div>

                                    <div class="pt-1 mb-4">
                                        <button class="btn btn-dark btn-lg btn-block" type="submit" role="button">Iniciar</button>
                                    </div>


                                </form>
                                <%if (session.getAttribute("indicador").equals("error")){%>
                                <div class="text-danger nb-2">
                                    Usuario/Contraseña incorrectos.
                                </div>
                                <%session.removeAttribute("indicador");%>
                                <%}%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


</body>
</html>
