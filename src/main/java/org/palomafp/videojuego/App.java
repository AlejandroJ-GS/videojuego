package org.palomafp.videojuego;
import java.util.Scanner;
import org.palomafp.videojuego.modelo.Videojuego;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
        Videojuego videojuego = videojuegoDAO.getVideojuegoRandom();

        System.out.println( videojuego );  
         
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                
                break;
        
            default:
                break;
        }
    sc.close();
    
    }
}
