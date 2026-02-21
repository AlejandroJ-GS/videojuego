package org.palomafp.videojuego;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
        int menu;
        int idJuego;

        do{
            System.out.println("\n1. Obtener un juego random");
            System.out.println("2. Obtener un juego con su id");
            System.out.println("3. Obtener todos los juegos");
            System.out.println("4. Salir");

            System.out.println("Opción:");
            menu=sc.nextInt();

            switch (menu) {
            case 1:
                System.out.println("\nJuego random: ");
                System.out.println(videojuegoDAO.getVideojuegoRandom());
                
                break;
            
            case 2:
                System.out.println("\nIntroduzca el id del juego(1-4):");
                idJuego=sc.nextInt();
                System.out.println("\nJuego "+idJuego+": ");
                System.out.println(videojuegoDAO.getVideoJuegoByID(idJuego-1));
                break;

            case 3:
                System.out.println("\nTodos los juegos: ");
                videojuegoDAO.getAllVideojuego();
                break;

            case 4:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("No existe esta opcion.");
                break;
            }
        }while (menu!=4);
        sc.close();
    
    }
}
