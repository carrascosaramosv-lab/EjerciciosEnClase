////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Programa que pide un número entero por teclado y calcula y muestra el número de cifras que tiene.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl14 {
    public static void main(String[]args){

        System.out.print("Introduce un número por teclado: ");
        //2.147.483.647
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =0;
        while(num!=0){
            num/=10;
            i++;
        }
        if (i==1){
            System.out.printf("%d cifra.",i);
        } else {
            System.out.printf("%d cifras.", i);
        }


    }
}
