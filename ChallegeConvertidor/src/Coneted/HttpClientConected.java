package Coneted;

import Objetos.Moneda;
import com.google.gson.*;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URISyntaxException;


public class HttpClientConected {

<<<<<<< HEAD
    public MonedaApi obtenerTipoCambio(Moneda moneda) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        System.out.println("Verificación: " + moneda.getMonedaBase() + " " + moneda.getMonedaDeCambio() + " " + moneda.getCantidad());

        String key = "fa894bebbc2f75dbc7cba87d";
        String direccion = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + moneda.getMonedaBase() + "/" + moneda.getMonedaDeCambio() + "/" + moneda.getCantidad();

        System.out.println("Conexión a la API: " + direccion);

=======
    public String Moneda(Moneda moneda) {

        // clave API
        String key = "fa894bebbc2f75dbc7cba87d"; // clave api
        // URL para la solicitud de la API
        String direccion = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + moneda.getMonedaBase() + "/" + moneda.getMonedaDeCambio() + "/" + moneda.getCantidad(); // url de búsqueda
        System.out.println(direccion);
>>>>>>> 6ac4398a658ba8a26d62653b2c2e893bff852584
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

<<<<<<< HEAD
            System.out.println("Respuesta de la consulta: " + json);

            // Parsear el JSON obtenido y crear una instancia de MonedaApi
            MonedaApi miMoneda = gson.fromJson(json, MonedaApi.class);

            return miMoneda;

        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
=======

            return json;

        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
            return ""; // Manejo de errores, retornar un valor predeterminado en caso de error
>>>>>>> 6ac4398a658ba8a26d62653b2c2e893bff852584
        }
    }
}
