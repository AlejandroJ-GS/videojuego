package org.palomafp.videojuego.modelo;
/**
 * es un objeto de tipo personaje que tiene una serie de atributos (rol , descripcion , nivel )
 * @author Alejandro y Cristina
 * @version 1.0
 */
public class Personaje {
    private String rol;
    private String descripcion;
    private int nivel;
/**
 * constructor de personaje donde definimos los atributos de personaje 
 * @param rol se trata del rol del personaje , de que tipo es etc
 * @param descripcion se trata de la descripcion del personaje
 * @param nivel se trata del nivel del personaje
 */
    public Personaje(String rol, String descripcion, int nivel) {
        this.rol = rol;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }
/**
 * nos devuelve el rol del personaje
 * @return
 */
    public String getRol() {
        return rol;
    }
/**
 * establecemos el rol del personaje
 * @param rol
 */
    public void setRol(String rol) {
        this.rol = rol;
    }
/**
 * nos devuelve la descripcion del personaje
 * @return
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * establecemos la descripcion del personaje
 * @param descripcion
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * nos devuelve el nivel del personaje
 * @return
 */
    public int getNivel() {
        return nivel;
    }
/**
 * establecemos el nivel del personaje
 * @param nivel
 */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
/**
 * es un metodo sobre el personaje que nos dice todos los atributos
 */
    @Override
    public String toString() {
        return "Personaje{" +
                "rol='" + rol + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}