import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Ingrese un número del 1 al 4:");
    int numero = entrada.nextInt();
    
    String EstacionAño = null;

    switch (numero) {
        case 1:
            EstacionAño = "Primavera";
            break;

        case 2:
            EstacionAño = "Verano";
            break;

        case 3:
            EstacionAño = "Otoño";
            break;

        case 4:
            EstacionAño = "Invierno";
            break;

        default:
        EstacionAño = "Error";
        break;

    }

    System.out.println("La estacion es: " + EstacionAño);

    }
}
