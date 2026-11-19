////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Suma de dígitos

Se trata de implementar un programa que sume los dígitos de un número entero no negativo. Por ejemplo,
 la suma de los dígitos del 3433 es 13.

Para darle un poco más de emoción, el programa no se limitará a escribir el resultado de la suma, sino que
también escribirá todos los sumandos utilizados: 3 + 4 + 3 + 3 = 13.

Entrada

Cada caso de prueba es una simple línea con un número no negativo no mayor que 109 del que habrá que sumar
todos sus dígitos.

Salida

Para cada caso de prueba se mostrará una línea en la que aparecerán cada uno de los dígitos separados por el
signo +, tras lo cual aparecerá el símbolo = y la suma de todos los dígitos.


Ten en cuenta que antes y después de cada símbolo (+ y =) hay un espacio.


 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class SumaDeDigitos {

    public static void main(String[]args){


        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digito = 0;

        String sumaNum="";

        for(;num>0;num=num/10){

            digito= num%10;
            if (digito!=0) {
                sumaNum = digito + " + ";
            }
            num=num/10;



        }
        System.out.println(sumaNum);








    }

}
