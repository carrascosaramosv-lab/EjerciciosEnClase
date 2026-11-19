////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir
los datos cuando meta un número negativo.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;
import java.util.Scanner;
public class Whl12 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        double num= sc.nextInt(),
             i = 0,
             j = 0;


        while(num>0){
            i+=num;
            System.out.println("Introduce un número: ");
            num=sc.nextInt();
            j++;

        }
       double x = i/j;
        System.out.printf("La media de los números positivos es %.2f",x);
    }

    public static class SanFermin {
        public static void main(String[]args){

            final int velocidadMaxToro=109;
            System.out.println("¿Cuantos toros participan?");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int maximo=0;
            String velocidades="";
            System.out.println("¿Cuantos toros hay?");
            for(int i =1;i<=n;i++){

                int velocidadToro = sc.nextInt();
                velocidades +=velocidadToro+" \n";
                if (velocidadToro<=velocidadMaxToro && velocidadToro>0){
                    if (velocidadToro>maximo) {
                        maximo = velocidadToro;
                    }
                }else {
                    System.out.println("ERROR: Velocidad introducida errónea.");
                }


            }
            System.out.println(velocidades);
            System.out.printf("la velocidad a la que debe ir los corredores es %d",maximo);
         sc.close();
            //patron 7 maximo y minimo

        }
    }
}
