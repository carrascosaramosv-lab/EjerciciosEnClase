/////////////////////////////////////////////////////////////////////////////////////////////
/*
Las 15 cerillas

El juego de las 15 cerillas es un juego clásico de sobremesa para dos personas con el que
 hacer pensar durante un rato a los niños. Se colocan sobre la mesa 15 cerillas (o 15
 palillos, cubiertos, o cualquier otro tipo de objeto). Los dos jugadores deben ir quitando, de
 manera alterna, 1, 2 o 3 cerillas. Pierde aquél que elimina la última cerilla.

El juego puede generalizarse a cualquier número de cerillas inicial, y a cualquier número
 máximo de cerillas a retirar por turno.

¿Eres capaz de jugar y ganar?

Entrada

La entrada consistirá en una sucesión de casos de prueba. Para cada uno, se indica el número de
 cerillas que quedan sobre la mesa (un número entre 1 y 10.000), y el número máximo de cerillas
  que se pueden retirar (entre 1 y 10).

Salida

Para cada caso de prueba, el programa indicará el número de cerillas que habría que quitar para
 mantener la esperanza de ganar. Si, asumiendo que el contrario es un jugador perfecto, resulta
 imposible hacerlo, se escribirá PIERDO.

Entrada de ejemplo

5 2

4 3

1 5

Salida de ejemplo

1

3

PIERDO
 */

/////////////////////////////////////////////////////////////////////////////////////////////





package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class Las15Cerillas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el número de cerillas que hay en el juego: ");
        int numeroTotalCerillas = sc.nextInt();
        System.out.print("Indica el número de cerillas máximo que se puede retirar de una vez: ");
        int numeroMaximoCerillas = sc.nextInt();
        int coger = 0;
        if (numeroTotalCerillas-numeroMaximoCerillas<3){
            coger=numeroMaximoCerillas-numeroTotalCerillas;
            System.out.printf("%d",coger);
        } else if (numeroTotalCerillas-numeroMaximoCerillas<=2) {
            System.out.println("pierde el que empiece: ");
        }else if (numeroMaximoCerillas-numeroMaximoCerillas==3){
            System.out.println("1");
        }


    }
}
