package org.palomafp.videojuego;

import java.util.ArrayList;
import java.util.List;

import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Zona;

public class VideojuegoDAO {

    List<Videojuego> videojuegosLista;
    public Videojuego getVideojuegoRandom() {
        ArrayList <Zona> zonaLista=new ArrayList <Zona> ();
        ArrayList <Mapa> mapaLista=new ArrayList <Mapa>();
        ArrayList <Usuario> usuarioos=new ArrayList <Usuario>();
        ArrayList <Personaje> personajes=new ArrayList <Personaje>();
        
        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista.add(z1);
        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista);
        mapaLista.add(m1);
        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes.add(p1) ;
        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5", videojuegosLista);
        usuarioos.add(u1);
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99, mapaLista, usuarioos, personajes , "1"   );
        videojuegosLista.add(v1);
        
        
        Zona z2 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        zonaLista.add(z2);
        Mapa m2 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista);
        mapaLista.add(m2);
        Personaje p2 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        personajes.add(p2) ;
        Usuario u2 = new Usuario("Jugador1", "10", "Nivel 5", videojuegosLista);
        usuarioos.add(u2);
        Videojuego v2 = new Videojuego("Aventura", "PC", 59.99, mapaLista, usuarioos, personajes , "1"   );
        videojuegosLista.add(v2);
        int numeroRandom = (int)(Math.random()*((videojuegosLista.size()-1)+1));

        return videojuegosLista.get(numeroRandom);
    }

    public Videojuego getVideojuegobyid(int posicion ) {
        
        return videojuegosLista.get(posicion);
    }

    public void getallVideojuego (){
        for (Videojuego videojuego : videojuegosLista) {
            System.out.println(videojuego);
        }
    }
}
