/////////////////////////////////////////////////////////////////////////////////
    /* Escribe un programa que lea un número entero por teclado
    muestre por pantalla el doble y el triple de ese número.
       */
//////////////////////////////////////////////////////////////////////////////////

package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores;
import java.util.Scanner; //IMPORTO LA CLASE Scanner que está en util que está dentro de del paquete java.
public class Ejercicio1 { //pongo que es de acceso public toda la función que va a ser del tipo clase y se llama Ejercicio1 que es el main.////(REVISAR ESTO)


    public static void main(String[]args){ //digo que estoy llamando a mi main de forma publica y estática del tipo String/////(REVISAR ESTO)

            Scanner teclado = new Scanner(System.in); //CREO EL OBJETO

        System.out.print("Escribe un número para ver su doble y su triple: "); //ESCRIBO POR PANTALLA
        int num = teclado.nextInt(); //Leo lo que me entra por teclado y declaro que es de tipo entero.
        System.out.println("El numero introducido es: " + num+"\nEl doble es: " +(num*2)+"\nEl triple es: " + (num*3)); //Imprimo por pantalla y voy concatenando variables y operaciones y el salto de linea \n hay que meterlo dentro de las comillas.



    }

}
