////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl08 {
    public static void main(String[]args){

        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i!=0){
            if(i%2==0){
                System.out.printf("El número %d es par.",i);
            }else {
                System.out.printf("El número %d es impar.",i);
            }
            System.out.println("\nIntroduce un número: ");
            i = sc.nextInt();
        }
        System.out.println("FIN");

    }

}
