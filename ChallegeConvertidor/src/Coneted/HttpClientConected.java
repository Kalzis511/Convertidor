package Coneted;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URISyntaxException;

public class HttpClientConected {

    public static void main(String[] args) {
        int cantidad = 5;
        String monedaBase = "USD";
        String moneda2 = "MXN";


        // clave API
        String key = "fa894bebbc2f75dbc7cba87d"; // clave api
        // URL para la solicitud de la API
        String direccion = "https://v6.exchangerate-api.com/v6/" + key + "/pair/"+monedaBase+"/"+moneda2+"/"+cantidad; // url de búsqueda

        try {
            // Crear el HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Crear la solicitud HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(direccion))
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Obtener el cuerpo de la respuesta como una cadena
            String json = response.body();

            // Imprimir la respuesta JSON
            System.out.println(json);
        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
