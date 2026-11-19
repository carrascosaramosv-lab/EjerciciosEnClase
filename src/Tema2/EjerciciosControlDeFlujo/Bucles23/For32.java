////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Muestra los números del 1 al 30 sustituyendo los múltiplos de 3 por «Fizz», los múltiplos de 5 por «Buzz» y los
múltiplos de ambos por «FizzBuzz».
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23;
import java.util.Scanner;
public class For32 {
    public static void main(String[]args){

        for(int i=1;i<=30;i++){
            if (i%3==0 && i%5==0){
                System.out.print(" FizzBuzz ");
            }else if (i%3==0){
                System.out.print(" Fizz ");
            } else if (i%5==0) {
                System.out.print(" Buzz ");
            }else {
                System.out.printf("%d ",i);
            }

        }

    }
}
