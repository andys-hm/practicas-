import java.util.Scanner;

public class Esmultiplo3_esmultiplode5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un número ");
        float n = entrada.nextFloat();
        
        if (n % 3 ==0 || n % 5==0 ){
            System.out.println("El numero es multiplo de 3 y de 5 ");

        }else{
            System.out.println("El número no es multiplo de 3 y de 5");
        }
    }
}