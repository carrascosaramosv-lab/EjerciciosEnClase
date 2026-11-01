///////////////////////////////////////////////////////////////////////////////////////////////////
/*

El nuevo homenaje

Tres amigos: Mariano, Martín y Asier han decidido darse un homenaje; por lo que van a ir a su pub
 de confianza a empinar el codo. Sabemos que Asier solo bebe cubatas y tarda unos 25 minutos en acabarse
 el vaso, Mariano por otro lado, es un tío más recio y se bebe un cubata en 20 minutos; además, entre cubata
 y cubata se bebe una cerveza tardando 10 minutos (por lo que suponemos que el número de cervezas nunca será
  mayor al de cubatas). Martín es un chaval más saludable, que se bebe una cerveza cada 15 minutos, pero no puede
   estar más de 8 minutos sin fumar o se muere y tarda en fumarse un cigarro 5 minutos. Además como Mariano es un tío
   enrollado, dice que él lo va a pagar todo.

Sabiendo que un cubata vale 5 euros, una cerveza 2,5 euros y que llegaron al pub a las 12:30 (00:30).

¿Cuánto dinero tiene que pagar Mariano? ¿A qué hora vuelve cada uno a su casa? ¿Cuántos cigarros se ha fumado Martín?

Entrada:

El usuario ingresará en 4 datos diferentes:

    Número de cubatas que se toma Asier.

    Número de cubatas que se toma Mariano.

    Número de cervezas que se toma Martín.

Salida:

Se muestra en 6 datos diferentes: la hora a la que cada uno vuelve a su casa (formato hh:mm), el precio total que
 pagarán entre todos y el número de cervezas que toma Mariano y de cigarros que ha fumado Martín.

Entradas de ejemplo:

4 3 5
9 8 14
1 1 1

 */
///////////////////////////////////////////////////////////////////////////////////////////////////


package Tema1.A00EjerciciosParaHacerEnClase;
import java.util.Scanner;
public class NuevoHomenaje {
    public static void main (String[] args){

        final int PRECIOCUBATA = 5,
                  HORALLEGADA = 30,
                  ASIERTIEMPOPORCUBATA = 25,
                  MARIANOTIEMPOPORCUBATA = 20,
                  MARIANOTIEMPOPORCERVEZA = 10,
                  MARTINTIEMPOPORCERVEZA = 15,
                  TIEMPOENFUMAR = 5,
                  TIEMPOENTRECIGARROS = 8,
                  MARTINTIEMPOCIGARRO = TIEMPOENFUMAR + TIEMPOENTRECIGARROS,
                  UNAHORAENMIN = 60;
        final double PRECIOCERVEZA = 2.5;


        Scanner sc = new Scanner(System.in);

        int numCubatasAsier = sc.nextInt(),
            numCubatasMariano = sc.nextInt(),
            numCervezasMartin = sc.nextInt();

        int asierMinutosTotales = (numCubatasAsier*ASIERTIEMPOPORCUBATA)+HORALLEGADA,
            marianoNumeroCervezas = numCubatasMariano-1,
            marianoMinutosTotales = (numCubatasMariano*MARIANOTIEMPOPORCUBATA)+(marianoNumeroCervezas*MARIANOTIEMPOPORCERVEZA)+HORALLEGADA,
            martinMinutosTotales = (numCervezasMartin*MARTINTIEMPOPORCERVEZA)+HORALLEGADA,
            asierHoras=asierMinutosTotales/UNAHORAENMIN,
            asierMinutos=asierMinutosTotales%UNAHORAENMIN,
            marianoHoras=marianoMinutosTotales/UNAHORAENMIN,
            marianoMinutos=marianoMinutosTotales%UNAHORAENMIN,
            martinHoras=martinMinutosTotales/UNAHORAENMIN,
            martinMin=martinMinutosTotales%UNAHORAENMIN,
            martinCigarros=(martinMinutosTotales-HORALLEGADA)/MARTINTIEMPOCIGARRO;
        double  dineroCubatas = (numCubatasAsier+numCubatasMariano)*PRECIOCUBATA,
                dineroCervezas = (numCervezasMartin+marianoNumeroCervezas)*PRECIOCERVEZA,
                dineroTotal = dineroCervezas+dineroCubatas;

        System.out.printf("%02d:%02d   %02d:%02d   %02d:%02d  %.1f€  %02d  %02d",asierHoras,asierMinutos,marianoHoras,marianoMinutos,martinHoras,martinMin,dineroTotal,marianoNumeroCervezas,martinCigarros);





    }



}
