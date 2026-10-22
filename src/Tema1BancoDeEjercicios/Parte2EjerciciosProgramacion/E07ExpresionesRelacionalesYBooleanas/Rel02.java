/////////////////////////////////////////////////////////////////////////////////////
/*
Lee un número entero y muestra true si es par y false si es impar.
 */
/////////////////////////////////////////////////////////////////////////////////////

package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.E07ExpresionesRelacionalesYBooleanas;

import java.util.Scanner;

public class Rel02 {

    public  static void main(String[] args){

       System.out.println("Introduce un númeor y te digo si es par o no");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean b= a%2 == 0;

        System.out.printf("%B",b);




    }
}
