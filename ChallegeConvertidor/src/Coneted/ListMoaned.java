package Coneted;

public class ListMoaned {
    public static void lista () {
        // Declarar e inicializar un array de enteros con tamaño 5
        String[] opcion = new String[8];

        // Asignar valores a los elementos del array
       opcion[0] = "USD";
       opcion[1] = "MXN";
       opcion[2] = "ARG";//ARS - Peso argentino
       opcion[3] = "COP";
       opcion[4] = "EUR";
       opcion[5] = "BOB";//- Boliviano boliviano
         opcion[6]= "BRL";// - Real brasileño
        opcion[7]="CLP";// - Peso chileno







        // Imprimir los valores de los elementos del array
        for (int i = 0; i <  opcion.length; i++) {

            System.out.println( opcion[i]);

        }
    }
}
