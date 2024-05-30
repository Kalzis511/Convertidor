package Principal;

import Coneted.HttpClientConected;
import Coneted.Moneda;



public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Moneda con las monedas base y de cambio
        Moneda moneda = new Moneda("USD", "MXN");

        // Establecer la cantidad
        moneda.setCantidad(5);

        HttpClientConected httpClient = new HttpClientConected();

        // Llamar al método Moneda para realizar la conversión y obtener el resultado
        String json = String.valueOf(httpClient.Moneda(moneda));

        // Imprimir el resultado
        System.out.println("Resultado json: " + json);

    }
}
