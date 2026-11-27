////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un número N y dibuja un triángulo rectángulo de asteriscos de N filas: un asterisco en la primera fila, dos
en la segunda, y así sucesivamente.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;
import java.util.Scanner;
public class ANI03 {
    public static void main(String[]args){
        System.out.print("Introduce cuantas filas: ");
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        for(int i =0;i<=filas;i++){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
