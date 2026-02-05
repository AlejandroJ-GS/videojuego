package org.palomafp.videojuego.modelo;
import java.util.List;

public class Videojuego {
    private String genero;
    private String dispositivo;
    private Double precio;
    private List<Mapa> mapas;
    private List<Usuario> usuarios;
    private List<Personaje> personajes;

    public Videojuego(String genero, String dispositivo, Double precio) {
        this.genero = genero;
        this.dispositivo = dispositivo;
        this.precio = precio;
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

    public List<Mapa> getMapas() {
        return mapas;
    }

    public void setMapas(List<Mapa> mapas) {
        this.mapas = mapas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
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
