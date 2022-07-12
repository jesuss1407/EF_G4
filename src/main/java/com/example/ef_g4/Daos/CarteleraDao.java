package com.example.ef_g4.Daos;

import com.example.ef_g4.Beans.*;
import com.example.ef_g4.DTO.CartelerasDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarteleraDao extends BaseDao {


    public ArrayList<CartelerasDTO> datosCartelera(){

        ArrayList<CartelerasDTO> datosCartelera= new ArrayList<>();

//        ArrayList<Cadena> cadenas;
//        ArrayList<Cartelera> carteleras;
//        ArrayList<Cine> cines;
//        ArrayList<Pelicula> peliculas;

        String sql="select cad.nombre_comercial,p.nombre,c.nombre,car.doblada,car.subtitulada,car.3d,car.horario from cartelera car\n" +
                "inner join pelicula p on (p.idpelicula=car.idpelicula) \n" +
                "inner join cine c on (c.idcine=car.idcine)\n" +
                "inner join cadena cad on (cad.idcadena=c.idcadena);";


        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql);) {

            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    CartelerasDTO carteleras= new CartelerasDTO();



                    carteleras.setNombreComercial(rs.getString(1));
                    carteleras.setNombrePelicula(rs.getString(2));
                    carteleras.setNombreCine(rs.getString(3));
                    carteleras.setCarteleraDoblada(rs.getInt(4));
                    carteleras.setCarteleraSubtitulada(rs.getInt(5));
                    carteleras.setCarteleratresD(rs.getInt(6));
                    carteleras.setHorario(rs.getString(7));
                    datosCartelera.add(carteleras);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return datosCartelera;
    }



}
