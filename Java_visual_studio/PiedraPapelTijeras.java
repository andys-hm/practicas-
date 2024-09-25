import java.lang.Math;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Juego... PIEDRA PAPEL O TIJERAS");

        Scanner entrada = new Scanner(System.in);
        int c = 0;
        int empate = 0;
        int victorias = 0;
        int derrotas = 0;

        do{

            int computadora = (int) (Math.random() * 3) + 1;
            System.out.println("La computadora eligio: ");

             System.out.println("Escoja una opcion: donde 1 es PIEDRA, 2 es PAPEL Y 3 son TIJERAS!!! GO... ");
            int usuario = entrada.nextInt();

             System.out.println("¡¡¡La computadora escojió!!!: " + computadora);
             

        

            switch (computadora) {
                case 1:
                    System.out.println("Piedra");

                    switch (usuario) {
                        case 1:
                            System.out.println("¡Empate!"); 
                            empate ++;
                            break;
                        case 2:
                            System.out.println("¡Ganaste!");
                            victorias ++;
                            break;
                        case 3:
                            System.out.println("¡Perdiste!");
                            derrotas ++;
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Papel");

                    switch (usuario) {
                        case 1:
                            System.out.println("¡Perdiste!");
                            derrotas ++;
                            break;
                        case 2:
                            System.out.println("¡Empate!");
                            empate ++;
                            break;
                        case 3:
                            System.out.println("¡Ganaste!");
                            victorias ++;
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Tijeras");

                    switch (usuario) {
                        case 1:
                            System.out.println("¡Ganaste!");
                            victorias ++;
                            break;
                        case 2:
                            System.out.println("¡Perdiste!");
                            derrotas ++;
                            break;
                        case 3:
                            System.out.println("¡Empate!");
                            empate ++;
                            break;
                    }
                    break;

            }
            
            
            
            System.out.println("¿Quieres volver a jugar? \n SI = 1 \n NO = 2");
             c = entrada.nextInt();
        } while (c == 1);
        System.out.println("Finalizaste el juego");
        System.out.println("Cúantas veces ganaste: " + victorias);
        System.out.println("Cúantas veces empataste: " + empate);
        System.out.println("Cúantas veces perdiste: " + derrotas); 

    

    }
}
