/////////////////////////////////////////////////////////////////////////////////////////
/*
Con la llegada de las lluvias, has descubierto una molesta gotera en el salón. Con precisión
suiza, las gotas caen una vez por segundo desde el techo hasta un improvisado cubo que te ves
obligado a vaciar periódicamente hasta que encuentres una solución.
Convivir con una gotera es complicado porque tienes que sincronizar tu vida alrededor de los
vaciados del cubo…

Entrada

Cada caso de prueba será un número mayor que cero con el número de gotas que entran en el cubo.

Salida

Para cada caso de prueba, el programa escribirá en una línea el tiempo máximo que
puedes estar sin cambiar el cubo en el formato HH:MM:SS, donde HH indica el número de
horas, MM el número de minutos y SS el número de segundos.
Ningún cubo es tan grande como para poder estar más de un día completo sin cambiarse.

Entrada de ejemplo

70
3600
3661

Salida de ejemplo

0:1:10
1:0:0
1:1:1
 */
//////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class Gotitas {
    public static void main(String[]args){

        final  int segundosMinutos = 60;
        final  int segundosHora = 3600;


        System.out.println("¿Cuantas gotas entran máximo en el cubo?");
        Scanner sc = new Scanner(System.in);
        int numGotas = sc.nextInt();

         int horasGotas = numGotas/segundosHora,
                 minutosGotas = (numGotas%segundosHora)/segundosMinutos,
                 segundosGotas = ((numGotas%segundosHora)%segundosMinutos);

        System.out.printf("%02d:%02d:%02d",horasGotas,minutosGotas,segundosGotas);



    }
}
