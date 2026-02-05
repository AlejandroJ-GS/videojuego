package org.palomafp.videojuego.modelo;
import java.util.List;

public class Videojuego {
    private String genero;
    private String dispositivo;
    private Double precio;
    private Mapa[] mapas;
    private Usuario[] usuarios;
    private Personaje[] personajes;

    public Videojuego(String genero, String dispositivo, Double precio, Mapa[] m1, Usuario[] u1, Personaje[] p1) {
        this.genero = genero;
        this.dispositivo = dispositivo;
        this.precio = precio;
        this.mapas=m1;
        this.usuarios=u1;
        this.personajes=p1;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public Mapa[] getMapas() {
        return mapas;
    }

    public void setMapas(Mapa[] mapas) {
        this.mapas = mapas;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "genero='" + genero + '\'' +
                ", dispositivo='" + dispositivo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
