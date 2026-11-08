/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que solicite al usuario ingresar un número entero positivo de
exactamente 4 dígitos. Luego, el programa debe calcular la suma de todos los dígitos cuyo valor sea impar.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs16 {
    public static void main(String[]args){

        System.out.println("Ingresa un número entero positivo de exactamente 4 dígitos");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // CONSTANTES
       final int MILLAR = 1000;
       final int CENTENAS = 100;
       final int DECENAS = 10;


        //SEPARAMOS LAS CIFRAS

        int unidadesDeMillar = num/MILLAR,
                unidadesDeCentenas = (num%MILLAR)/CENTENAS,
                unidadesDeDecenas = ((num%MILLAR)%CENTENAS)/DECENAS,
                unidades = ((num%MILLAR)%CENTENAS)%DECENAS;

         // System.out.println(unidadesDeMillar+"m"+unidadesDeCentenas+"c"+unidadesDeDecenas+"d"+unidades);
         // el sout de arriba es para comprar que estoy separando bien.


        //declaro variables antes de los condicionales para que se se mantengan despues de los if.
        int impar1 = 0,
            impar2 = 0,
            impar3 = 0,
            impar4 = 0;

        //ya comprueba cada una de las cifras si son impares
        if(unidadesDeMillar%2!=0){
            impar1=unidadesDeMillar;
        }

        if(unidadesDeCentenas%2!=0){
            impar2=unidadesDeCentenas;
        }

        if(unidadesDeDecenas%2!=0){
            impar3=unidadesDeDecenas;
        }

        if(unidades%2!=0){
            impar4=unidades;
        }
        int imparTotal = impar1+impar2+impar3+impar4;
        System.out.printf("%d ---> %d (%d+%d+%d+%d)",num,imparTotal,impar1,impar2,impar3,impar4);


    }
}
