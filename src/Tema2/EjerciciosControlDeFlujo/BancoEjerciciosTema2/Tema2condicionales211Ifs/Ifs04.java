//////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir dos caracteres y decir si son iguales.
 */
//////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs04 {
    public static void main(String[] args){

        System.out.print("Introduce dos caracteres y te digo si son iguales: ");
        Scanner sc = new Scanner(System.in);
        String letra1 = sc.nextLine();
        String letra2 = sc.nextLine();
        if(letra1.equalsIgnoreCase(letra2)){ /*como lo que comparo son dos letras no puedo usar ==, entonces uso equal()
         y comparo las dos, pero para que no haga distinciones entre mayúscula y minúscula pongo equals.IgnoreCase()*/
            System.out.printf("%s y %s ---> iguales",letra1,letra2);
        }else{
            System.out.printf("%s y %s ---> distintos",letra1,letra2);
        }

    }

}
