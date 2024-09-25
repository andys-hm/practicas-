import java.lang.Math;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        
        int numrandom = (int)(Math.random()* 10) + 1;
        System.out.println("Numero aleatorio entre 1 y 10: " + numrandom);

        
        for (int i = 1; i<=3; i++){
            System.out.println("Ingrese un número del 1 al 10:");
             int numero = entrada.nextInt();
             if(numrandom == numero){
                System.out.println("Felicidades adivinaste el número");
                break;
            }else{
               if(i == 3){
                   System.out.println("Juego terminado, sigue participando!!!");
                    break;
                }else {
                    System.out.println("Intentalo una vez más!!!");
                    if(numero < numrandom){
                        System.out.println("El número que ingresaste es menor al que tienes que adivinar");
                    }else{
                        System.out.println("El número ingresado es mayor al que tienes que adivinar");
                    }

                }
            }
        }
    }
}    
/*double random = Math.random();
        int max = 10;
        int min = 1;
        int rango = max - min +1;*/

