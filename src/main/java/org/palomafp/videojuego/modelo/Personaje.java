package org.palomafp.videojuego.modelo;
public class Personaje {
    private String rol;
    private String descripcion;
    private int nivel;

    public Personaje(String rol, String descripcion, int nivel) {
        this.rol = rol;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "rol='" + rol + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}