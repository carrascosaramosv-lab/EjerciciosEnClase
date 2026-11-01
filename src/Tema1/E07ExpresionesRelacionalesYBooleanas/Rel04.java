/////////////////////////////////////////////////////////////////////////////////
/*
Lee un número entero y muestra true si es positivo (mayor que 0).
 */
//////////////////////////////////////////////////////////////////////////////////




package Tema1.E07ExpresionesRelacionalesYBooleanas;
import java.util.Scanner;
public class Rel04 {

    public static void main(String[] args){
        System.out.println("INTRODUCE UN NÚMERO Y TE DIGO SI ES POSITIVO ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean a = num>0;
        System.out.println("¿El número introducido " + num + "es positivo?\n" + a);




    }
}
