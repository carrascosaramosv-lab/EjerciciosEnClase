////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Sanfermines

Un buen corredor de Sanfermines intenta mantener la emoción para fomentar el espectáculo. Este tipo de
 corredores está muy en forma y son capaces de correr mucho más deprisa que los toros. Sin embargo, para
 mantener la emoción, no lo hacen. Se limitan a mantener una velocidad adecuada para que los toros se mantengan
  siempre cerca, pero no lleguen a pillarles.

El problema consiste en, dadas las velocidades de todos los toros que participan en los Sanfermines (y que se suponen
 constantes), ¿a qué velocidad deben ir estos corredores expertos para mantener el espectáculo conservando
 su integridad?

Entrada

La entrada consta de una serie de casos de prueba, cada uno en una línea. El primer número de la misma indica
el número de toros que intervienen en la carrera (n ≥ 1). A continuación aparece un entero por cada uno de
los toros, indicando la velocidad a la que correrá ese toro (recuerda, es velocidad constante). La velocidad es
siempre positiva y no excede 109.

Salida

Para cada caso de prueba se mostrará una línea en la que aparecerá la velocidad a la que deberán ir los
 corredores expertos para mantener el espectáculo.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class SanFermin {
    public static void main(String[]args){

        final int velocidadMaxToro=109;
        System.out.println("¿Cuantos toros participan?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("toros");
        for(int i =1;i<=n;i++){

            int velocidadToro = sc.nextInt();
            if (velocidadToro<=velocidadMaxToro && velocidadToro>0){
                System.out.printf("la velocidad a la que debe ir el corredor es %d\n",velocidadToro);

            }else {
                System.out.println("ERROR: Velocidad introducida errónea.");
            }


        }

     sc.close();
        //patron 7 maximo y minimo

    }
}
