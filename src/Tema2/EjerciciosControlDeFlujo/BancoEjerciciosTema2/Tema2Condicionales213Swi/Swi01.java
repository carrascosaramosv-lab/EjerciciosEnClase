////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa en el que, dado un número del 1 al 7, escriba el correspondiente nombre del día
de la semana. Si el número no está entre 1 y 7, muestra un mensaje de error
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales213Swi;
import java.util.Scanner;
public class Swi01 {
    public static void main(String[]args){
        /*
        System.out.println("Introduce el dia de la semana: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        //////////////////////////////////////////SWITCH CLASICO///////////////////////////////////////////////////////

        switch (num){
            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miercoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sabado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
            default:
                System.out.println("ERROR: VALORES NO VÁLIDOS.");

            }
            */

        ///////////////////////////////////////////SWITCH MODERNO//////////////////////////////////////////////////////


        System.out.println("Introduce el dia de la semana: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String resultado =switch (num){
            case 1 -> "Lunes.";
            case 2 -> "Martes.";
            case 3 -> "Miercoles.";
            case 4 -> "Jueves.";
            case 5 -> "Viernes.";
            case 6 -> "Sabado.";
            case 7 -> "Domingo.";
            default -> "Error día no válido.";
        };
        System.out.printf("%s",resultado);

    }
}
