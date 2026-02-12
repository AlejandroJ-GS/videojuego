package org.palomafp.videojuego;

import org.palomafp.videojuego.modelo.Videojuego;

public class App 
{
    public static void main( String[] args )
    {
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
        Videojuego videojuego = videojuegoDAO.getVideojuegoRandom();

        System.out.println( videojuego );  
    }
}
