package org.palomafp.videojuego.modelo;
import java.util.List;

public class Mapa {
    private String tamaño;
    private String descripcion;
    private int zonas;
    private int numUsuario;
    private List<Zona> zonasLista;

    public Mapa(String tamaño, String descripcion, int zonas, int numUsuario) {
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.zonas = zonas;
        this.numUsuario = numUsuario;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getZonas() {
        return zonas;
    }

    public void setZonas(int zonas) {
        this.zonas = zonas;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public List<Zona> getZonasLista() {
        return zonasLista;
    }

    public void setZonasLista(List<Zona> zonasLista) {
        this.zonasLista = zonasLista;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "tamaño='" + tamaño + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", zonas=" + zonas +
                ", numUsuario=" + numUsuario +
                '}';
    }
}
