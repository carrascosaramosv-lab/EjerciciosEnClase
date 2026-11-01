/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir dos números y decir si uno es múltiplo del otro. Si alguno de los dos números es 0, muestra
un mensaje de error.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////





package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs08 {
    public static void main(String[]args){


        System.out.print("Introduce dos números y te digo si son múltiplos uno del otro: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(),
            num2 = sc.nextInt();


        if(num1!=0 && num2!=0) {
            if (num1 % num2 == 0 || num2%num1==0) {
                System.out.printf("%d y %d --->sí.", num1, num2);
            } else {
                System.out.printf("%d y %d --->no.", num1, num2);
            }

        }else{
            System.out.print("error.");
        }

    }
}
