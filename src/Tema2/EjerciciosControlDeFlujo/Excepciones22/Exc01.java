////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee dos números enteros y muestra el resultado de la división entera del primero entre el
segundo. Si el divisor es 0, captura la excepción ArithmeticException y muestra «No se puede dividir entre cero».
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.Excepciones22;
import java.util.Scanner;

public class Exc01 {
    public static void main(String[]args){
        try {
            System.out.println("Introduce el dividendo.");

            Scanner sc = new Scanner(System.in);
            int dividendo = sc.nextInt();
            System.out.println("Introduce el divisor.");
            int divisor = sc.nextInt();

            int res = dividendo / divisor;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: No se puede dividir entre 0");

        }
    }
}
