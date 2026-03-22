package org.palomafp.videojuego;
import java.util.Scanner;

/**
 * Obejto App
 * @author Cristina Xu y Alejandro Gónzalez
 */
public class App 
{
    /**
     * Constructor por defecto
     */
    public App() {

    }
    /**
     * Calse principal de la clase App
     * @param args argumentos de la clase
     */
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        //Instanciar un objeto VideojuegoDAO
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
        //Opcion del menu
        int menu;
        //id de un juego
        int idJuego;

        do{
            //Menu con las diferentes opciones
            System.out.println("\n1. Obtener un juego random");
            System.out.println("2. Obtener un juego con su id");
            System.out.println("3. Obtener todos los juegos");
            System.out.println("4. Salir");

            //Pedir al usuario que accion quiere realizar
            System.out.println("Opción:");
            menu=sc.nextInt();

            switch (menu) {
            //Obtener un juego random
            case 1:
                System.out.println("\nJuego random: ");
                System.out.println(videojuegoDAO.getVideojuegoRandom());
                
                break;
            
            //Obtener un juego por id, introducido por el usuario
            case 2:
                System.out.println("\nIntroduzca el id del juego(1-4):");
                idJuego=sc.nextInt();
                System.out.println("\nJuego "+idJuego+": ");
                System.out.println(videojuegoDAO.getVideoJuegoByCod(idJuego-1));
                break;

            //Obtener todos los videojuegos de la lista
            case 3:
                System.out.println("\nTodos los juegos: ");
                System.out.println(videojuegoDAO.getAllVideojuego());
                break;
            
            //Salir del programa
            case 4:
                System.out.println("Saliendo...");
                break;
            
            //Si se selecciona una opcion que no esta en la lista, mostrar un mensaje
            default:
                System.out.println("No existe esta opcion.");
                break;
            }
        }while (menu!=4);
        sc.close();
    
    }
}
