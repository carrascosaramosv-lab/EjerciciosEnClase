////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un número N y dibuja un triángulo invertido: N asteriscos en la primera fila, N − 1 en la segunda, y así
sucesivamente.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;
import java.util.Scanner;
public class ANI04 {
    public static void main(String[]args){
        System.out.print("Dime el numero de la base: ");
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();

        for(int i = filas;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
