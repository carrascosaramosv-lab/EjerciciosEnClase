////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Dibuja por pantalla un rectángulo de asteriscos de 4 filas y 6 columnas.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;
import java.util.Scanner;
public class Ani01 {
    public static void main(String[]args){

        final int COLUMNAS = 6;
        final  int FILAS= 4;
        for(int i=0;i<=COLUMNAS-1;i++){
            for (int j=0;j<=FILAS-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
