
Proyecto de Gestión de Monedas
Descripción
Este proyecto se centra en la gestión y conversión de monedas utilizando una API externa para obtener las tasas de cambio. Incluye clases para manejar las monedas, sus conversiones y las operaciones relacionadas.

Instalación
Sigue estos pasos para instalar y ejecutar el proyecto:

Clona el repositorio:

bash

git clone https://github.com/Kalzis511/Convertidor
Navega al directorio del proyecto:

bash

cd tu-proyecto
Asegúrate de tener Java y Maven instalados en tu sistema. Puedes verificar la instalación con:

bash

java -version
mvn -version
Compila el proyecto usando Maven:

bash

mvn compile
Ejecuta el proyecto:

bash
Copiar código
mvn exec:java -Dexec.mainClass="Principal.Main"
Uso
Para utilizar el proyecto, ejecuta el método principal que iniciará la aplicación. Actualmente, el método principal llama al método ingresarMoneda de la clase Metodo.


Flujo de Ejecución:

Inicio del Programa: La ejecución comienza en Principal.Main, que llama a Metodo.ingresarMoneda().

Entrada del Usuario: Metodo.ingresarMoneda solicita al usuario que ingrese la moneda base, la moneda de cambio y la cantidad. Luego crea un objeto Moneda con estos datos.

Obtención del Tipo de Cambio: Metodo.ingresarMoneda utiliza una instancia de HttpClientConected para llamar a obtenerTipoCambio con el objeto Moneda.

Conexión a la API: HttpClientConected.obtenerTipoCambio construye la URL de la API, realiza la solicitud HTTP y parsea la respuesta JSON en un objeto MonedaApi.

Actualización de la Moneda: Metodo.ingresarMoneda crea una nueva instancia de Moneda utilizando el objeto MonedaApi y muestra el resultado.


Estructura del Proyecto:

Clase Principal
java
package Principal;

import Coneted.ListMoaned;
import Coneted.Metodo;

public class Main {
    public static void main(String[] args) {
        Metodo.ingresarMoneda();
    }
}






Clases y Métodos
Moneda:
Maneja la información sobre la moneda base, la moneda de cambio, la cantidad, la tasa de cambio y el resultado de la conversión.

java

MonedaApi:
Clase de registro que almacena la respuesta de la API.

java


Proporciona una lista de opciones de monedas.
       opcion[0] = "USD"; -Dólar americano
       opcion[1] = "MXN"; -Peso mexicano
       opcion[2] = "ARG"; -Peso argentino
       opcion[3] = "COP"; -Peso argentino
       opcion[4] = "EUR"; -Euro
       opcion[5] = "BOB"; -Boliviano 
       opcion[6] = "BRL"; -Real brasileño
       opcion[7] = "CLP"; -Peso chileno

java

Metodo:
Gestiona la entrada del usuario y la lógica para obtener el tipo de cambio.

java


HttpClientConected:

Se encarga de la conexión con la API externa para obtener las tasas de cambio.

java


Licencia
Este proyecto está licenciado bajo la Licencia MIT. Puedes ver más detalles en el archivo LICENSE.

Autores
ISMAEL ROSAS - CHALLENGE CONVERSOR - KALZIS511
.

