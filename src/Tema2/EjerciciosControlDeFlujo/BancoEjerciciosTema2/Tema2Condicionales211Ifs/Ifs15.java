/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Declara una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando
si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10
 y si es mayor o menor que 100. Consideraremos el 0 como positivo.

 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs15 {
    public static void main(String[]args){

        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        if(c>=0){
            System.out.print("positivo,");
        }else {
            System.out.print("negativo,");
        }

        if(c%2!=0){
            System.out.print("impar,");
        }else {
            System.out.print("par,");
        }

        if (c%5==0){
            System.out.print("múltiplo de 5,");
        }else {
            System.out.print("no múltiplo de 5,");
        }

        if (c%10==0){
            System.out.print("múltiplo de 10,");
        }else{
            System.out.print("no múltiplo de 10,");
        }

        if(c>100){
            System.out.println("mayor que 100.");

        }else if(c==100){
            System.out.println("igual que 100.");
        }else{
            System.out.println("menor que 100.");
        }

    }




}
