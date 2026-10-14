////////////////////////////////////////////////////////////////////////
/*Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación. */
////////////////////////////////////////////////////////////////////////


package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores;
import java.util.Scanner;


public class Ejercicio3 {
 public static void main(String[]args){

     System.out.print("Escribe el primer numero que quieras multiplicar");
     Scanner teclado = new Scanner(System.in);
     int n1 = teclado.nextInt();
     int n2 = teclado.nextInt();
     System.out.print("El resultado de la multiplicación de " + n1 + "x" + n2 + "=" + (n1*n2));


 }


}
