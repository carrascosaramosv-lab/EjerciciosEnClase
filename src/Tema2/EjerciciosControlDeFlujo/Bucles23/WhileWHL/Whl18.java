////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga cuántos
 números se han introducido, la media de los impares y el mayor de los pares. El número negativo solo se utiliza
  para indicar el final de la introducción de datos, pero no se incluye en el cómputo.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl18 {
    public static void main(String[]args){
        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x;
        int i=0;
       while(num>0){
           if (num%2!=0){
                i++;
               x=num/i;
           }
       }

    }
}
