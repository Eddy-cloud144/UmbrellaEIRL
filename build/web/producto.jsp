<%@page import="modelo.Producto"%>
<%@page import="modelo.Combos"%>
<%@page import="modelo.Empleado"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>SISCLICO</title>
        <link rel="stylesheet" href="asset/styles/headerandfooter.css" />
        <link rel="stylesheet" href="asset/styles/styleregistro.css" />
        <!-- Bootstrap CSS -->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
            crossorigin="anonymous"
            />

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
            crossorigin="anonymous"
        ></script>
    </head>
    <body>
        <header class="header__container">
            <div class="header__container--banner">
                <img src="asset/img/logo-umbrella.png" alt="" />
            </div>
            <nav class="navegation">
                <div class="item--nav">
                    <p>Mantenimiento</p>
                    <ul>
                        <li><a href="CControlador?accion=empleado">Registro Empleado</a></li>
                        <li><a href="CControlador?accion=proveedor">Registro Proveedor</a></li>
                        <li><a href="CControlador?accion=producto">Registro Producto</a></li>
                        <li><a href="">Registro</a></li>
                    </ul>
                </div>
                <div class="item--nav">
                    <p>Consultas</p>
                    <ul>
                        <li><a href="">Consulta de Stock</a></li>
                    </ul>
                </div>
                <div class="item--nav">
                    <p>Reportes</p>
                    <ul>
                        <li><a href="">Reporte Empleado</a></li>
                        <li><a href="">Reporte Proveedor</a></li>
                        <li><a href="">Reporte Producto</a></li>
                        <li><a href="">Reporte Empleado</a></li>
                    </ul>
                </div>
                <div class="item--nav">
                    <p>Utilidades</p>
                    <ul>
                        <li><a href="CControlador?accion=usuario">Crear Usuario</a></li>
                        <li><a href="">Modificar Usuario</a></li>
                        <li><a href="">Cambiar Contraseña</a></li>
                    </ul>
                </div>
                <div class="item--nav">
                    <p>Salir del Sistema</p>
                    <ul>
                        <li><a href="">Cerrar Session</a></li>
                    </ul>
                </div>
            </nav>
        </header>
        <main class="registro__container">
            <section class="container">
                <form action="CControlador" method="get">
                    <div class="btn--nuevo">
                        <button ><a href="CControlador?accion=registarProducto">Nuevo</a></button>
                    </div>
                    <div class="buscar">
                        <div class="buscar--input">
                            <p>Nombre</p>
                            <div class="input">
                                <input type="text" />
                            </div>
                        </div>
                        <div class="buscar--input">
                            <p>Apellido</p>
                            <div class="input">
                                <input type="text" />
                            </div>
                        </div>
                        <div class="buscar--input">
                            <p>Tipo de documento</p>
                            <div class="input">
                                <select name="tDocumento" id="cars">
                                    <option value="">Seleccionar</option>
                                    


                                </select>
                            </div>
                        </div>
                        <div class="buscar--input">
                            <p>N° documento</p>
                            <div class="input">
                                <input type="text" />
                            </div>
                        </div>
                        <div class="buscar--input">
                            <p>Estado</p>
                            <div class="input">
                                <select name="estado" id="cars">
                                    <option value="">Seleccionar</option>
                                    <option value="1">Activos</option>
                                    <option value="0">Inactivos</option>
                                </select>
                            </div>
                        </div>
                        <div class="buscar--input button">
                            <button>buscar</button>
                        </div>
                    </div>
                </form>
                <div class="table--container">
                    <table class="table">
                        <thead>
                        <th></th>
                        <th>Codigo</th>
                        <th>Producto</th>
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Cantidad Minima</th>
                        <th>Cantidad Maxima</th>
                        <th>Precio</th>
                        <th>ACCION</th>
                        </thead>
                        <%  ArrayList<Producto> lista = (ArrayList<Producto>) request.getAttribute("lista");
                            for (int i = 0; i < lista.size(); i++) {
                                Producto p = lista.get(i);
                        %>

                        <tr>
                            <th></th>
                            <td><%=p.getId_producto()%></td>
                            <td><%=p.getNombre_producto()%></td>
                            <td><%=p.getId_marca()%></td>
                            <td><%=p.getId_modelo()  %></td>
                            <td><%=p.getCantidad_min()%></td>
                            <td><%=p.getCantidad_max()%></td>
                            <td><%=p.getCosto_unitario() %></td>
                            <td>
                                <a href="modificarProducto.jsp?accion=modificarProducto&id=<%=p.getId_producto()%>">Modificar</a>
                                /
                                <a href="CControlador?accion=eliminarProducto&id=<%=p.getId_producto()%>">Eliminar</a>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                </div>
            </section>
        </main>
        <footer>

            <div class="user">
                <span class="span--img user--img"></span>
                <label for="">EDDY.GUIZADO</label>
            </div>
            <div class="area">
                <span class="span--img area--img"></span>
                <label for="">COMPUTO</label>
            </div>
            <div class="subarea">
                <span class="span--img sub--img"></span>
                <label for="">INFORMATICA</label>
            </div>
            <div class="date">
                <span class="span--img date--img"></span>
                <label for="">12/05/2021</label>
            </div>
        </footer>
    </body>
</html>
