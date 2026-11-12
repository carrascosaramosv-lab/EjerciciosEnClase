////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee números enteros hasta que se introduzca un 0 y muestra la suma de todos ellos.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl09 {
    public static void main(String[]args){

        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum=0;
        while(i!=0){
           sum+=i;
            System.out.println("El numero es: "+sum);
            i =sc.nextInt();
        }
        System.out.println("FIN");

    }
}
