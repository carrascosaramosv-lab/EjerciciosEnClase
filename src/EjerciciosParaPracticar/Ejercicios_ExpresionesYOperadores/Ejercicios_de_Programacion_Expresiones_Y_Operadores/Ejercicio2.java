///////////////////////////////////////////////////////////////////
/* Programa que declare una variable entera N y asígnale un valor. A continuación
escribe las instrucciones que realicen lo siguiente: Incrementar N en 77,
decrementarla en 3, duplicar su valor.
 */
////////////////////////////////////////////////////////////////


package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[]args){
        System.out.print("Introduce un número:");
        Scanner teclado = new Scanner(System.in); //creo el objeto.
        int n = teclado.nextInt(); //declaro la variable que le va asignar el valor que introduzca por teclado.
        int incr = n+77; //declaro las variables y le asigno una operación aritmética
        int dec = n-3; //declaro las variables y le asigno una operación aritmética
        int dupl= n*2; //declaro las variables y le asigno una operación aritmética
        System.out.println("El numero introducido es: " + n + "\nEl incremento de 77 es: " + incr + "\nEl decremento de 3 es: " + dec + "\nEl valor duplicado es: " + dupl);
    /*Uso un sistema de salida de impresión por pantalla y hago salto de linea y luego dentro estoy haciendo salto de linea dentro de
    la cadena texto con \n para no tener que escribir todo el tiempo System.out.println */
    }



}
