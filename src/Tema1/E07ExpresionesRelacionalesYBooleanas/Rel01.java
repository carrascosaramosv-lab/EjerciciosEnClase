/////////////////////////////////////////////////////////////////////////////////////
/*
Lee dos números enteros y muestra true si el primero es mayor que el segundo y false en caso contrario.
 */
/////////////////////////////////////////////////////////////////////////////////////


package Tema1.E07ExpresionesRelacionalesYBooleanas;
import java.util.Scanner;
public class Rel01 {
    public static void main(String[]args){

        System.out.println("Introduce dos números: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt();

        boolean c=a<b,
                d=a>b;
        System.out.printf("%02d<%02d ---> %B\n %02d<%02d ---> %B ",a,b,c,b,a,d);

    }

}
