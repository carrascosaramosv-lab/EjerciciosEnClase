/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee la edad de una persona y muestra su etapa: niño (de 0 a 11 años), adolescente (de 12 a 17), adulto
 (de 18 a 64) o jubilado (65 o más).
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els05 {
    public static void main(String[]args){

        System.out.print("Introduce la edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        if(edad>=0 && edad<12){
            System.out.printf("%d ---> Niño.",edad);
        } else if (edad>11 && edad<18) {
            System.out.printf("%d ---> Adolescente.",edad);
        } else if (edad>17 && edad<65) {
            System.out.printf("%d ---> Adulto.",edad);
        } else if (edad>64) {
            System.out.printf("%d ---> Jubilado.",edad);

        }

    }
}
