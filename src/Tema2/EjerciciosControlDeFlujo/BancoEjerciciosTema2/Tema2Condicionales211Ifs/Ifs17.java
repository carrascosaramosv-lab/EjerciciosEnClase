/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Escribe un programa que solicite al usuario ingresar un número entero positivo de
exactamente 4 dígitos. Luego, el programa debe calcular la suma de todos los dígitos cuyo valor sea impar.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales211Ifs;
import java.util.Scanner;
public class Ifs17 {
    public static void main(String[]args){

        final int MILLAR = 1000;
        final int CENTENAS = 100;
        final int DECENAS = 10;
        final int UNIDADES = 1;



        System.out.println("Ingresa un número entero positivo de exactamente 4 dígitos ");
        Scanner sc = new Scanner(System.in);
        int numeroInical = sc.nextInt();

        int unidadesDeMillar = numeroInical/MILLAR,
                unidadesDeCentenas = (numeroInical%MILLAR)/CENTENAS,
                unidadesDeDecenas = ((numeroInical%MILLAR)%CENTENAS)/DECENAS,
                unidadesDeUnidades = ((numeroInical%MILLAR)%CENTENAS)%DECENAS;


        //System.out.println(unidadesDeMillar+"millar,"+unidadesDeCentenas+"centenas"+unidadesDeDecenas+"d"+unidadesDeUnidades);
        int par1 = 0, // declaro primero para que el valor que ganen en los if se mantenga fuera de ellos.
            par2 = 0,
            par3 = 0,
            par4 = 0,
            impar1 = 0,
            impar2 = 0,
            impar3 = 0,
            impar4 = 0;


        if(unidadesDeMillar%2==0){
            par1 = unidadesDeMillar;
        }else {
            impar1 = unidadesDeMillar;
        }


        if(unidadesDeCentenas%2==0){
             par2 = unidadesDeCentenas;
        }else {
             impar2 = unidadesDeCentenas;
        }


        if(unidadesDeDecenas%2==0){
             par3 = unidadesDeDecenas;
        }else {
             impar3 = unidadesDeDecenas;
        }

        if(unidadesDeUnidades%2==0){
             par4 = unidadesDeUnidades;
        }else {
             impar4 = unidadesDeUnidades;
        }

       int par = par1+par2+par3+par4;  //para que esta suma no me de fallo he tenido que declarar las variables antes de los if
       int impar = impar1+impar2+impar3+impar4;

        System.out.printf("%d ---> pares: %d · impares: %d.",numeroInical,par,impar);

    }

}
