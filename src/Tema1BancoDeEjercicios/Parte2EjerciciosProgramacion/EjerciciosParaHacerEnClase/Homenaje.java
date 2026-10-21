////////////////////////////////////////////////////////////////////////////////////////////
/*
 El homenaje

Tres amigos: Mariano, Martín y Asier han decidido darse un homenaje; por lo que van a ir a
su pub de confianza a empinar el codo. Sabemos que Asier solo bebe cubatas y tarda unos 25
minutos en acabarse el vaso, Mariano por otro lado, es un tío más recio y se bebe un cubata
en 20 minutos; además, entre cubata y cubata se bebe una cerveza tardando 10 minutos(por lo
 que suponemos que el número de cervezas nunca será mayor al de cubatas). Martín es un chaval
  más saludable, que se bebe una cerveza cada 15 minutos, pero no puede estar más de 8 minutos
  sin fumar o se muere. Además como Mariano es un tío enrollado, dice que él lo va a pagar todo.

Sabiendo que un cubata vale 5 euros, una cerveza 2,5 euros y que llegaron al pub a las 12:30 (00:30).

¿Cuánto dinero tiene que pagar Mariano? ¿A qué hora vuelve cada uno a su casa? ¿Cuántos cigarros se ha fumado Martín?

Entrada:

El usuario ingresará en 4 datos diferentes:

    Número de cubatas que se toma Asier.

    Número de cubatas que se toma Mariano.

    Número de cervezas que se toma Mariano.

    Número de cervezas que se toma Martín.

Salida:

Se muestra en 5 datos diferentes: la hora a la que cada uno vuelve
 a su casa (formato hh:mm), el precio total que pagarán entre todos
 y el número de cigarros que ha fumado Martín (sin decimales).

Entradas de ejemplo:

4 3 2 5
9 8 6 14
1 1 1 1

Salidas de ejemplo:

2:10 1:50 1:45 52,5€ 9
4:15 4:10 4:0 135€ 26
0:55 1:00 0:45 15€ 1
  */


////////////////////////////////////////////////////////////////////////////////////////////


package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.EjerciciosParaHacerEnClase;
import java.util.Scanner;

public class Homenaje {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        final int precioCubata = 5;
        final double precioCerveza = 2.5;
        System.out.print("Cuantos consumiciones tiene cada uno 1ºAsier,2ºMariano,3ºMartín");
        //30min = 30min*60s/min = 1800s
        //25 min = 25min*60s/min = 1500s
        //23 min = 23min*60s/min = 1380s
        //20 min = 20min*60s/min = 1200s
        //15 min = 15min*60s/min = 900s
        //10 min = 10min*60s/min = 600s
        //8 min = 8min*60s/min = 480s
        int segundosCigarros = 480;
        int asierNumCubatas = teclado.nextInt(),
            marianoNumCubatas = teclado.nextInt(),
            marianoNumCervezas = teclado.nextInt(),
            martinNumCervezas = teclado.nextInt();
        final int asierTiempoConsumicion = 1500,
                  marianoTiempoConsumicionCubata = 1200,
                  marianoTiempoConsumicionCerveza = 600,
                  martinTiempoConsumicionCerveza = 900,
                  martinTiempoConsumicionCigarro = 480,
                  horaDeLlegada = 1800;  //COMO LLEGAN A LAS 00:30 EL DÍA LLEVA 1800 segundos desde que comenzó
        int asierSegundosTotal = (asierNumCubatas*asierTiempoConsumicion)+horaDeLlegada,
            marianoSegundosTotal = (marianoNumCubatas*marianoTiempoConsumicionCubata)+(marianoNumCervezas*marianoTiempoConsumicionCerveza)+horaDeLlegada,
            martinSegundosTotal = (martinNumCervezas*martinTiempoConsumicionCerveza)+horaDeLlegada,
            martinSegundosTotalCigarros =(martinSegundosTotal/segundosCigarros);




        /* ********************* PASO SE SEGUNDOS A HORAS MIN Y SEG ********************* */

        //ASIER
        final int unaHoraEnSegundos = 3600,
                  unMinutoEnSegundos = 60;
        int asierHoras = asierSegundosTotal/unaHoraEnSegundos,
            asierMin = (asierSegundosTotal%unaHoraEnSegundos)/unMinutoEnSegundos;
          //  asierSeg = ((asierSegundosTotal%unaHoraEnSegundos)%unMinutoEnSegundos);


        //MARIANO
        int  marianoHoras = marianoSegundosTotal/unaHoraEnSegundos,
             marianoMin = (marianoSegundosTotal%unaHoraEnSegundos)/unMinutoEnSegundos;

         //    marianoSeg = ((marianoSegundosTotal%unaHoraEnSegundos)%unMinutoEnSegundos);


        //MARTÍN
        int martinHora = martinSegundosTotal/unaHoraEnSegundos,
            martinMin = (martinSegundosTotal%unaHoraEnSegundos)/unMinutoEnSegundos;
         //   martinSeg = ((martinSegundosTotal/unaHoraEnSegundos)%unMinutoEnSegundos);

        //CALCULO EL DINERO
        double dineroCervezas = (marianoNumCervezas+martinNumCervezas)*precioCerveza;
        int    dineroCubatas = (asierNumCubatas+marianoNumCubatas)*precioCubata;
        double dineroTotal = dineroCervezas + dineroCubatas;



        //CALCULO CIGARROS DE MARIANO
        int cigarros = martinSegundosTotalCigarros+1;

        System.out.printf("%2d:%02d  %2d:%02d  %2d:%02d  %.1f€  %2d",asierHoras,asierMin,marianoHoras,marianoMin,martinHora,martinMin,dineroTotal,cigarros);





    }




}
