package org.palomafp.videojuego;

import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Zona;

public class VideojuegoDAO {
    public String VideojuegoInfo() {
        Zona[] zonaLista=new Zona[2];
        Mapa[] mapaLista=new Mapa[4];
        Usuario[] usuarioos=new Usuario[6];
        Personaje[] personajes=new Personaje[7];
        Videojuego[] videojuegos=new Videojuego[7];

        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        System.out.println(z1);

        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista);
        System.out.println(m1);

        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        System.out.println(p1);
        
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99, mapaLista, usuarioos, personajes );
        System.out.println(v1);

        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5", videojuegos);
        System.out.println(u1);
    }

}
