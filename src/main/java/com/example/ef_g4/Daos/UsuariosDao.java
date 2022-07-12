package com.example.ef_g4.Daos;

import com.example.ef_g4.Beans.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDao extends BaseDao{


    public Empleado validarPass(String password, String codigoPucp){
        Empleado usuario = null;

        String sql = "select * from usuarios where codigo_pucp=? and contraseña=sha2(?,256)";

        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1,codigoPucp);
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
}
