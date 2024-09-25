import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in );
    System.out.println("¡Elige un número del 0-9!: ");
    int numero = entrada.nextInt();

    String resultado= null;

    switch (numero) {
        
        case 0:
        resultado = "Cero";
            break;
        
        case 1:
        resultado = "Uno";
            break;


        case 2:
        resultado = "Dos";
            break;

        case 3:
        resultado = "Tres";
            break;

        case 4:
        resultado = "Cuatro";
            break;

        case 5:
        resultado = "Cinco";
            break;

        case 6:
        resultado = "Seis";
            break;

        case 7:
        resultado = "Siete";
            break;

        case 8:
        resultado = "Ocho";
            break;

        case 9:
        resultado = "Nueve";
            break;
    
        
        default:
           resultado = "Error";
           break;

    }
    
    
    System.out.println("El resultado es: " + resultado);



    }
}
