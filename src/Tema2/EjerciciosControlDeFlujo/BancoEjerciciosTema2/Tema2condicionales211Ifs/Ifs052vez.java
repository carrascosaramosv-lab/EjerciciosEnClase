/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee la edad de una persona y muestra si es mayor de edad (18 años o más).
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs052vez {
    public static void main(String[]args){

        System.out.print("Introduce la edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        if(edad>=0 && edad<18){
            System.out.printf("%d ---> menor de edad.",edad);
        }else if(edad>17 && edad<110){
            System.out.printf("%d ---> mayor de edad.",edad);
        }else {
            System.out.println("ERROR:Edad no bien introducida.");
        }



    }
}
