package org.palomafp.videojuego.modelo;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String id;
    private String correo;
    private Personaje personaje;
    private ArrayList <Videojuego> videojuegos;

    public Usuario(String nombre, String id, String correo, ArrayList <Videojuego> videojuegos) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.videojuegos = videojuegos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public ArrayList <Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(ArrayList <Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", correo='" + correo + '\'' +
                "videojuegos" + videojuegos +
                '}';
    }
}

