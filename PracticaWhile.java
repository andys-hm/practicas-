import java.util.Scanner;

public class PracticaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número. ");
        int numero = entrada.nextInt();
        int suma = 0;
        int i = 1;

        while (i <= numero) {
            suma = suma + i;
            System.out.println("La suma de los números es :" + suma);
            i++;
            
        }

    }
}
