package org.palomafp.videojuego.modelo;

import java.util.ArrayList;

/**
 * Objeto zona con atributos genero, dispositivo, precio, codJuego, una lista de mapas, lista de usuarios y lista de personajes
 * @author Cristina Xu y Alejandro Gónzalez
 */
public class Videojuego {
    //Indica el genero del videojuego
    private String genero;
    //Indica para que dispositovo es 
    private String dispositivo;
    //Indica el precio del videojuego
    private Double precio;
    //Indica el codigo que tiene el videojuego
    private String codJuego;
    //Lista que almacena todos los mapas que tiene el videojuego
    private ArrayList <Mapa> mapas = null;
    //Lista que almacena los usuarios que tiene el videojuego
    private ArrayList <Usuario> usuarios =null;
    //Lista que almacena los personajes que tiene el videojuego
    private ArrayList <Personaje> personajes=null;

    /**
     * Constructor para instanciar un objeto Videojuego con parametros de entrada
     * @param genero genero que tiene ell videojuego
     * @param dispositivo dispositivo en el que esta disponible el videojuego
     * @param precio precio que tiene el videojuego
     * @param m1 lista con los mapas que tiene el videojuego
     * @param u1 lista con los usuarios que tiene el videojuego
     * @param p1 lista con los personajes que tiene el videojuego
     * @param codJuego codigo para identificar el videojeugo
     */
    public Videojuego(String genero, String dispositivo, Double precio,  ArrayList <Mapa> m1, ArrayList <Usuario> u1, ArrayList <Personaje> p1 ,String codJuego) {
        this.genero = genero;
        this.dispositivo = dispositivo;
        this.precio = precio;
        this.mapas=m1;
        this.usuarios=u1;
        this.personajes=p1;
        this.codJuego=codJuego;
    }

    /**
     * Devuelve el género que tiene el videojuego
     * @return género del videojuego
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del videojeugo
     * @param genero género del videojuego
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devuelve el código del videojuego
     * @return código del videojeugo
     */
    public String getCodJuego() {
        return codJuego;
    }

    /**
     * Establece el código del videojueo
     * @param codJuego codigo del videojuego
     */
    public void setcodJuego(String codJuego) {
        this.codJuego = codJuego;
    }

    /**
     * Devuelve el dispositivo en el que esta disponible el videojuego
     * @return el dispositivo en el que esta disponible el videojuego
     */
    public String getDispositivo() {
        return dispositivo;
    }

    /**
     * Establece el dispositivo en el que esta disponible el videojuego
     * @param dispositivo dispositivo en el que esta disponible el videojuego
     */
    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    /**
     * Devuelve el precio del videojuego
     * @return precio del videojuego
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del videojuego
     * @param precio precio del videojuego
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la lista de mapas que tiene el videojuego
     * @return lista de mapas que tiene el videojuego
     */
    public ArrayList <Mapa> getMapas() {
        return mapas;
    }

    /**
     * Establece la lista de mapas que tiene el videojuego
     * @param mapas lisra de mapas del videojuego
     */
    public void setMapas(ArrayList <Mapa> mapas) {
        this.mapas = mapas;
    }

    /**
     * Devuelve la lista de usuarios que tiene el videojuego
     * @return lista de usuarios que tiene el videojuego
     */
    public ArrayList <Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Establece la lista de usuarios que tiene el videojuego
     * @param usuarios lista de usuarios del videojuego
     */
    public void setUsuarios(ArrayList <Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Devuelve la lista de personajes que tiene el videojuego
     * @return lista de personajes que tiene el videojuego
     */

    public ArrayList <Personaje> getPersonajes() {
        return personajes;
    }

    /**
     * Establece la lista de personajes que tiene el videojuego
     * @param personajes lista de personajes del videojuego
     */
    public void setPersonajes(ArrayList <Personaje> personajes) {
        this.personajes = personajes;
    }

    /**
     * Devuelve toda la información del videojuego
     */
    @Override
    public String toString() {
        return "\nVideojuego{" +
                "\nGénero='" + genero + 
                "\nDispositivo='" + dispositivo +
                "\nPrecio=" + precio +
                "\n"+ mapas+
                "\n" + usuarios +
                "\n"+ personajes +
                "\nCódigo juego: " + codJuego +
                "}\n";
    }
}
