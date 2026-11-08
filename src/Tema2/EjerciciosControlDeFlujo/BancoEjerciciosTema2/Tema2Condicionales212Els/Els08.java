////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Algoritmo que dado un año, nos diga si es bisiesto o no. Un año es bisiesto bajo las siguientes condiciones: un
 año divisible entre 4 es bisiesto y no debe ser divisible entre 100; si un año es divisible entre 100 y además
 es divisible entre 400, también resulta bisiesto.
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els08 {
    public static void main(String[]args){

        System.out.println("Introduce el año: ");
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();

        if(anio%4==0 && anio%100!=0){

            System.out.printf("El año %d es bisiesto.",anio);
        }else if(anio%100==0 && anio%400==0){
            System.out.printf("El año %d es bisiesto.",anio);
        }else {
            System.out.printf("El año %d no es bisiesto.",anio);
        }

    }


}

