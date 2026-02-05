package org.palomafp.videojuego;

import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Zona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        System.out.println(z1);
        
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99);
        System.out.println(v1);
        
        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5");
        System.out.println(u1);
        
        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        System.out.println(p1);
        
        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5);
        System.out.println(m1);
    }
}
