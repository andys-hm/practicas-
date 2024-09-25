import java.util.Scanner;

public class multiplo3y5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Ingrese el número: ");
        numero = entrada.nextInt();
        

        if ( numero %3 ==0){
            System.out.println("El número es multiplo de 3 ");
            if ( numero %5 ==0){
                System.out.println("El número es multiplo de 5 ");


            }else{
                System.err.println("El número no es multiplo de 5 ");
            }

        }else{
            System.out.println("El número no es multiplo de 3 ");
        }


    }
}
