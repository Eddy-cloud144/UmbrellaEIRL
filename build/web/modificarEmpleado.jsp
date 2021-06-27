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
                        Empleado e = new Empleado();
                        String cod = request.getParameter("id");
                        String sql = "select *from empleado where id_empleado=?";

                        try {
                            PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                            ps.setString(1, cod);
                            ResultSet rs = ps.executeQuery();
                            while (rs.next()) {
                                e.setId(rs.getString("id_empleado"));
                                e.setId_area(rs.getString("id_area"));
                                e.setId_tipoDocumento(rs.getString("id_tipoDocumento"));
                                e.setNumeroDocumento(rs.getString("numeroDocumento"));
                                e.setNombre(rs.getString("nombre_empleado"));
                                e.setApellido(rs.getString("apellido_empleado"));
                                e.setDireccion(rs.getString("direccion"));
                                e.setTelefono(rs.getString("telefono"));
                                e.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                                e.setEmail(rs.getString("email"));
                                e.setGenero(rs.getString("genero"));
                                e.setEstado(Boolean.parseBoolean(rs.getString("estado")));
                            }
                        } catch (Exception error) {

                        }
                    %>


                    <div class="registro--input">
                        <p>Id empleado</p>
                        <div class="input">
                            <input type="text"  name="txtid" value="<%=e.getId()%>" />
                        </div>
                    </div>


                    <div class="registro--input">
                        <p>Id Tipo_Doc</p>
                        <div class="input">
                            <input type="text" name="txttidtipodoc" value="<%=e.getId_tipoDocumento()%>"/>
                        </div>
                    </div>
                    <div class="columns">
                        <div class="registro--input">
                            <p>Tipo documento</p>
                            <div class="input">
                                <select name="txttidtipodoc" >
                                    <option value=""><%=e.getId_tipoDocumento()%></option>

                                </select>
                            </div>
                        </div>
                    </div>


                    <div class="registro--input">
                        <p>Número</p>
                        <div class="input">
                            <input type="text" name="txtnumero" value="<%=e.getNumeroDocumento()%>"/>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Nombre</p>
                        <div class="input">
                            <input class="name" type="text" name="txtnombre" value="<%=e.getNombre()%>"/>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Apellidos</p>
                        <div class="input">
                            <input class="ape" type="text" name="txtapellido" value="<%=e.getApellido()%>"/>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Dirección</p>
                        <div class="input">
                            <input class="dirc" type="text" name="txtdireccion" value="<%=e.getDireccion()%>" />
                        </div>
                    </div>
                    <div class="columns">
                        <div class="registro--input">
                            <p>Telefono</p>
                            <div class="input">
                                <input type="text"name="txttelefono" value="<%=e.getTelefono()%>" />
                            </div>
                        </div>
                        <div class="registro--input">
                            <p class="label--dising">Fecha Nacimiento</p>
                            <div class="input">
                                <input type="date" name="txtfecha" value="<%=e.getFecha_nacimiento()%>"/>
                            </div>
                        </div>
                    </div>
                    <div class="registro--input">
                        <p>Email</p>
                        <div class="input">
                            <input class="email" type="text" name="txtemail" value="<%=e.getEmail()%>"/>
                        </div>
                    </div>
                    <div class="columns">
                        <div class="registro--input">
                            <p>Genero</p>
                            <div class="input">
                                <select name="txtgenero" >
                                    <option value="<%=e.getGenero()%>"><%=e.getGenero()%></option>
                                    <option value="M">Masculino</option>
                                    <option value="F">Femenino</option>
                                </select>
                            </div>
                        </div>
                        <div class="registro--input">
                            <p>Estado</p>
                            <div class="input">
                                <select name="txtestado" >
                                    <option value="<%=e.isEstado()%>"><%=e.isEstado()%></option>
                                    <option value="true">Activo</option>
                                    <option value="false">Desactivo</option>
                                </select>
                            </div>
                        </div>
                        <div class="registro--input">
                            <p>Area</p>
                            <div class="input">
                                <select name="txtidarea" >
                                    <option value="<%=e.getId_area()%>"><%=e.getId_area()%></option>

                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="button--registro">

                        <button class="button--grabar" name="accion" value="actualizar">Actualizar</button>
                        <button class="button--cancelar"name="accion" value="empleado" >Cancelar</button>
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

