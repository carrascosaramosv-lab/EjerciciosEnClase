/////////////////////////////////////////////////////////////////
/* Programa que lee una temperatura expresada en grados centígrados
y la convierte a grados kelvin. 0 ºC = 273 ºK */
/////////////////////////////////////////////////////////////////

package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores;
import java.util.Scanner; //Importo la clase Scanner.

public class Ejercicio7 {
    public static void main(String[]args){
        System.out.print("Introduce una tempueratura en grados centrigrados.");
        Scanner teclado = new Scanner(System.in);
        double temp = teclado.nextDouble();
        double kel = temp + 273;
        System.out.println("Los grados centigrados " + temp + " en grados Kelvin es : " + kel);
    }
}
