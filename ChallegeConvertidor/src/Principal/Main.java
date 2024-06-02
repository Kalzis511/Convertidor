package Principal;

import Coneted.HttpClientConected;
<<<<<<< HEAD

import Coneted.Metodo;
import Objetos.Moneda;
=======
import Coneted.Moneda;
>>>>>>> 6ac4398a658ba8a26d62653b2c2e893bff852584



public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Metodo.ingresarMoneda();

=======
        // Crear una instancia de Moneda con las monedas base y de cambio
        Moneda moneda = new Moneda("USD", "MXN");

        // Establecer la cantidad
        moneda.setCantidad(5);

        HttpClientConected httpClient = new HttpClientConected();

        // Llamar al método Moneda para realizar la conversión y obtener el resultado
        String json = String.valueOf(httpClient.Moneda(moneda));

        // Imprimir el resultado
        System.out.println("Resultado json: " + json);
>>>>>>> 6ac4398a658ba8a26d62653b2c2e893bff852584

    }
}
