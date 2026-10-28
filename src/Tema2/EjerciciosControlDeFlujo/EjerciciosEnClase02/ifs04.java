//////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir dos caracteres y decir si son iguales.
 */
//////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class ifs04 {
    public static void main(String[] args){

        System.out.print("Introduce dos caracteres y te digo si son iguales: ");
        Scanner sc = new Scanner(System.in);
        String letra1 = sc.nextLine();
        String letra2 = sc.nextLine();
        if(letra1==letra2){
            System.out.printf("");
        }

    }

}
