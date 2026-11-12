////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl07 {
    public static void main(String[] args) {

        System.out.println("\nIntroduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        /*
        do {
            System.out.println("\nIntroduce un numero");
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();

            double raiz = Math.sqrt(i);
            System.out.printf("%.2f", raiz);
        } while(i>=0);
        System.out.println("FIN");
          */

        while(i>=0){

            double raiz = Math.sqrt(i);
            System.out.printf("%.2f", raiz);
            System.out.println("\nIntroduce un numero: ");
            i = sc.nextInt();
        }
        System.out.println("FIN");


        //PORQUE ME ESCRIBE  NaNFIN CUANDI SALGO??






    }
}



