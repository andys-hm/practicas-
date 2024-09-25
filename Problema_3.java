import java.util.Scanner;

public class Problema_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1, numero2, resultado;
        resultado = 0;
        
        char Operador;
        

        System.out.println("Por favor ingresa dos números: ");

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        
        
        System.out.println("Por favor ingresa un operador (+,-,*/):");
        Operador = entrada.next().charAt(0);
        
        switch (Operador) {
            case '+':
            resultado = numero1 + numero2;
            System.out.println("El resultado es: " + resultado);

            break;

            case '-':
            resultado = numero1 - numero2;
            System.out.println("El resultado es: " + resultado);

            break;

            case '*':
            resultado = numero1 * numero2;
            System.out.println("El resultado es: " + resultado);

            break;

            case '/':
            if( numero2 != 0){
                resultado = numero1 / numero2;
            }else{
                resultado = resultado; 
            }
            System.out.println("El resultado es: " + resultado);

            break;
        
            default:
            System.out.println("ERROR Operador invalido");
                
        }


       


        


    }
}
