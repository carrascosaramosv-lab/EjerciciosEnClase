////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Leer números enteros hasta que nos escriban -1 y terminar escribiendo cuántos de ellos acaban en 2.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl11 {
    public static void main(String[]args){

        System.out.println("Introduce el numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num-2;
        int j = 0;
        while(num!=-1) {

            if (i % 10 == 0) {
                j++;
            }
            System.out.println("\nIntroduce el numero: ");
            num = sc.nextInt();
            i = num-2;
        }
         System.out.printf(" has escrito %d terminados en 2",j);

    }
}
