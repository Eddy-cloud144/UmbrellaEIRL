package controlador;

import config.UmbrellaDB;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Combos;
import modelo.Empleado;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Usuarios;

public class CControlador extends HttpServlet {

    UmbrellaDB umbrella = new UmbrellaDB();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("menu")) {
            request.getRequestDispatcher("menu.jsp").forward(request, response);
        } else if (accion.equalsIgnoreCase("registrarEmpleado")) {
            request.getRequestDispatcher("registrarEmpleado.jsp").forward(request, response);
        } else if (accion.equalsIgnoreCase("modificarEmpleado")) {
            request.getRequestDispatcher("modificarEmpleado.jsp").forward(request, response);

        } else if (accion.equalsIgnoreCase("registarProducto")) {
            request.getRequestDispatcher("registarProducto.jsp").forward(request, response);

        } else if (accion.equalsIgnoreCase("modificarProducto")) {
            request.getRequestDispatcher("modificarProducto.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        
        if (accion.equalsIgnoreCase("empleado")) {
            String sql = "select * from empleado";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ArrayList<Empleado> lista = new ArrayList<>();

                while (rs.next()) {
                    Empleado emp = new Empleado(rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5),
                            rs.getString(6), rs.getString(7), rs.getString(8),
                            rs.getDate(9), rs.getString(10), rs.getString(11),
                            rs.getBoolean(12));

                    lista.add(emp);
                }
                request.setAttribute("lista", lista);
                //cargar combo
                String sql2 = "select * from tipo_documento";
                PreparedStatement ps2 = umbrella.getConexion().prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                ArrayList<Combos> lista2 = new ArrayList<>();
                while (rs2.next()) {
                    Combos c = new Combos(rs2.getString(1), rs2.getString(2));
                    lista2.add(c);
                }
                request.setAttribute("cargarTD", lista2);

                request.getRequestDispatcher("empleado.jsp").forward(request, response);
            } catch (Exception e) {
            }
        } else if (accion.equalsIgnoreCase("registarEmpleado")) {
            request.getRequestDispatcher("CControlador?accion=registarEmpleado").forward(request, response);

        } else if (accion.equalsIgnoreCase("grabar")) {
            String id = request.getParameter("txtid");
            String idarea = request.getParameter("txtidarea");
            String txttidtipodoc = request.getParameter("txttidtipodoc");
            String numero = request.getParameter("txtnumero");
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String direccion = request.getParameter("txtdireccion");
            String telefono = request.getParameter("txttelefono");
            String fecha = request.getParameter("txtfecha");
            String email = request.getParameter("txtemail");
            String genero = request.getParameter("txtgenero");
            boolean estado = Boolean.parseBoolean(request.getParameter("txtestado"));
            String sql = "insert into empleado values(?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, idarea);
                ps.setString(3, txttidtipodoc);
                ps.setString(4, numero);
                ps.setString(5, nombre);
                ps.setString(6, apellido);
                ps.setString(7, direccion);
                ps.setString(8, telefono);
                ps.setString(9, fecha);
                ps.setString(10, email);
                ps.setString(11, genero);
                ps.setBoolean(12, estado);

                ps.executeUpdate();

                request.getRequestDispatcher("CControlador?accion=empleado").forward(request, response);
            } catch (Exception e) {
                System.out.println("Error al guardar");
            }
        } else if (accion.equalsIgnoreCase("modificarEmpleado")) {
            request.getRequestDispatcher("CControlador?accion=modificarEmpleado").forward(request, response);
        } else if (accion.equalsIgnoreCase("actualizar")) {
            String id = request.getParameter("txtid");
            String idarea = request.getParameter("txtidarea");
            String txttidtipodoc = request.getParameter("txttidtipodoc");
            String numero = request.getParameter("txtnumero");
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String direccion = request.getParameter("txtdireccion");
            String telefono = request.getParameter("txttelefono");
            String fecha = request.getParameter("txtfecha");
            String email = request.getParameter("txtemail");
            String genero = request.getParameter("txtgenero");
            boolean estado = Boolean.parseBoolean(request.getParameter("txtestado"));
            String sql = "update empleado set id_area=?,id_tipoDocumento=?,numeroDocumento=?"
                    + ",nombre_empleado=?,apellido_empleado=?,direccion=?,telefono=?"
                    + ",fecha_nacimiento=? ,email=?,genero=?,estado=? where id_empleado='" + id + "'";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, idarea);
                ps.setString(2, txttidtipodoc);
                ps.setString(3, numero);
                ps.setString(4, nombre);
                ps.setString(5, apellido);
                ps.setString(6, direccion);
                ps.setString(7, telefono);
                ps.setString(8, fecha);
                ps.setString(9, email);
                ps.setString(10, genero);
                ps.setBoolean(11, estado);
                ps.executeUpdate();
                request.getRequestDispatcher("CControlador?accion=empleado").forward(request, response);
            } catch (Exception e) {
                System.out.println("Error al Actualizar");
            }
        } else if (accion.equalsIgnoreCase("eliminarEmpleado")) {
            String id = request.getParameter("id");
            String sql = "delete from empleado where id_empleado=?";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, id);
                ps.executeUpdate();
                request.getRequestDispatcher("CControlador?accion=empleado").forward(request, response);
            } catch (Exception e) {

            }
        } else if (accion.equalsIgnoreCase("proveedor")) {
            String sql = "select * from proveedor";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ArrayList<Proveedor> lista = new ArrayList<>();

                while (rs.next()) {
                    Proveedor prov = new Proveedor(
                            rs.getString(1), rs.getString(2), rs.getString(3),
                            rs.getString(4), rs.getString(5), rs.getString(6),
                            rs.getString(7), rs.getString(8), rs.getBoolean(9),
                            rs.getString(10), rs.getString(11), rs.getString(12));
                    lista.add(prov);
                }
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("proveedor.jsp").forward(request, response);
            } catch (Exception e) {
            }
        } else if (accion.equalsIgnoreCase("eliminarProveedor")) {
            String id = request.getParameter("id");
            String sql = "delete from proveedor where id_proveedor=?";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, id);
                ps.executeUpdate();
                request.getRequestDispatcher("CControlador?accion=proveedor").forward(request, response);
            } catch (Exception e) {

            }
        } else if (accion.equalsIgnoreCase("producto")) {
            String sql = "select * from producto";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ArrayList<Producto> lista = new ArrayList<>();

                while (rs.next()) {
                    Producto p = new Producto(rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5),
                            rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getDouble(9));
                    lista.add(p);
                }
                request.setAttribute("lista", lista);
                //cargar combo
                /*
                String sql2 = "select * from tipo_documento";
                PreparedStatement ps2 = umbrella.getConexion().prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                ArrayList<Combos> lista2 = new ArrayList<>();
                while (rs2.next()) {
                    Combos c = new Combos(rs2.getString(1), rs2.getString(2));
                    lista2.add(c);
                }
                request.setAttribute("cargarTD", lista2);
                 */
                request.getRequestDispatcher("producto.jsp").forward(request, response);
            } catch (Exception e) {
            }
        } else if (accion.equalsIgnoreCase("registarProducto")) {
            request.getRequestDispatcher("CControlador?accion=registarProducto").forward(request, response);

        } else if (accion.equalsIgnoreCase("grabarProducto")) {
            String id = request.getParameter("txtid_producto");
            String id_modelo = request.getParameter("txtid_modelo");
            String id_marca = request.getParameter("txtid_marca");
            String nombre_prodcto = request.getParameter("txtnombre_producto");
            String descripcion = request.getParameter("txtdescripcion");
            int cantidad_min = Integer.parseInt(request.getParameter("txtcantidad_min"));
            int cantidad_max = Integer.parseInt(request.getParameter("txtcantidad_max"));
            String unidad = request.getParameter("txtunidad");
            double costo_unitario = Double.parseDouble(request.getParameter("txtcosto_unitario"));
            String sql = "insert into producto values(?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);

                ps.setString(1, id);
                ps.setString(2, id_modelo);
                ps.setString(3, id_marca);
                ps.setString(4, nombre_prodcto);
                ps.setString(5, descripcion);
                ps.setInt(6, cantidad_max);
                ps.setInt(7, cantidad_min);
                ps.setString(8, unidad);
                ps.setDouble(9, costo_unitario);

                ps.executeUpdate();

                request.getRequestDispatcher("CControlador?accion=producto").forward(request, response);
            } catch (Exception e) {
                System.out.println("Error al guardar");
            }

        } else if (accion.equalsIgnoreCase("actualizarProducto")) {
            String id = request.getParameter("txtid_producto");
            String id_modelo = request.getParameter("txtid_modelo");
            String id_marca = request.getParameter("txtid_marca");
            String nombre_prodcto = request.getParameter("txtnombre_producto");
            String descripcion = request.getParameter("txtdescripcion");
            int cantidad_min = Integer.parseInt(request.getParameter("txtcantidad_min"));
            int cantidad_max = Integer.parseInt(request.getParameter("txtcantidad_max"));
            String unidad = request.getParameter("txtunidad");
            double costo_unitario = Double.parseDouble(request.getParameter("txtcosto_unitario"));

            String sql = "update producto set id_modelo=?,id_marca=?,nombre_producto=?"
                    + ",descripcion=?,cantidad_max=?,cantidad_min=?,costo_unitario=? where id_producto='" + id + "'";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, id_modelo);
                ps.setString(2, id_marca);
                ps.setString(3, nombre_prodcto);
                ps.setString(4, descripcion);
                ps.setInt(5, cantidad_max);
                ps.setInt(6, cantidad_min);
                ps.setString(7, unidad);
                ps.setDouble(8, costo_unitario);
                ps.executeUpdate();
                request.getRequestDispatcher("CControlador?accion=producto").forward(request, response);
            } catch (Exception e) {
                System.out.println("Error al Actualizar");
            }
        } else if (accion.equalsIgnoreCase("eliminarProducto")) {
            String id = request.getParameter("id");
            String sql = "delete from producto where id_producto=?";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, id);
                ps.executeUpdate();
                request.getRequestDispatcher("CControlador?accion=producto").forward(request, response);
            } catch (Exception e) {

            }
        } else if (accion.equalsIgnoreCase("usuario")) {
            String sql = "select * from acceso";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ArrayList<Usuarios> lista = new ArrayList<>();
                while (rs.next()) {
                    Usuarios u = new Usuarios(rs.getString(1), rs.getString(2), rs.getString(3),
                            rs.getString(4), rs.getDate(5), rs.getBoolean(6));
                    lista.add(u);
                }
                request.setAttribute("lista", lista); 
                request.getRequestDispatcher("usuario.jsp").forward(request, response);
            } catch (Exception e) {
            }
        }else if(accion.equalsIgnoreCase("actualizarUsuario")){
            String id = request.getParameter("txtid_empleado");
            String id_tipoEmpleado = request.getParameter("txtid_tipoEmpleado");
            String nombre_usuario = request.getParameter("txtnombre_usuario");
            String password = request.getParameter("txtpassword");
            String fecha =request.getParameter("txtfecha");
            boolean estado=Boolean.parseBoolean(request.getParameter("estado"));

            String sql = "update acceso set id_tipoEmpleado=?,nombre_usuario=?,password=?"
                    + ",fecha=?,estado=? where id_empleado='" + id + "'";
            try {
                PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
                ps.setString(1, id_tipoEmpleado);
                ps.setString(2, nombre_usuario);
                ps.setString(3, password);
                ps.setString(4, fecha);
                ps.setBoolean(5, estado);
                ps.executeUpdate();
                request.getRequestDispatcher("CControlador?accion=usuario").forward(request, response);
            } catch (Exception e) {
                System.out.println("Error al Actualizar Usuario");
            }
        } else {
            request.getRequestDispatcher("CControlador?accion=menu").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
