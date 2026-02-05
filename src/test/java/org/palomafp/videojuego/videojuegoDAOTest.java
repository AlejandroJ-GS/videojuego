package org.palomafp.videojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class videojuegoDAOTest {
    @Test
    public void testVideojuegoDAO() {
       VideojuegoDAO dao = new VideojuegoDAO();
       String resultado=dao.VideojuegoInfo();
       assertEquals(resultado,dao.VideojuegoInfo() );
    }
}
