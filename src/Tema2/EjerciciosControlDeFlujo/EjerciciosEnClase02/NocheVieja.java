///////////////////////////////////////////////////////////////////////////////////////////
/*
Nochevieja

Ramón se pasa el día de Nochevieja contando los minutos que faltan para que den las uvas. ¿Puedes ayudarle?

Entrada

La entrada consiste en una hora formada por las horas y los minutos separados por un espacio, y utilizando siempre dos dígitos. Se utiliza una representación en formato 24 horas (es decir, desde 00 00 a 23 59).

Salida

Se mostrará una línea con el número de minutos que faltan para medianoche.

Entrada de ejemplo

23 45
21 30
00 01
00 00

Salida de ejemplo

15
150
1439
 */
///////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class NocheVieja {
    public static void main(String[]args){
        final int MINUTOSHORAS = 60;
        final int MINUTOSDIA= 1440;


        System.out.println("Introduce la hora hh mm");
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt(),
                min = sc.nextInt();

        int minTotales = (horas*MINUTOSHORAS)+min,
            minTotalRestantes = MINUTOSDIA-minTotales;
       /* int horasRestantes = (minTotalRestantes/60),
            minutosRestantes=(minTotalRestantes%60);

        System.out.printf("%d:%d",horasRestantes,minutosRestantes);*/

        System.out.printf("%d",minTotalRestantes);



    }
}
