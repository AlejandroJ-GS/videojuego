package org.palomafp.videojuego.modelo;

import java.util.ArrayList;
/**
 * es un objeto de tipo mapa que tiene una serie de atributos (tamaño , descripcion , zonas numUsuario y un arrays de las zonas )
 * @author Alejandro y Cristina
 * @version 1.0
 */
public class Mapa {
    private String tamaño;
    private String descripcion;
    private int zonas;
    private int numUsuario;
    private ArrayList<Zona> zonasLista=null;
/**
 * constructor de mapa donde definimos los atributos de mapa  
 * @param tamaño se trata del tamaño del mapa en metros
 * @param descripcion se trata de una explicacion tecnica del mapa
 * @param zonas se trata del numero de zonas
 * @param numUsuario se trata del numero de personas en el mapa
 * @param zonasLista se trata una lista de todas las zonas
 */
    public Mapa(String tamaño, String descripcion, int zonas, int numUsuario, ArrayList<Zona> zonasLista) {
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.zonas = zonas;
        this.numUsuario = numUsuario;
        this.zonasLista = zonasLista;
    }
/**
 * nos devuelve el tamaño del mapa
 * @return 
 */
    public String getTamaño() {
        return tamaño;
    }
/**
 * establecemos el tamaño del mapa
 * @param tamaño
 */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
/**
 * nos devuelve la descripcion del mapa
 * @return 
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * establecemos la descripcion del mapa
 * @param descripcion
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * nos devuelve las zonas del mapa
 * @return 
 */
    public int getZonas() {
        return zonas;
    }
/**
 * establecemos las zonas del mapa
 * @param zonas 
 */
    public void setZonas(int zonas) {
        this.zonas = zonas;
    }
/**
 * nos devuelve el numero de usuarios del mapa
 * @return 
 */
    public int getNumUsuario() {
        return numUsuario;
    }
/**
 * establecemos el numero de usuarios del mapa
 * @param numUsuario
 */
    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }
/**
 * nos devuelve una lista de las zonas del mapa
 * @return 
 */
    public ArrayList<Zona> getZonasLista() {
        return zonasLista;
    }
/**
 * establecemos una lista de las zonas del mapa del mapa
 * @param tamaño
 */
    public void setZonasLista(ArrayList<Zona> zonasLista) {
        this.zonasLista = zonasLista;
    }
/**
 * es un metodo sobre el mapa que nos dice todos los atributos
 */
    @Override
    public String toString() {
        return "Mapa{" +
                "tamaño='" + tamaño + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", zonas=" + zonas +
                ", numUsuario=" + numUsuario +
                ", zonasLista=" + zonasLista +
                '}';
    }
}
