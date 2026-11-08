/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir dos números y decir cuál es el mayor o si son iguales.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els01 {
    public static void main(String[]args){

        System.out.print("Introduce dos números: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(),
                num2 = sc.nextInt();
        if(num1>num2){
            System.out.printf("%d y %d --> el mayor es %d.",num1,num2,num1);
        }else if(num1==num2) {
            System.out.printf("%d y %d --> son iguales.",num1,num2);
        }else {
            System.out.printf("%d y %d --> el mayor es %d.",num1,num2,num2);
        }


    }
}
