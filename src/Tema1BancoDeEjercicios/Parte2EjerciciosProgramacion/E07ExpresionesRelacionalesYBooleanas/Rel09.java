/////////////////////////////////////////////////////////////////////////////////////
/*
Lee tres números enteros y muestra true si están ordenados
 de menor a mayor (puede haber valores iguales).
 */
/////////////////////////////////////////////////////////////////////////////////////



package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.E07ExpresionesRelacionalesYBooleanas;

import java.util.Scanner;

public class Rel09 {
    public static void main (String[] args){

        System.out.print("Introduce tres numeros y te digo si están ordenados de menor a mayor:  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean a1 = a<=b && b<=c && c>a;

        System.out.printf("%2d,%2d y %2d ---> %B",a,b,c,a1);


    }

}
