////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un año y un mes (de 1 a 12) y muestra cuántos días tiene ese mes teniendo en cuenta los años
bisiestos (febrero tiene 29 días en los años bisiestos).
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales213Swi;
import java.util.Scanner;
public class Swi15 {
    public static void main(String[]args){

        System.out.print("Introduce un mes: ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();

        if (anio%4==0 && anio%100!=0 || anio%400==0 && anio%100==0){

            int bisiesto = switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 29;
                case 4, 6, 9, 11 -> 30;
                default -> {
                    System.out.println("Error, mes inexistente.");
                    yield 0;
            }


            };
            if (bisiesto==0){

            }else {System.out.printf("%d",bisiesto);}
        }else{
            int noBisiesto = switch (mes){
                case 1,3,5,7,8,10,12 ->31;
                case 2 ->28;
                case 4,6,9,11 ->30;
                default -> {
                    System.out.println("Error, mes inexistente.");
                    yield 0;

                }

            };
            if (noBisiesto==0){

            }else{System.out.printf("%d",noBisiesto);}

        }


    }
}
