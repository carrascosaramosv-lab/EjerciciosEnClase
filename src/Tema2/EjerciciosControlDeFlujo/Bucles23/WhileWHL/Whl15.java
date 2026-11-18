////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl15 {
    public static void main(String[]args){

        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),
            invertido = 0,
            numeroOriginal = num;
        while (num>0){
            int resto = num%10;
            invertido = (invertido*10)+resto;
            num/=10;

        }
        System.out.printf("El número %d al revés es %d. ",numeroOriginal,invertido);



    }
}
