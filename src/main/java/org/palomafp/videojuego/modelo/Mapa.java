package org.palomafp.videojuego.modelo;

import java.util.ArrayList;

public class Mapa {
    private String tamaño;
    private String descripcion;
    private int zonas;
    private int numUsuario;
    private ArrayList <Zona> zonasLista;

    public Mapa(String tamaño, String descripcion, int zonas, int numUsuario, ArrayList <Zona> zonasLista) {
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.zonas = zonas;
        this.numUsuario = numUsuario;
        this.zonasLista = zonasLista;
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

    public ArrayList <Zona> getZonasLista() {
        return zonasLista;
    }

    public void setZonasLista(ArrayList <Zona> zonasLista) {
        this.zonasLista = zonasLista;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "tamaño='" + tamaño + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", zonas=" + zonas +
                ", numUsuario=" + numUsuario + 
                " , zona= "+ zonasLista +
                '}';
    }
}
