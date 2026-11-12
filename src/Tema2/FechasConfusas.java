////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

El jefe de Victor se confunde con las fechas cuando se ponen de forma numérica y muchas veces las escribe mal y para saber
si se equivoca le pide que haga un programa que lea un número entero que representa una fecha en formato
DDMMAAAA (8 dígitos, por ejemplo, 25122026 para el 25 de diciembre de 2026). Y muestra por pantalla un único valor
 booleano (true o false) que indique si la fecha es estrictamente válida, teniendo en cuenta que:

El día debe estar entre 1 y el límite correspondiente a su mes (incluyendo los meses de
31 días, los de 30, y febrero, teniendo en cuenta si el año es bisiesto o no).

El mes debe estar entre 1 y 12.

El año debe estar entre 0 y 9999.

Entrada
23051995
31042004
29021900

Salida
true
false
false


 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2;
import java.util.Scanner;

public class FechasConfusas {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce una fecha en formato DDMMAAAA (8 dígitos, ej. 25122026):");
            int fecha = sc.nextInt();

            int dia = fecha / 1000000;
            int mes = (fecha / 10000) % 100;
            int anio = fecha % 10000;


            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

            // 3. Validación estricta en una ÚNICA gran expresión booleana
            boolean esValida = (anio >= 0 && anio <= 9999) &&
                    (mes >= 1 && mes <= 12) &&
                    (dia >= 1) && (
                    ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) ||
                            ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) ||
                            (mes == 2 && (dia <= 28 || (dia == 29 && esBisiesto))));


            System.out.println("¿La fecha es válida?: " + esValida);
     }


}
