package org.palomafp.videojuego;
import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Zona;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class videojuegoDAOTest {
    @Test
    public void testVideojuegoDAO() {
        private Mapa[] mapas;
    private Usuario[] usuarios;
    private Personaje[] personajes;
       VideojuegoDAO dao = new VideojuegoDAO();
        Zona z1 = new Zona("Grande", "Una zona amplia con muchos enemigos", "Bosque");
        Mapa m1 = new Mapa("Mediano", "Un mapa con varios caminos y obstáculos", 2, 5, zonaLista);
        Personaje p1 = new Personaje("Guerrero", "Un personaje fuerte y resistente", 10);
        Videojuego v1 = new Videojuego("Aventura", "PC", 59.99, mapaLista, usuarioos, personajes );
        Usuario u1 = new Usuario("Jugador1", "10", "Nivel 5", videojuegos[]);
       String resultado="VideojuegoDAO{" +
                "zonaLista=" + z1 +
                ", mapaLista=" + m1 +
                ", usuarioos=" + u1 +
                ", personajes=" + p1 +
                ", videojuegos=" + v1 +
                '}';
       assertEquals(resultado,dao.VideojuegoInfo(),resultado );
    }
}
