package com.example.ef_g4.DTO;

public class CartelerasDTO {

    private String nombreComercial;
    private String nombrePelicula;
    private String nombreCine;
    private int carteleraDoblada;
    private int carteleraSubtitulada;
    private int carteleratresD;
    private String horario;

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public int getCarteleraDoblada() {
        return carteleraDoblada;
    }

    public void setCarteleraDoblada(int carteleraDoblada) {
        this.carteleraDoblada = carteleraDoblada;
    }

    public int getCarteleraSubtitulada() {
        return carteleraSubtitulada;
    }

    public void setCarteleraSubtitulada(int carteleraSubtitulada) {
        this.carteleraSubtitulada = carteleraSubtitulada;
    }

    public int getCarteleratresD() {
        return carteleratresD;
    }

    public void setCarteleratresD(int carteleratresD) {
        this.carteleratresD = carteleratresD;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
