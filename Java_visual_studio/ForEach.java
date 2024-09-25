public class ForEach {
    public static void main(String[] args) {
        String[] nombres = { "Atzin", "Rafa", "Yei", "Fly", "Stinky", "Andrea" };

        // como iterar un array para que nos arroje todos los datos
        // UTILIZANDO WHILE

        int c = 0;

        while (c < nombres.length) {
            System.out.println(nombres[c]);
            c++;
        }

        // Como iterar con FOR

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);

        }
      
        // como iterar con FOR EACH 

        for( String dato : nombres){
            System.out.println(dato);
        }

    }
}
