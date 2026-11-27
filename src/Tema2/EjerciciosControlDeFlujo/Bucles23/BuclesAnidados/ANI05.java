////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Muestra todas las tablas de multiplicar del 1 al 5, cada una con sus productos del 1 al 10.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;
import java.util.Scanner;
public class ANI05 {
    public static void main(String[]args){
        for (int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                int r=i*j;
                System.out.printf("%d x %d = %d\n",i,j,r);
            }
            System.out.println();
        }

    }
}
