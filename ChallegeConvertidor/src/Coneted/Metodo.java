package Coneted;

import Objetos.Moneda;
import java.util.Scanner;

public class Metodo {
    public static void ingresarMoneda() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las monedas base y de cambio, así como la cantidad
        System.out.println("Ingrese la moneda base (por ejemplo, USD):");
        String monedaBase = scanner.nextLine();

        System.out.println("Ingrese la moneda de cambio (por ejemplo, MXN):");
        String monedaCambio = scanner.nextLine();

        System.out.println("Ingrese la cantidad:");
        double cantidad = scanner.nextDouble();

        // Crear una instancia de Moneda con las monedas base y de cambio y la cantidad ingresadas por el usuario
        Moneda moneda = new Moneda(monedaBase, monedaCambio, cantidad);

        // Crear una instancia de HttpClientConected
        HttpClientConected httpClient = new HttpClientConected();

        // Utilizar HttpClientConected para obtener el tipo de cambio
        MonedaApi miMonedaApi = httpClient.obtenerTipoCambio(moneda);

        // Verificar y mostrar los resultados
        if (miMonedaApi != null) {
            Moneda monedaActualizada = new Moneda(miMonedaApi);
            System.out.println(monedaActualizada.toString());
        } else {
            System.out.println("Error al obtener el tipo de cambio.");
        }
    }
}
