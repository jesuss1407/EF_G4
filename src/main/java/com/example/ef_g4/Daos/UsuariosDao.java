package com.example.ef_g4.Daos;

import com.example.ef_g4.Beans.Cine;
import com.example.ef_g4.Beans.Empleado;
import com.example.ef_g4.Beans.Rol;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuariosDao extends BaseDao{

    public Empleado validarPass(String password, String dni){
        Empleado usuario = null;

        String sql = "select * from empleado where dni=? and dni-salario = ?;";

        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1,dni);
            pstmt.setString(2,password);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    usuario = new Empleado();
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    public ArrayList<Empleado> listaEmpleados() {
        ArrayList<Empleado> empleadoslista = new ArrayList<>();
        Empleado empleado = new Empleado();
        String sql = "select *from empleado e left join rolempleado re on re.idempleado = e.idempleado;";
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try (ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {
                    empleado.setIdEmpleado(resultSet.getInt(1));
                    empleado.setNombre(resultSet.getString(2));
                    empleado.setApellido(resultSet.getString(3));
                    empleado.setDni(resultSet.getString(4));
                    System.out.println(empleado.getDni());
                    empleado.setSalario( resultSet.getBigDecimal(5));
                    empleado.setFechaContrato(resultSet.getString(6));
                    empleado.setNombreUsuario(resultSet.getString(7));
                    empleado.setEdad(resultSet.getInt(8));
                    empleado.setActivo(resultSet.getBoolean(9));
                    Cine cine = new Cine(resultSet.getInt(10));
                    empleado.setCine(cine);
                    Rol rol = new Rol();
                    Rol rol1 = new Rol();
                    rol.setIdRol(resultSet.getInt(11));
                    Empleado empleado1= new Empleado(rol.getIdRol());
                    rol1.setIdRol(resultSet.getInt(12));
                    ArrayList<Rol> rolArrayLis = new ArrayList<Rol>();
                    rolArrayLis.add(rol);
                    rolArrayLis.add(rol1);
                    empleado.setJefe(empleado1);
                    empleado.setRoles(rolArrayLis);
                    empleadoslista.add(empleado);

                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión!");
            e.printStackTrace();
        }
        return empleadoslista;
    }

}
