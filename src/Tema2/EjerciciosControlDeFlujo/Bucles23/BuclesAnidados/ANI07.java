////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un número N y dibuja una pirámide de asteriscos de N filas, centrada con espacios
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;
import java.util.Scanner;
public class ANI07 {
  public static void main(String[]args){

      System.out.println("dime el numero de filas: ");
      Scanner sc = new Scanner(System.in);
      int filas = sc.nextInt();

      for (int i =0;i<=filas;i++){
          for (int j =0;j<=filas-i;j++){
              System.out.println(" ");

          }
      }
  }
}
