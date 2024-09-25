import java.util.Scanner;

public class numeroPar {
    // practica de como saber si es numero par o impar con la clase Scanner 

    public static void main(String[] args) {
        Scanner lee =new Scanner(System.in);
        System.out.print("Ingrese un Número: ");
        int n = lee.nextInt();

        if ( n % 2 ==0){
            System.out.println("El número es Par: ");
        }else{
            System.out.println("El número es Impar: ");

        }
    }
    
}
