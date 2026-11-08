/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee la nota de un examen (de 0 a 10) y muestra «Aprobado» si es 5 o más y «Suspenso» en caso contrario.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs062vez {
    public static void main(String[]args){

        System.out.print("Introduce la nota: ");
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();
        if(nota>=0 && nota<5){
            System.out.printf("%.2f ---> Suspenso.",nota);
        }else if(nota>=5 && nota<=10){
            System.out.printf("%.2f ---> Aprobado.",nota);
        }else {
            System.out.println("ERROR:La nota está mal introducida.");
        }



    }

}
