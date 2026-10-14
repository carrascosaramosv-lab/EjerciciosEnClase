/////////////////////////////////////////////////////////
/* Escribe un programa en el que se declaren las variables
 enteras x e y. Asígnales los valores 144 y 999 respectivamente.
  A continuación, muestra por pantalla el valor de cada variable,
 la suma, la resta, la división y la multiplicación.
 */
/////////////////////////////////////////////////////////



package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores;
//Package es un paquete o una "carpeta" donde estan guardadas las clases y otros archivos relacionados(subpaquetes, archivos de recuros, etc.)
import java.util.Scanner;
/* Aquí estoy importando una clase específica llamada "Scanner" que se encuentra dentro
del paquete java.util esto permite usar las funciones de lectura de datos de la calse en el código  */

public class Ejercicio5 {     //Estoy generando una clase pública llamada "Ejercicio5".
    public static void main(String[]args){  //Aquí he generado el punto de entrada para mi programa.

        int x = 144; //he asignado un valor de tipo int a esta variable "x"
        int y = 999; //he asignado un valor de tipo int a esta variable "y"
        int sum = 144+999;//he asignado un valor de tipo int a esta variable.
        int res1 = 144-999;//he asignado un valor de tipo int a esta variable.
        int res2 = 999-144;//he asignado un valor de tipo int a esta variable.
        float div1 = 144/999f;//he asignado un valor de tipo float a esta variable.
        float div2 = 999/144;//he asignado un valor de tipo float a esta variable.
        int mul = 144*999;//he asignado un valor de tipo int a esta variable.

        System.out.print("PARA 144 Y 999 AQUÍ TIENES DIFERENTES OPERACIONES:");
        System.out.print("LA SUMA ES: " + sum + "\nPARA RESTAR 144 MENOS 999 ES : " + res1 + "                  PARA RESTAR 999 MENOS 144 ES: " + res2 + "\nPARA LA DIVISIÓN DE 144 ENTRE 999 ES: " + div1 + "     PARA LA DIVISIÓN DE 999 ENTRE 144 ES: " + div2 + "\nPARA LA MULTIPLICACIÓN ES: " + mul);
        //Imprimo por pantalla




    }




}
