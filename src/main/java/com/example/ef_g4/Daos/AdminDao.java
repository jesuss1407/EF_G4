package com.example.ef_g4.Daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao extends BaseDao {

    public int valor1() {
        String sql = "select count(*) as \"cantidad\" from empleado where idjefe is NULL;";
        int empleadoo = 0;
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try (ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {
                    empleadoo = resultSet.getInt(1);

                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión!");
            e.printStackTrace();
        }
        return empleadoo;
    }

    public int valor2() {
        String sql = "select count(*) from cartelera where 3d = 1;";
        int empleadooo = 0;
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try (ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {
                    empleadooo = resultSet.getInt(1);

                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión!");
            e.printStackTrace();
        }
        return empleadooo;
    }

}
