/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Calcular las calificaciones de un alumno. La nota final se calcula según el siguiente
criterio: la parte práctica vale el 10 %; la parte de problemas vale el 50 % y la parte
teórica el 40 %. El algoritmo leerá el nombre del alumno y las tres notas (en el orden
práctica, problemas y teoría) y escribirá el resultado. Las notas deben estar entre 0 y 10; si
 no lo están, no imprimirá las notas y mostrará un mensaje de error.

 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs13 {
    public static void main(String[]args){

        final double VPRACTICA = 0.1;
        final double VPROBLEMA = 0.5;
        final double VTEORIA = 0.4;


        System.out.print("Introduzca el nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("Introduzca las siguientes notas en el siguiente orden: \n1ª.Nota de la parte practica. " +
                "\n2º.Nota de la parte de problemas. \n3º.Nota de la parte teórica.");

        double practica = sc.nextDouble(),
               problema = sc.nextDouble(),
               teoria = sc.nextDouble(),
                x = ((practica*VPRACTICA)+(problema*VPROBLEMA)+(teoria*VTEORIA));

                if(x<=10 && x>=0){
                    System.out.printf("%s, %.2f, %.2f y %.2f ---> %s: %.2f.",nombre,practica,problema,teoria,nombre,x);
                }else {
                    System.out.println("Error: notas fuera de rango.");
                }







    }
}
