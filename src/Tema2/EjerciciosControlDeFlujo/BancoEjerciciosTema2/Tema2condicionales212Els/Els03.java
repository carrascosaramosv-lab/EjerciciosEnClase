/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Realiza un programa que pida una hora por teclado y que muestre luego buenos
 días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de
  13 a 20 y de 21 a 5, respectivamente. Solo se tienen en cuenta las horas; los minutos no
  se deben introducir por teclado.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales212Els;
import java.util.Scanner;
public class Els03 {
    public static void main(String[]args){


        System.out.print("Introduce la hora que es (¡solo la hora,los minutos y segundos no!): ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();

        if(hora>=6 && hora<=12){
            System.out.printf("%d ---> ¡Buenos días!",hora);
        }else if(hora>12 && hora<=20){
            System.out.printf("%d ---> ¡Buenas tardes!",hora);
        }else if(hora>20 && hora<24 || hora<6 && hora>=0){
            System.out.printf("%d ---> ¡Buenas noches!",hora);
        }else {
            System.out.println("ERROR:Hora introducida no válida.");
        }


    }
}
