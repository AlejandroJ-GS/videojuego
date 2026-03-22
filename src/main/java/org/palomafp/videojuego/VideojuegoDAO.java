package org.palomafp.videojuego;

import java.util.ArrayList;

import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Zona;

/**
 * Objeto Videojuego que tiene una lista con sus diferentes metodos
 */
public class VideojuegoDAO {

    //Lista de videojuegos
    ArrayList<Videojuego> videojuegosLista=new ArrayList<Videojuego>();


    /**
     * Constructor que crea cuatro objetos y los añade a la lista videojuegos al instanciar un objeto VideojuegoDAO
     */
    public VideojuegoDAO() {
        ArrayList <Zona> zonaLista1=new ArrayList <Zona> ();
        ArrayList <Mapa> mapaLista1=new ArrayList <Mapa>();
        ArrayList <Usuario> usuarioos1=new ArrayList <Usuario>();
        ArrayList <Personaje> personajes1=new ArrayList <Personaje>();
        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista1.add(z1);
        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista1);
        mapaLista1.add(m1);
        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes1.add(p1) ;
        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5");
        usuarioos1.add(u1);
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99, mapaLista1, usuarioos1, personajes1 , "1"   );
        videojuegosLista.add(v1);
        
        ArrayList <Zona> zonaLista2=new ArrayList <Zona> ();
        ArrayList <Mapa> mapaLista2=new ArrayList <Mapa>();
        ArrayList <Usuario> usuarioos2=new ArrayList <Usuario>();
        ArrayList <Personaje> personajes2=new ArrayList <Personaje>();
        Zona z2 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista2.add(z2);
        Mapa m2 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista2);
        mapaLista2.add(m2);
        Personaje p2 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes2.add(p2) ;
        Usuario u2 = new Usuario("Jugador1", "10", "Nivel 5");
        usuarioos2.add(u2);
        Videojuego v2 = new Videojuego("Aventura", "PC", 10.99, mapaLista2, usuarioos2, personajes2 , "2"   );
        videojuegosLista.add(v2);

        ArrayList <Zona> zonaLista3=new ArrayList <Zona> ();
        ArrayList <Mapa> mapaLista3=new ArrayList <Mapa>();
        ArrayList <Usuario> usuarioos3=new ArrayList <Usuario>();
        ArrayList <Personaje> personajes3=new ArrayList <Personaje>();
        Zona z3 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista3.add(z3);
        Mapa m3 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista3);
        mapaLista3.add(m3);
        Personaje p3 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes3.add(p3) ;
        Usuario u3 = new Usuario("Jugador1", "10", "Nivel 5");
        usuarioos3.add(u3);
        Videojuego v3 = new Videojuego("Aventura", "PC", 20.99, mapaLista3, usuarioos3, personajes3 , "3"   );
        videojuegosLista.add(v3);

        ArrayList <Zona> zonaLista4=new ArrayList <Zona> ();
        ArrayList <Mapa> mapaLista4=new ArrayList <Mapa>();
        ArrayList <Usuario> usuarioos4=new ArrayList <Usuario>();
        ArrayList <Personaje> personajes4=new ArrayList <Personaje>();
        Zona z4 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista4.add(z4);
        Mapa m4 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista4);
        mapaLista4.add(m4);
        Personaje p4 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes4.add(p4) ;
        Usuario u4 = new Usuario("Jugador1", "10", "Nivel 5");
        usuarioos4.add(u4);
        Videojuego v4 = new Videojuego("Aventura", "PC", 70.99, mapaLista4, usuarioos4, personajes4 , "4"   );
        videojuegosLista.add(v4);
    }

    /**
     * Devuelve un videojuego random de la lista videojuegos
     * @return videojuego random de la lista videojuegos
     */
    public Videojuego getVideojuegoRandom() {
        //Genera un numero aleatorio entre 0 y el tamaño de la lista
        int numeroRandom = (int)(Math.random()*((videojuegosLista.size())));
        return videojuegosLista.get(numeroRandom);
    }

    /**
     * Devuelve un videojuego de la lista con el codigo introducido
     * @param cod codigo del videojuego
     * @return videojuego de la lista con el codigo introducido
     */
    public Videojuego getVideoJuegoByCod(int cod ) {
        return videojuegosLista.get(cod);
    }


    /**
     * Devuelve la informacion de los videojuegos de la lista
     * @return informacion de los videojuegos de la lista
     */
    public ArrayList<Videojuego> getAllVideojuego() {
        return videojuegosLista;
    }
}
