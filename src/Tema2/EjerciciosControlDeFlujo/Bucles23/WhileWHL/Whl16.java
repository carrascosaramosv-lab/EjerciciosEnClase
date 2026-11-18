////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su
 suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, el contador
 de los números introducidos y la media.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl16 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int i = 0,
            sum = 0;
        double x=0;


        while(sum<10000){
            System.out.print("Introduce un número : ");
            int num= sc.nextInt();
            i++;
            sum+=num;
             x=(double)sum/i;

        }

        System.out.printf(" El total es %d  ·%d números · media \u2248 %.2f . ",sum,i,x); //  "\u2248" es la secuencia en Unicode del aprox.


    }
}
