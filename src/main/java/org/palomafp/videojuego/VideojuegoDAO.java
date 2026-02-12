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
        ArrayList <Mapa> mapaLista=new ArrayList <Mapa>();
        ArrayList <Usuario> usuarioos=new ArrayList <Usuario>();
        ArrayList <Personaje> personajes=new ArrayList <Personaje>();
       ArrayList <Videojuego> videojuegos=new ArrayList <Videojuego>();

        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista.add(z1);
        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista);
        mapaLista.add(m1);
        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes.add(p1) ;
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99, mapaLista, usuarioos, personajes , "1"   );
        videojuegos.add(v1);
        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5", videojuegos);
        usuarioos.add(u1);

        return v1;
    }

}
