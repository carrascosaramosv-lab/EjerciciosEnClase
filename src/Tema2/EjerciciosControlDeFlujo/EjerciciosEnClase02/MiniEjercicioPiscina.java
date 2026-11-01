package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class MiniEjercicioPiscina {

    public static void main(String[] args){

        System.out.print("Dime tu edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        if(edad<=12){
            System.out.println("Eres infantil");
        }else if(edad>12 && edad<65){
            System.out.print("Eres adulto");
        } else {
            System.out.print("Eres un jubilado");
        }




    }



}
