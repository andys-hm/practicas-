import java.util.Scanner;
public class problema {
public static void main (String [ ] args){
double num1, num2, cociente, residuo;
Scanner entrada = new Scanner ( System. in); // Objeto de la clase Scanner

// Meter datos por consola
System. out. println (" Ingrese el número 1: " );
num1 = entrada.nextDouble ( );
System.out.println("Ingrese el número 2: " );
num2 = entrada. nextDouble ( );

// solución del problema
cociente = num1 / num2; 
residuo = num1 % num2;

System. out.println (" El cociente es: " + cociente );
System.out.println (" El residuo es: " + residuo );
 }

}
