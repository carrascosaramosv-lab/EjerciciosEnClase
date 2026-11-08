/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Programa que lea dos números por teclado y muestre el resultado de la división del primero por
 el segundo. Ten en cuenta que el usuario podría indicar en el divisor un cero, con las
 consecuencias que eso acarrea
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;

public class Ifs09 {

      public static void main(String[]args){

          System.out.println("Introduce dos números para dividirlos el primero entre el segundo: ");
          Scanner sc = new Scanner(System.in);
          double num1 = sc.nextDouble(),
                  num2 = sc.nextDouble();

          if(num1!=0 && num2!=0){
              double total = num1/num2;
              System.out.printf("%.2f y %.2f ---> %.2f",num1,num2,total);
              }else {
              System.out.println("ERROR DE LOS DATOS INTRODUCIDOS");
          }

      }

}
