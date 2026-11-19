package Tema2.EjerciciosControlDeFlujo.Bucles23.EjericiciosEnClase;

import java.util.Scanner;

public class SanFermines {


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
