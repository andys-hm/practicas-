import java.util.Scanner;
public class While2 {
       public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int c = 0;
        while (c <=10) {
            System.out.printf(" | %d x %d = %d | \n" , numero,c,(numero*c));
            c++;
            
        }
        
    }
    
}
