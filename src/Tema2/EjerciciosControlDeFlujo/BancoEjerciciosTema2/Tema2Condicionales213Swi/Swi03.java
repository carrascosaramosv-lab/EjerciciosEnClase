////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora
 ese día. Usa el horario que quieras.
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales213Swi;
import java.io.BufferedReader;
import java.util.Locale;
import java.util.Scanner;
public class Swi03 {
    public static void main(String[]args){
        /*
        ///////////////////////////////////////////SWITCH CLASICO//////////////////////////////////////////////////////
        System.out.println("Escribe el día de la semana");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

         char inicial=dia.toLowerCase().charAt(0);   /* estoy haciendo que la entrada por teclado (dia) al ponerle
         .toLoweCase() estoy convirtiendo a minuscula y al poner .charAt(0) es que estoy eligiendo quedarme solo con
         la letra de la posicion 0 del String. *//*

        switch(inicial){
            case 'l':
                System.out.println("SSII");
                break;
            case 'm':
                if (dia.charAt(1)=='a'){
                    System.out.println("LMM");
                }else{
                    System.out.println("EED");
                } break;
            /*Aquí como martes y miercoles los dos empiezan por m, pues he usado un if para comparar la segunda letra
             para ver si es una a, de martes. *//*
            case 'j':
                System.out.println("BBDD");
                break;
            case 'v':
                System.out.println("IPE");
                break;
            default:
                System.out.println("Error.");
        }
        *//*
        ///////////////////////////////////////////SWITCH MODERNO//////////////////////////////////////////////////////
                System.out.println("Escribe el día de la semana");
                Scanner sc = new Scanner(System.in);
                String dia = sc.nextLine();
                dia = dia.toLowerCase();
                String inicial = switch(dia){
                    case "lunes"->"SSII";
                    case "martes"->"LMM";
                    case "miercoles"->"EED";
                    case "jueves"->"BBDD";
                    case "viernes"->"IPE";
                    default -> "Error.";
                };
        System.out.printf("%s",inicial);

        */
        //////////////////////////////////SWITCH MODERNO Y OPERADOR TERNARIO////////////////////////////////////////////
        System.out.println("Escribe el día de la semana");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

        char inicial=dia.toLowerCase().charAt(0);   /* estoy haciendo que la entrada por teclado (dia) al ponerle
         .toLoweCase() estoy convirtiendo a minuscula y al poner .charAt(0) es que estoy eligiendo quedarme solo con
         la letra de la posicion 0 del String. */

        switch(inicial){
            case 'l':
                System.out.println("SSII");
                break;
            case 'm':
               /* if (dia.charAt(1)=='a'){
                    System.out.println("LMM");
                }else{
                    System.out.println("EED");
                } break;
            /*Aquí como martes y miercoles los dos empiezan por m, pues he usado un operador ternario para comparar
            la segunda letra para ver si es una a, de martes. */
                String estado = (dia.charAt(1)=='a') ? "LMM" : "EED";
                System.out.printf("%s",estado);
                break;
            case 'j':
                System.out.println("BBDD");
                break;
            case 'v':
                System.out.println("IPE");
                break;
            default:
                System.out.println("Error.");
        }












    }


}
