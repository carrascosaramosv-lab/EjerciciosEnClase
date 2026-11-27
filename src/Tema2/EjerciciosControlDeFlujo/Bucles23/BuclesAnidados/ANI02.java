////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un número N y dibuja un cuadrado de asteriscos de N filas y N columnas.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;
import java.util.Scanner;
public class ANI02 {
    public static void main(String[]args){
        System.out.print("Introduce cuanto mide el lado del cuadrado: ");
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();
        for(int i =0;i<=lado-1;i++){
            for(int j=0;j<=lado-1;j++){
                System.out.print("*  ");// le pongo dos espacios para que visualmente se vea mejor el cuadrado.
            }
            System.out.println();
        }
    }
}
