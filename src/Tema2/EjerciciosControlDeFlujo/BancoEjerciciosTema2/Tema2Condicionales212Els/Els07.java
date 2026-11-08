///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
Calcular el mayor de tres números enteros.
 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els07 {
    public static void main(String[]args){

        System.out.printf("Introduce 3 números: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if (num1>num2 && num1>num3){
            System.out.printf("El número mayor es %d",num1);
        }else if (num2>num2 && num2>num3){
            System.out.printf("El número mayor es %d",num2);
        }else System.out.printf("El número mayor es %d",num3);


    }
}
