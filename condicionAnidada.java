import java.util.Scanner;

public class condicionAnidada {
    public static void main(String[] args) { // este es el metodo principal
       
        Scanner lee = new Scanner(System.in); // Objeto de la clase scanner para leer por teclado 
        
        System.out.println("Ingrese el número: "); // Pedimos el valor al usuario 
        int numero = lee.nextInt(); // declaramos nuestra variable y ponemos el metodo de la clase Scanner 

        if (numero != 0) { // preguntamos si ese numero es diferente de 0
            if (numero > 0) { //vuelve a preguntar si el numero es mayor que 0
                if (numero % 2 == 0) {  // vuelve a preguntar si el numero es dividido entre y su residuo o modulo es igual a 0 entonces es par
                    System.out.println("El número es Par Positivo: ");
                } else {
                    System.out.println("El número es Impar Positivo: "); // caso contrario si no se cumple entonces es un numero impar
                }

            } else { // caso contrario de que el numero es menor que 0 entonces es un numero negativo
                if (numero % 2 == 0) { // pero si es negativo y se cumple esto entonces es un numero negativo par 
                    System.out.println("El numero es Par Negativo: ");
                } else { // si no se cumple la condicion entonces el numero es negativo pero impar 
                    System.out.println("El número es Impar Negativo: ");
                }
            }

        } else { // si el numero es 0 entonces se cumple la condición de que es  un numero neutro
            System.out.println("El número es Neutro: ");
        }

    }
}
