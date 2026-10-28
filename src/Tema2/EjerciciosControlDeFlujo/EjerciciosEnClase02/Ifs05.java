/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee la edad de una persona y muestra si es mayor de edad (18 años o más).
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class Ifs05 {
    public static void main (String[] args){


        System.out.print("Dime tu edad: ");

        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

         if(edad<17){
             System.out.printf("%2d ---> menor de edad",edad);
         }else {
             System.out.printf("%2d ---> mayor de edad",edad);
         }



    }
}
