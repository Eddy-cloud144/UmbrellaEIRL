<%@page import="modelo.Usuarios"%>
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
                        <li><a href="">Reporte Empleado</a></li>
                        <li><a href="">Reporte Proveedor</a></li>
                        <li><a href="">Reporte Producto</a></li>
                        <li><a href="">Reporte Compra</a></li>
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
                        Usuarios u = new Usuarios();
                        String cod = request.getParameter("id");
                        String sql = "select *from acceso where id_empleado=?";

                        try {
                            PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                            ps.setString(1, cod);
                            ResultSet rs = ps.executeQuery();
                            while (rs.next()) {
                                u.setId_empleado(rs.getString("id_empleado"));
                                u.setId_tipoEmpleado(rs.getString("id_tipoEmpleado"));
                                u.setNom_usuario(rs.getString("nombre_usuario"));
                                u.setPassword(rs.getString("password"));
                                u.setFecha(rs.getDate("fecha"));
                                u.setEstado(Boolean.parseBoolean(rs.getString("estado")));
                            }
                        } catch (Exception error) {

                        }
                    %>


                    <div class="registro--input">
                        <p>Id empleado</p>
                        <div class="input">
                            <input type="text"  name="txtid_empleado" value="<%=u.getId_empleado()%>" />
                        </div>
                    </div>

                    <div class="registro--input">
                        <p>Tipo Empleado</p>
                        <div class="input">
                            <input type="text"  name="txtid_tipoEmpleado" value="<%=u.getId_tipoEmpleado()%>" />
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Usuario</p>
                        <div class="input">
                            <input type="text"  name="txtnom_usuario" value="<%=u.getNom_usuario()%>" />
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Password</p>
                        <div class="input">
                            <input type="text"  name="txtpassword" value="<%=u.getPassword()%>" />
                        </div>
                    </div>    
                    <div class="registro--input">
                        <p>Fecha</p>
                        <div class="input">
                            <input type="text"  name="txtfecha" value="<%=u.getFecha()%>" />
                        </div>
                    </div>
                        
                    <div class="registro--input">
                            <p>Estado</p>
                            <div class="input">
                                <select name="txtestado" >
                                    <option value="<%=u.isEstado()%>"><%=u.isEstado()%></option>
                                    <option value="true">Activo</option>
                                    <option value="false">Desactivo</option>
                                </select>
                            </div>
                        </div>
                    <div class="button--registro">
                        <button class="button--grabar" name="accion" value="actualizarUsuario">Actualizar</button>
                        <button class="button--cancelar"name="accion" value="usuario" >Cancelar</button>
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

