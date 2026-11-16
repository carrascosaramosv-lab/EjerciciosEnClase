////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que calcule la media de un conjunto de números positivos introducidos por
teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl13 {
    public static void main(String[]args){

            System.out.println("Introduce un número");
            Scanner sc = new Scanner(System.in);
            double nota= sc.nextDouble();
            int i=0;
            double media =0;
            double sum=0;

            while (nota>=0){
                i++;
                sum +=nota;
                System.out.println("Introduce un número");
                nota= sc.nextDouble();

            }
             media = sum/i;
           System.out.printf("%.2f",media);
    }
}
