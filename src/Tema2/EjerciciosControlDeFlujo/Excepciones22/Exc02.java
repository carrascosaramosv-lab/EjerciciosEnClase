////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un texto y conviértelo a número entero con Integer.parseInt. Si el texto no es un número, captura
NumberFormatException y muestra «Eso no es un número».
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Excepciones22;
import java.util.Scanner;
public class Exc02 {
    public static void main(String[]args){
       try {
           System.out.println("Introduce un número.");
           Scanner sc = new Scanner(System.in);
           String txt = sc.nextLine();
           Integer.parseInt(txt);
           System.out.println(txt);
       }catch (NumberFormatException e){
           System.out.println("Eso no es un número");

        }
    }
}
