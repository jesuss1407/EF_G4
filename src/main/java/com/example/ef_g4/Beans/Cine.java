package com.example.ef_g4.Beans;

public class Cine {
    private int idCine;
    private String nombre;
    private Cadena cadena;

    public Cine() {
    }

    public Cine(int idCine) {
        this.idCine = idCine;
    }

    public Cine(int idCine, String nombre, Cadena cadena) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.cadena = cadena;
    }

    /**
     * @return the idCine
     */
    public int getIdCine() {
        return idCine;
    }

    /**
     * @param idCine the idCine to set
     */
    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cadena
     */
    public Cadena getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }
}
