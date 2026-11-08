//////////////////////////////////////////////////////////////////////////////////////////////
/*
Programa que lea un número entero por teclado y calcule si es par o impar.
 */
//////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs02 {
    public static void main(String[] args){

        System.out.print("Escribe un número para ver si es par impar");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2 != 0) {
            System.out.printf(" %02d ---> impar",num);
        }else {
            System.out.printf(" %02d ---> par",num);
        }



    }


}
