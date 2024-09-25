import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner lee = new Scanner (System.in);
        System.out.println("Ingrese el primer número: ");
        int n1 = lee.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int n2 = lee.nextInt();
        

        if (n1 > n2) {
            System.out.println(" El numero" + n1 + "es mayor que el:  " + n2);

        } else {
            System.out.println("El número" + n1 + "es menor: " + n2);

        }

    }

}
