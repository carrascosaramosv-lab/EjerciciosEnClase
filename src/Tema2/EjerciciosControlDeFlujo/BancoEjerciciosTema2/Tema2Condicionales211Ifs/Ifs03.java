/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Programa que lea un número entero y muestre si el número es múltiplo de 10.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs03 {

    public static void main(String[] args){

        System.out.print("Introduce un número para ver si es multiplo de 10: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       final int A = 10;
        if(num%A==0){

           System.out.printf("%02d---> es multiplo de %02d",num,A);

        }else {
            System.out.printf("%02d---> no es multiplo de %02d",num,A);
        }

    }



}
