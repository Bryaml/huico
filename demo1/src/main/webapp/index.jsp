<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <title>Hello, world!</title>

</head>
<body>

<div class="container">


    <form  action="ServletEncuesta" method="post">
        <di class="row">


            <table class="table table-striped" >
                <thead>
                <tr>
                    <th scope="col">Caracteristica</th>
                    <th scope="col">mala</th>
                    <th scope="col">regular</th>
                    <th scope="col">buena</th>
                    <th scope="col">muy buena</th>
                    <th scope="col">Excelente</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">Funcionalidad</th>

                    <td> <input class="form-check-input" type="radio" name="funcionalidad" id="mala" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="funcionalidad" id="regular" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="funcionalidad" id="buena" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="funcionalidad" id="muyBuena" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="funcionalidad" id="Excelente" value="5" ></td>

                </tr>

                <tr>
                    <th scope="row">Confiabilidad</th>
                    <td> <input class="form-check-input" type="radio" name="confiabilidad" id="mala2" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="confiabilidad" id="regular2" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="confiabilidad" id="buena2" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="confiabilidad" id="muyBuena2" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="confiabilidad" id="Excelente2" value="5" ></td>
                </tr>

                <tr>
                    <th scope="row">Usabilidad</th>
                    <td> <input class="form-check-input" type="radio" name="usabilidad" id="mala3" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="usabilidad" id="regular3" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="usabilidad" id="buena3" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="usabilidad" id="muyBuena3" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="usabilidad" id="Excelente3" value="5" ></td>
                </tr>
                <tr>
                    <th scope="row">Rendimiento</th>
                    <td> <input class="form-check-input" type="radio" name="redimiento" id="mala4" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="redimiento" id="regular4" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="redimiento" id="buena4" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="redimiento" id="muyBuena4" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="redimiento" id="Excelente4" value="5" ></td>
                </tr>
                <tr>
                    <th scope="row">Mantenimiento</th>
                    <td> <input class="form-check-input" type="radio" name="mantenimiento" id="mala5" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="mantenimiento" id="regular5" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="mantenimiento" id="buena5" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="mantenimiento" id="muyBuena5" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="mantenimiento" id="Excelente5" value="5" ></td>
                </tr>
                <tr>
                    <th scope="row">Portabilidaad</th>
                    <td> <input class="form-check-input" type="radio" name="portabilidad" id="mala6" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="portabilidad" id="regular6" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="portabilidad" id="buena6" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="portabilidad" id="muyBuena6" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="portabilidad" id="Excelente6" value="5" ></td>
                </tr>
                <tr>
                    <th scope="row">seguridad</th>
                    <td> <input class="form-check-input" type="radio" name="seguridad" id="mala7" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="seguridad" id="regular7" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="seguridad" id="buena7" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="seguridad" id="muyBuena7" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="seguridad" id="Excelente7" value="5" ></td>
                </tr>
                <tr>
                    <th scope="row">compatibilidad</th>
                    <td> <input class="form-check-input" type="radio" name="compatibilidad" id="mala8" value="1"></td>
                    <td> <input class="form-check-input" type="radio" name="compatibilidad" id="regular8" value="2" ></td>
                    <td> <input class="form-check-input" type="radio"name="compatibilidad" id="buena8" value="3" ></td>
                    <td> <input class="form-check-input" type="radio"name="compatibilidad" id="muyBuena8" value="4" ></td>
                    <td> <input class="form-check-input" type="radio"name="compatibilidad" id="Excelente8" value="5" ></td>
                </tr>
                </tbody>
            </table>

            <div class="col-md-12">

                <label for="name" class="form-label" >Nombre</label>
                <input type="text" class="form-control" id="name" name="name" >

            </div>
            <div class="col-md-12">

                <label for="escuela" class="form-label" >escuela</label>
                <input type="text" class="form-control" id="escuela" name="escuela" >

            </div>
</div>
</di>

<button class="btn btn-danger">dsgsv</button>



</form>
</div>

<a href="${pageContext.request.contextPath}/ServletEncuesta">personas</a>




<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
-->
</body>
</html>

