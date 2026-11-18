////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar
 números hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl17 {
    public static void main(String[]args){
        int num=0;
        int i=0;
        while (num!=24){
            num=(int)(Math.random()*100);
            if(num%2==0) {
                System.out.println(num);
                i++;
            }
        }
        System.out.printf("%d números generados. ",i);
    }
}
