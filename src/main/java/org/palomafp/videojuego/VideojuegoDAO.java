package org.palomafp.videojuego;

import java.util.ArrayList;

import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Zona;

public class VideojuegoDAO {
    public Videojuego getVideojuegoRandom() {
        ArrayList <Zona> zonaLista=new ArrayList <Zona> ();
        Mapa[] mapaLista=new Mapa[4];
        Usuario[] usuarioos=new Usuario[6];
        Personaje[] personajes=new Personaje[7];
        Videojuego[] videojuegos=new Videojuego[7];

        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");

        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista);

        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes[0] = p1;
        
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99, mapaLista, usuarioos, personajes );

        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5", videojuegos);
        System.out.println(u1);

        return v1;
    }

}
