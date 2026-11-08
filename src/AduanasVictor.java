/*
Víctor trabaja en el departamento de aduanas, donde el caos en fechas como Navidad o Black Friday colapsa
el puerto. Para agilizar el trabajo, su jefe le pide un programa que automatice las decisiones basándose en
cuatro datos: tipo de mercancía (3: peligrosa, 2: perecedera, 1: general), peso en toneladas, código de país
de cuatro cifras y estado de la documentación. Si la documentación no está en regla, la carga es rechazada, salvo
 la general, que va a revisión manual.

Además, existen estrictos límites de peso: máximo 12 toneladas para mercancías peligrosas, 16 para perecederas
 y 20 para generales. Los cargamentos perecederos y peligrosos deben proceder exclusivamente de la comunidad
 europea (códigos del 0000 al 0027), a menos que tengan un tratado especial (código que empieza por 1 para
  perecederos y por 3 para peligrosos). A todos los contenedores con dichos tratados se les realiza siempre
  una revisión manual. Finalmente, la carga general que supera su límite de peso es rechazada de inmediato, sin
  permitirse jamás una revisión manual para ella.
*/

import java.util.Scanner;

public class AduanasVictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- PEDIR DATOS POR TECLADO ---
        System.out.println("--- SISTEMA DE CONTROL DE ADUANA ---");

        System.out.println("Introduce el tipo de mercancía|\n 1: general\n 2: perecedero\n 3: peligroso) ");
        int tipo = scanner.nextInt();

        System.out.print("Introduce el peso en toneladas: ");
        double peso = scanner.nextDouble();

        System.out.print("Introduce el código del país de origen (4 cifras): ");
        int codigoPais = scanner.nextInt();

        System.out.print("¿Tiene la documentación en regla? (1 para si / 0 para no): ");
        int docEnRegla = scanner.nextInt(); // Usamos int en vez de boolean

        scanner.close(); // Cerramos el scanner

        String estado = "APROBADO"; // Estado por defecto

        // --- LÓGICA DE EVALUACIÓN (SIN VARIABLES BOOLEANAS) ---

        // 1. Validación de la documentación (0 significa falso / no la tiene)
        if (docEnRegla == 0) {
            if (tipo == 1) {
                estado = "REVISION MANUAL"; // General sin papeles va a revisión
            } else {
                estado = "RECHAZADO";      // Perecedero o peligroso sin papeles se rechaza
            }
        } else {
            // 2. Límites de peso según el tipo de mercancía
            if (tipo == 1 && peso > 20.0) {
                estado = "RECHAZADO";          // Carga general pasada de peso se rechaza
            } else if (tipo == 2 && peso > 16.0) {
                estado = "RECHAZADO";          // Perecedero pasado de peso se rechaza
            } else if (tipo == 3 && peso > 12.0) {
                estado = "RECHAZADO";          // Peligroso pasado de peso se rechaza
            } else {
                // 3. Origen y tratados especiales evaluados directamente
                if (tipo == 2) {
                    if (codigoPais >= 1000 && codigoPais <= 1999) {
                        estado = "REVISION MANUAL"; // Tratado especial tipo 1xxx
                    } else if (!(codigoPais >= 0 && codigoPais <= 27)) {
                        estado = "RECHAZADO";       // Fuera de la UE y sin tratado
                    }
                }
                else if (tipo == 3) {
                    if (codigoPais >= 3000 && codigoPais <= 3999) {
                        estado = "REVISION MANUAL"; // Tratado especial tipo 3xxx
                    } else if (!(codigoPais >= 0 && codigoPais <= 27)) {
                        estado = "RECHAZADO";       // Fuera de la UE y sin tratado
                    }
                }
            }
        }

        // --- SALIDA POR PANTALLA ---
        System.out.println("\nResultado final del contenedor: " + estado);
    }
}