import java.util.Scanner;
public class Esvocal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String c = entrada.nextLine();

        if ("a".equals(c) || "A".equals(c)){
            System.out.println("Es una vocal");
        }else if ("e".equals(c) || "E".equals(c)){
            System.out.println("Es una vocal");
        }else if ("i" .equals(c) || "I".equals(c)){
            System.out.println("Es una vocal");  
        }else if ("o".equals(c) || "O".equals(c)){
            System.out.println("Es una vocal");
        }else if ("u".equals(c) || "U".equals(c)){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }

    }
    
}
