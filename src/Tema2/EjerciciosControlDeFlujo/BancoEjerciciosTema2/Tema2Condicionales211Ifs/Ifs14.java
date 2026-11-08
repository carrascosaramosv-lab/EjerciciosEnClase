/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que calcule el salario semanal de un trabajador a partir de las horas que
ha trabajado, teniendo en cuenta que las horas ordinarias (las 40 primeras horas de trabajo) se
pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora

 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs14 {
    public static void main(String[]args){
        /*
        final int SEGUNDOSENMINUTO = 60;
        final int SEGUNDOSENHORA = 3600;
        */

        final int PRECIONORMAL = 12;
        final int PRECIOEXTRA = 16;


        System.out.println("Introduce el número de horas trabajadas: ");
        Scanner sc = new Scanner(System.in);
        float horas = sc.nextFloat();
        /*
        int h = (int)horas;
        float m = ((horas%1)*SEGUNDOSENMINUTO),
                //m = ((((int)horas-horas)*SEGUNDOSENHORA)/60);
            s = (m%1)*SEGUNDOSENMINUTO;

        System.out.println(h+ "horas," + (int)m + "min," + (int)s + "seg");
         NO SÉ PORQUE HE HECHO ESTO, NO ES NECESARIO.*/

        float horasExtras = horas - 40,
              totalSinExtra = horas*PRECIONORMAL,
              totalConExtra = ((horas - horasExtras)*PRECIONORMAL)+(horasExtras*PRECIOEXTRA);

        if(horasExtras<=0){

            System.out.printf("%.2f horas --> %.2f€",horas,totalSinExtra);

        }else {
            System.out.printf("%.2f horas --> %.2f€",horas,totalConExtra);
        }










    }
}
