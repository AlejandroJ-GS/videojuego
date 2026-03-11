package org.palomafp.videojuego;
import org.palomafp.videojuego.modelo.Mapa;
import org.palomafp.videojuego.modelo.Usuario;
import org.palomafp.videojuego.modelo.Videojuego;
import org.palomafp.videojuego.modelo.Personaje;
import org.palomafp.videojuego.modelo.Zona;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class videojuegoDAOTest {
    @Test
    public void testVideojuegoDAORandom() {
        VideojuegoDAO videojuegosDAO= new VideojuegoDAO();
        Videojuego resultadoEsperado=null;
        for(int i=0; i<videojuegosDAO.getVideojuegosLista().size(); i++) {
            if(videojuegosDAO.getVideojuegoRandom().equals(videojuegosDAO.getVideojuegosLista().get(i))) {
            resultadoEsperado= videojuegosDAO.getVideojuegosLista().get(i);
            }
        }
        Videojuego resultadoActual=videojuegosDAO.getVideojuegoRandom();
        assertEquals(resultadoEsperado, resultadoActual);
        
    }

    @Test
    public void testVideojuegoDAOByCod() {
        VideojuegoDAO videojuegosDAO= new VideojuegoDAO();
        Videojuego resultadoEsperado=null;
        for(int i=0; i<videojuegosDAO.getVideojuegosLista().size(); i++) {
            if(videojuegosDAO.getVideojuegoRandom().equals(videojuegosDAO.getVideojuegosLista().get(i))) {
            resultadoEsperado= videojuegosDAO.getVideojuegosLista().get(i);
            }
        }
        Videojuego resultadoActual=videojuegosDAO.getVideojuegoRandom();
        assertEquals(resultadoEsperado, resultadoActual);
        
    }


}
