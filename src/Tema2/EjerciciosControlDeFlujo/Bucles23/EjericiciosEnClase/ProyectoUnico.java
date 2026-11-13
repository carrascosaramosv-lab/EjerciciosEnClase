////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Proyecto Único

Enunciado:

Trabajas en una empresa donde cada proyecto tiene un número de identificación. La mayoría de los proyectos
se realizan en pares, pero hay un proyecto que solo se realiza una vez. Encuentra el número de identificación
del proyecto único.

Entrada:

La primera línea contiene un entero 2n+1 (3 ≤ 2n+1 ≤ 10001), el número total de proyectos, donde todos menos
uno aparecen dos veces.
La segunda línea contiene 2n+1 enteros separados por espacios, que representan los números de identificación
de los proyectos.
Salida:

Imprime el número de identificación del proyecto único
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.Bucles23.EjericiciosEnClase;
import java.util.Scanner;
public class ProyectoUnico {
    public static void main(String[]args){
        System.out.println();
        System.out.println("Introduce el número total de proyectos: ");
        Scanner sc = new Scanner(System.in);
        int proyectosTotal = sc.nextInt();

        for (int i =0;((3 <= 2*proyectosTotal+1) && (2*proyectosTotal+1 <=10001));i++) {
            System.out.println("Introduce el numero de identificacion de los proyectos: ");
            int numProyecto= sc.nextInt();
            if (numProyecto<0){
                break;
            }

        }
    }
}
