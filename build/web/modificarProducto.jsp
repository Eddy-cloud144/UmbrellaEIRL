<%@page import="modelo.Producto"%>
<%@page import="modelo.Combos"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="config.UmbrellaDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="modelo.Empleado"%>
<%@page import="modelo.TipoDocumento"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>SISCLICO</title>
        <link rel="stylesheet" href="asset/styles/headerandfooter.css" />
        <link rel="stylesheet" href="asset/styles/styleregistro.css" />
        <link rel="stylesheet" href="asset/styles/stylerempleado.css" />
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
                        <li><a href="">Registro Empleado</a></li>
                        <li><a href="">Registro Proveedor</a></li>
                        <li><a href="">Registro Producto</a></li>
                        <li><a href="">Registro Compra</a></li>
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
                        <li><a href="">Registro Empleado</a></li>
                        <li><a href="">Registro Proveedor</a></li>
                        <li><a href="">Registro Producto</a></li>
                        <li><a href="">Registro Empleado</a></li>
                    </ul>
                </div>
                <div class="item--nav">
                    <p>Utilidades</p>
                    <ul>
                        <li><a href="">Crear Usuario</a></li>
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
                <form class="container__registro--form" action="CControlador" method="">

                    <%
                        UmbrellaDB umbrella = new UmbrellaDB();
                        Producto p = new Producto();
                        String cod = request.getParameter("id");
                        String sql = "select *from producto where id_producto=?";
                        try {
                            PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                            ps.setString(1, cod);
                            ResultSet rs = ps.executeQuery();
                            while (rs.next()) {
                                p.setId_producto(rs.getString("id_producto"));
                                p.setId_modelo(rs.getString("id_modelo"));
                                p.setId_marca(rs.getString("id_marca"));
                                p.setNombre_producto(rs.getString("nombre_producto"));
                                p.setDescripcion(rs.getString("descripcion"));
                                p.setCantidad_min( rs.getInt("cantidad_min"));
                                p.setCantidad_max(rs.getInt("cantidad_max"));
                                p.setUnidad_medida(rs.getString("unidad_medida"));
                                p.setCosto_unitario(rs.getDouble("costo_unitario"));
                            }
                        } catch (Exception error) {

                        }
                    %>


                    <div class="registro--input">
                        <p>Id Producto</p>
                        <div class="input">
                            <input type="text"  name="txtid_producto" value="<%=p.getId_producto()%>" />
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Id Modelo</p>
                        <div class="input">
                            <input type="text" name="txttidtipodoc" value="<%=p.getId_modelo()%>"/>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Id Marca</p>
                        <div class="input">
                            <input type="text" name="txtidmarca" value="<%=p.getId_marca()%>"/>
                        </div>
                    </div>

                    <div class="registro--input">
                        <p>Nombre</p>
                        <div class="input">
                            <input class="name" type="text" name="txtnombreproducto" value="<%=p.getNombre_producto()%>"/>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Descripcion</p>
                        <div class="input">
                            <input class="ape" type="text" name="txtdescripcion" value="<%=p.getDescripcion()%>"/>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Cantidad Minima</p>
                        <div class="input">
                            <input class="dirc" type="text" name="txtcantidadmin" value="<%=p.getCantidad_min()%>" />
                        </div>
                    </div>
                        <div class="registro--input">
                        <p>Cantidad Maxima</p>
                        <div class="input">
                            <input class="dirc" type="text" name="txtcantidadmax" value="<%=p.getCantidad_max()%>" />
                        </div>
                    </div>
                    </div>
                        <div class="registro--input">
                        <p>Cantidad Maxima</p>
                        <div class="input">
                            <input class="dirc" type="text" name="txtcantidadmax" value="<%=p.getCantidad_max()%>" />
                        </div>
                    </div>
                    </div>
                        <div class="registro--input">
                        <p>Unidad</p>
                        <div class="input">
                            <input class="dirc" type="text" name="txtunidad" value="<%=p.getUnidad_medida()%>" />
                        </div>
                    </div>
                    </div>
                        <div class="registro--input">
                        <p>Costo por Unidad</p>
                        <div class="input">
                            <input class="dirc" type="text" name="txtcosto_unitario" value="<%=p.getCosto_unitario()%>" />
                        </div>
                    </div>
                    
                    </div>
                    <div class="button--registro">

                        <button class="button--grabar" name="accion" value="actualizarProducto">Actualizar</button>
                        <button class="button--cancelar"name="accion" value="producto" >Cancelar</button>
                    </div>
                </form>
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

