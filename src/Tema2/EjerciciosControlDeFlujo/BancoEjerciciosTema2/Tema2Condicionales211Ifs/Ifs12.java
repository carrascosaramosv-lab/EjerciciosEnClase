/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Programa que lea tres números enteros H, M, S, que contienen hora, minutos y segundos
respectivamente, y comprueba si la hora que indican es una hora válida (horas de 0 a 23, minutos
y segundos de 0 a 59).

 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs12 {
    public static void main(String[]args){

            System.out.println("INTRODUZCA LA HORA hh mm ss en ese formato:");
             Scanner sc = new Scanner(System.in);
             int h = sc.nextInt(),
                 m = sc.nextInt(),
                 s = sc.nextInt();

                    if (h<24 && h>=0 && m<60 && m>=0 && s<60 && s>=0 ){
                          System.out.println("válida.");
                    }else {
                           System.out.println("no válida.");
                    }

    }



}






