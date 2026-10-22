package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.A00EjerciciosParaHacerEnClase; ////////////////////////////////////////////////////////////////////
/*  emos terminado el tema 1, os propongo "Ejercicios para pensar".
IntelYGentes

Imagina que estás estudiando para ser técnico superior de desarrollo de aplicaciones multiplataforma.
 Pero dado que estás viendo que son muchas horas sobrepasando los problemas expuestos en la clase
 de programación y ya te sale humo de la cabeza, has decidido abandonar y montar tu propio grupo de Rock.
 Pero como no tienes ningún instrumento, vas a tener que ir a comprarlos a la tienda más cercana. Dicha tienda
  ofrece guitarras, baterías y teclados con descuento. Por supuesto, el grupo se llamará" Intel y gentes".

El precio de la guitarra es de 500€ a lo que se aplicará un 30% de descuento.

El precio de la batería es de 100€ a lo que se aplicará un 15% de descuento.

El precio del teclado es de 200€ a lo que se aplicará un 20% de descuento.

Elaborar un programa que estime el precio que te va a costar en total los instrumentos elegidos.

ENTRADA

La entrada consta de 3 líneas en las que se introduce el número de cada instrumento deseado

SALIDA

El programa terminará mostrando el precio total a pagar por todos los instrumentos

ENTRADA DE PRUEBA

3
5
6

SALIDA DE PRUEBA

15050€ */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class IntelYGentes {
    public static void main(String[]args){
        System.out.print("Dime cuantas baterias: ");
        Scanner teclado = new Scanner(System.in);
        double num1 = teclado.nextDouble();
        double bateria = num1*100*0.85;

        System.out.print("Dime cuantas guitarras: ");
        double num2 = teclado.nextDouble();
        double guitarras = num2*500*0.7;


        System.out.print("Dime cuantos teclados: ");
        double num3 = teclado.nextDouble();
        double pianos = num3*200*0.8;

        double total = bateria + pianos +guitarras;

        System.out.println("El total son : " + total + "€");


    }

}
