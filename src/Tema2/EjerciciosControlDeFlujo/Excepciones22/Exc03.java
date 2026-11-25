////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Pide la edad con nextInt(). Si el usuario escribe algo que no es un entero, captura
InputMismatchException y muestra «Edad no válida».
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.Excepciones22;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exc03 {
    public static void main(String[]args){
        try{
            System.out.print("Introduce tu edad: ");
            Scanner sc = new Scanner(System.in);
            int edad= sc.nextInt();


        }catch (InputMismatchException e){
            System.out.println("Edad no válida");

        }
    }
}
