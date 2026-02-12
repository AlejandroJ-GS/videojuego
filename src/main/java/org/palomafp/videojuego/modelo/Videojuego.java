package org.palomafp.videojuego.modelo;

import java.util.ArrayList;

public class Videojuego {
    private String genero;
    private String dispositivo;
    private Double precio;
    private String codJuego;
    private ArrayList <Mapa> mapas;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Personaje> personajes;

    public Videojuego(String genero, String dispositivo, Double precio,  ArrayList <Mapa> m1, ArrayList <Usuario> u1, ArrayList <Personaje> p1 ,String codJuego) {
        this.genero = genero;
        this.dispositivo = dispositivo;
        this.precio = precio;
        this.mapas=m1;
        this.usuarios=u1;
        this.personajes=p1;
        this.codJuego=codJuego;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodJuego() {
        return codJuego;
    }

    public void setcodJuego(String codJuego) {
        this.codJuego = codJuego;
    }
    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ArrayList <Mapa> getMapas() {
        return mapas;
    }

    public void setMapas(ArrayList <Mapa> mapas) {
        this.mapas = mapas;
    }

    public ArrayList <Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList <Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList <Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList <Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "genero='" + genero + '\'' +
                ", dispositivo='" + dispositivo + '\'' +
                ", precio=" + precio +
                ", mapa= "+ mapas+
                ", usuario= " + usuarios +
                ", personajes= "+ personajes +
                '}';
    }
}
