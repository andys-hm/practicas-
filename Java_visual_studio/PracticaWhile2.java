import java.util.Scanner;

public class PracticaWhile2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número. ");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        int n2 =entrada.nextInt();
       
        int c = 0;

        while (n1 <= n2) {
            n1++;
            c++;

            
            
        }
        System.out.println("La cantidad de Números que contiene el rango es: " + c);


    }
    
}
