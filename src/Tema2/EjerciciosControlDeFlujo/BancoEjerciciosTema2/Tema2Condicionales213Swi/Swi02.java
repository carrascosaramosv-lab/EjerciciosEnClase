////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres…
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales213Swi;
import java.util.Scanner;
public class Swi02 {
    public static void main(String[]args){

        //////////////////////////////////////SWITCH CLASICO///////////////////////////////////////////////////////////
        /*
        System.out.println("Introduce una nota entre 0 y 10.");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        switch (nota){
            case 0:
                System.out.println("cero.");
                break;
            case 1:
                System.out.println("uno.");
                break;
            case 2:
                System.out.println("dos.");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro.");
                break;
            case 5:
                System.out.println("cinco.");
                break;
            case 6:
                System.out.println("seis.");
                break;
            case 7:
                System.out.println("siete.");
                break;
            case 8:
                System.out.println("ocho.");
                break;
            case 9:
                System.out.println("nueve.");
                break;
            case 10:
                System.out.println("diez.");
                break;
            default:
                System.out.println("ERROR");
                break;




        }
        */
        //////////////////////////////////////SWITCH MODERNO///////////////////////////////////////////////////////////

        System.out.println("Introduce una nota entre 0 y 10.");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        String letra  = switch (nota){
            case 0 ->"cero.";
            case 1 ->"uno.";
            case 2 ->"dos.";
            case 3 ->"tres.";
            case 4 ->"cuatro.";
            case 5 ->"cinco.";
            case 6 ->"seis.";
            case 7 ->"siete.";
            case 8 ->"ocho.";
            case 9 ->"nueve.";
            case 10 ->"diez.";
            default -> "Error.";
        };
        System.out.printf("%s",letra);

    }
}
