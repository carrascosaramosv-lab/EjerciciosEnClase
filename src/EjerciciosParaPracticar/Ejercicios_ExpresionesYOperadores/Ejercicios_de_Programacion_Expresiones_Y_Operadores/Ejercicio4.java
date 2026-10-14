//////////////////////////////////////////////////
/*Realiza un conversor de euros a pesetas. La
cantidad de euros que se quiere convertir debe
ser introducida por teclado. 1 euro = 166.386 pesetas
 */
//////////////////////////////////////////////////

package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores;
import java.util.Scanner;

public class Ejercicio4 {     //Estoy generando una clase publica llamada "Ejercicio4"
    public static void main(String[] args) { /* Punto de entrada principal del programa.
          public significa que es accesible desde cualquier luegar.
          static indica que no necesitas una instancia de la clase para ejecutarlo.
          void quiere decir que no devuelve ningún valor.
          main es el nombre del método.
          String[]args: recibe los parámetros por línea de comandos */
        System.out.print("Dime cuantos euros para hacer la coversion: "); //Uso un sistema de salida por pantalla sin salto de línea.
        Scanner teclado = new Scanner(System.in); //Creo un objeto.
        double eu = teclado.nextDouble(); //El dato introducido por teclado lo defino como una variable del tipo double, puesto que vamos a trabajar con más de dos decimales.
        double pes = eu * 166.386; // Aquí porngo una varible que viene definida por una operación aritmética.
        System.out.print(eu + "€ son " + pes + "pts."); //Imprimo por pantalla el resultado.

    }
}
