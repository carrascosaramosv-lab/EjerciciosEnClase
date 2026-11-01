/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee dos números enteros y muestra el mayor de los dos. Si son iguales, muestra cualquiera de ellos.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////






package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs07 {
    public static void main(String[]args){

        System.out.print("Introduce dos números para ver cual es el mayor: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(),
            num2 = sc.nextInt();

        if(num1>=num2){
            System.out.printf("%d y %d --> %d.",num1,num2,num1);
        }else {
            System.out.printf("%d y %d --> %d.",num1,num2,num2);
        }






    }

}
