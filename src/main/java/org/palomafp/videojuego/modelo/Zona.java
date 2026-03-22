package org.palomafp.videojuego.modelo;

/**
 * Objeto zona con atributos de tamaño, descripción y tipo
 * @author Cristina Xu y Alejandro
 * @version 1.0
 */
public class Zona {

    //Indica el tamaño de la zona
    private String tamaño;
    //Describe como es la zona
    private String descripcion;
    //Indica el tipo de zona
    private String tipo;

    /**
     * Constructor de  Zona con parametros de entrada
     * @param tamaño Tamaño de la zona
     * @param descripcion Descripción de como es la zona
     * @param tipo Indica que tipo es la zona como desierto, bosque, ciudad, etc.
     */
    public Zona(String tamaño, String descripcion, String tipo) {
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    /**
     * Devuelve el tamaño de la zona
     * @return tamaño de la zona
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Establece el tamaño de la zona
     * @param tamaño tamaño que tiene la zona
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Devuelve una descripcion de como es la zona  
     * @return una descripcion de como es la zona
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece una descripcion de como es la zona
     * @param descripcion una descripción de como es la zona
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Decuelve el tipo de la zona(desierto, bosque, ciudad, etc)
     * @return tipo de la zona
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece que tipo de zona es
     * @param tipo tipo de zona que es
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve toda la información de la zona.
     */
    @Override
    public String toString() {
        return "Zona{" +
                "tamaño='" + tamaño + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
