public class Array {
    public static void main(String[] args) {
        String nombres[];
        nombres = new String[6];

        nombres[0] = "Atzin";
        nombres[1] = "Rafael";
        nombres[2] = "Yei";
        nombres[3] = " Fly";
        nombres[4] = "Stinky";
        nombres[5] = "Andrea";

        // para imprimir un array 
        System.out.println(nombres[0]);

        //para modificar un dato de un array 

        nombres [2] = "Mochi";
        System.out.println( nombres [2]);

        // Para saber cuantos datos tiene el Array utilizamos  la instruccion length
        System.out.println(nombres.length);


        // como definir un array 

        int [] array1 = {1,2,3,4,5};
        // imprime el dato que elijas 
        System.out.println(array1 [2]);
        // para actualizar un dato 
        array1 [2] = 30;
        System.out.println(array1 [2]);
        // para saber cuantos datos tiene el array 
        System.out.println(array1.length);



        // otra manera dedinir un array 
        int [] array2 = new int [5];



    }
}
