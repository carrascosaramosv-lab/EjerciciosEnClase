/////////////////////////////////////////////////////////////////////////////////
    /*
    Lee un número entero y muestra true si es múltiplo de 5 y false si no lo es.
       */
//////////////////////////////////////////////////////////////////////////////////




package Tema1.E07ExpresionesRelacionalesYBooleanas;
import java.util.Scanner;

public class Rel03 {

    public static void main(String[] args){

        System.out.println("INTRODUCE UN NÚMERO PA VER SI ES MULTIPLO DE 5.");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         boolean a = num%5 ==0;

         System.out.printf("¿Es multiplo de 5 el número %02d,?\n %B ",num,a);


    }


}
