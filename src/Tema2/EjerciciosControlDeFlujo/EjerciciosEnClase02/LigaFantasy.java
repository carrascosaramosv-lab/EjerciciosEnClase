/////////////////////////////////////////////////////////////////////////////////////////
/*
Liga Fantasy

Mi grupo de amigos y yo que subimos todos a jugar al campo de fútbol tenemos la idea de recrear de forma rudimentaria el popular juego de la liga fantasy, pero usando como jugadores a todos los que subimos a jugar para crear nuestra propia liga. Para ello, haremos un programa que introduzca el nombre del jugador y las puntuaciones que ha tenido a lo largo de los partidos de un día para saber cuánto puntúa cada partido de la siguiente manera:

goles: +2

tiros a puerta:  +1

goles en contra: -1

Faltas: -1

Manos: -2

Antes de mirar los puntos deciden poner un par de normas:

-Si haces 3 goles o más eres una leyenda

-Si haces menos de 5 puntos eres un matao

-Si haces más de 3 faltas eres un carnicero

Entrada

Se pide el nombre del jugador y las estadísticas del partido

Salida

Se devuelve los puntos hechos por el jugador, si es una leyenda, si es un matao y si es un carnicero.

Ejemplo entrada

Gonza: 5 goles, 6 tiros a puerta, 8 goles en contra, 1 falta, 1 mano

Asier: 2 goles, 4 tiros a puerta, 8 goles en contra, 0 faltas, 0 manos

Ejemplo de salida

Gonza ha hecho 5 puntos en este partido. Eres una leyenda.

Asier ha hecho 0 puntos en este partido. Eres un matao
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class LigaFantasy {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce los goles: ");
        int goles = sc.nextInt();
        System.out.println("Introduce tiros a puerta: ");
        int tirosPuerta = sc.nextInt();
        System.out.println("Introduce los goles en contra: ");
        int golesContra = sc.nextInt();
        System.out.println("Introduce el número de faltas: ");
        int faltas = sc.nextInt();
        System.out.println("Introduce cuantas manos: ");
        int manos = sc.nextInt();
        int puntosTotales = ((goles*2)+tirosPuerta-golesContra-faltas-(manos*2));
        String leyenda = "",
               matao = "",
                carnicero = "";
        if(goles>=3){
            leyenda = "Eres una leyenda";
        }
        if(puntosTotales<5){
            matao = "Eres un matao";
        }
        if (faltas>3){
            carnicero = "Eres un carnicero";
        }


        System.out.printf("%s ha hecho %d puntos en este partido.%s %s %s",nombre,puntosTotales,leyenda,matao,carnicero);
    }



}
