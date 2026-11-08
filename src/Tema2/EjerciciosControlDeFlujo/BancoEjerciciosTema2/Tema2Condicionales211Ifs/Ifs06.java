/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee la nota de un examen (de 0 a 10) y muestra «Aprobado» si es 5 o más y «Suspenso» en caso contrario.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs06 {

    public static void main (String[]args){

        System.out.print("Escribe la nota que tienes el examen para ver si estas aprobado o suspenso: ");
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();
        if(nota%1==0){

            if(nota>=5) {
                System.out.printf("%d ---> Aprobado.",(int)nota);

            }else {
                System.out.printf("%d ---> Suspenso.",(int)nota);
            }



        }else if(nota>=5) {
          System.out.printf("%.1f ---> Aprobado.",nota);

        }else {
            System.out.printf("%.1f ---> Suspenso.",nota);
        }








    }





}
