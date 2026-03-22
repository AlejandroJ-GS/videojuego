package org.palomafp.videojuego;
import org.palomafp.videojuego.modelo.Videojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
/**
 * Clase de pruebas para comprobar el funcionamiento de los métodos
 * de la clase VideojuegoDAO.
 */
public class videojuegoDAOTest {
    /**
     * Comprueba que el método getVideojuegoRandom devuelve un videojuego
     * no nulo, con código distinto de 0 y con mapas asociados.
     */
    @Test
    public void testVideojuegoRandom() {
        VideojuegoDAO videojuegosDAO = new VideojuegoDAO();
        Videojuego videojuego1 = videojuegosDAO.getVideojuegoRandom();

        assertNotNull(videojuego1);
        assertNotEquals(0, videojuego1.getCodJuego());
        assertNotNull(videojuego1.getMapas());
        
    }
 /**
     * Comprueba que el método getVideoJuegoByCod devuelve un videojuego
     * con mapas no nulos y cuyo género es "Aventura".
     */
    @Test
    public void testVideojuegoDAOByCod() {
        VideojuegoDAO videojuegosDAO= new VideojuegoDAO();
        Videojuego videojuego1 = videojuegosDAO.getVideoJuegoByCod(1);
        assertNotNull(videojuego1.getMapas());
        assertEquals("Aventura", videojuego1.getGenero() );
        assertEquals(10.99, videojuego1.getPrecio());
    }

    /**
     * Comprueba que la lista de videojuegos no es nula
     * y que contiene 4 videojuegos.
     */
    @Test
    public void testVideojuegoDAOGetAll() {
        VideojuegoDAO videojuegosDAO= new VideojuegoDAO();
        assertNotNull(videojuegosDAO.getAllVideojuego());
        assertEquals(4, videojuegosDAO.getAllVideojuego().size());
    }

}
