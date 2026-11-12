////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        int i =0;
        while(num>0){
            i++;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.printf("%d números",i);
    }
}
