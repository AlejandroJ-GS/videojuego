package org.palomafp.videojuego;
import org.palomafp.videojuego.modelo.Videojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

public class videojuegoDAOTest {
    @Test
    public void testVideojuegoRandom() {
        VideojuegoDAO videojuegosDAO = new VideojuegoDAO();
        Videojuego videojuego1 = videojuegosDAO.getVideojuegoRandom();

        assertNotNull(videojuego1);
        assertNotEquals(0, videojuego1.getCodJuego());
        assertNotNull(videojuego1.getMapas());
        
    }

    @Test
    public void testVideojuegoDAOByCod() {
        VideojuegoDAO videojuegosDAO= new VideojuegoDAO();
     Videojuego videojuego1 = videojuegosDAO.getVideoJuegoByCod(1);
        assertNotNull(videojuego1.getMapas());
        assertEquals(videojuego1.getGenero(), "Aventura");
    }


}
