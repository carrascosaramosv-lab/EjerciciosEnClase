/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee un número entero y muestra si es positivo, negativo o cero.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els02 {
    public static void main(String[]args){

        System.out.print("Introduce un número: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num==0){
            System.out.printf("%d ---> cero.",num);
        }else if(num>0){
            System.out.printf("%d ---> positivo.",num);
        }else {
            System.out.printf("%d ---> negativo.",num);
        }



    }
}
