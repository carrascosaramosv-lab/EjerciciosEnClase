////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Feria de ganado
Nuestro conocido ganadero Eufrasio está teniendo problemas de sobrepoblación en su granja, así que ha decidido
 acudir a la feria de ganado de Villa Abajo, en la que quiere vender sus pollos, cerdos y vacas. Eufrasio no sabe
  el número exacto de cada tipo de animal que posee, pero sí del total, y también el peso de cada uno de sus
  animales, aunque sin saber si es un cerdo, una vaca, una cabra, etc.

Para ayudarnos, Eufrasio ha hecho un estudio y ha llegado a la conclusión de que los pollos no pesan más de 10 kilos
ni menos de 1, sus cerdos pesan entre 50 y 90 kilos, y sus vacas entre 100 y 200 kilos. Cualquier peso fuera de estos
rangos se considera de otro animal.

Entrada

Cada caso de prueba constará inicialmente de un número, que indicará el número de animales que Eufrasio pretende
vender. Posteriormente, se indicarán los pesos de estos animales.

Salida

La salida indicará el número de cerdos, pollos y vacas que tiene Eufrasio y la cantidad de kilos que se venderán
de cada tipo de animal.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class FeriaGanado {
    public static void main(String[]args){


        System.out.println("¿Cuantos animales hay en total?");
        Scanner sc = new Scanner(System.in);
        int ntotal = sc.nextInt();
        System.out.println("¿Cuantos kg en total?");
            int kgTotal = sc.nextInt();
            int pollos=0,
                cerdos=0,
                vacas=0,
                kilosCerdos=0,
                kilosvacas=0,
                kilospollos=0;
            for(int i=0;i<=ntotal;i++) {

                if (kgTotal - 200 > 0 || kgTotal - 100 > 0) {
                    vacas++;
                    kilosvacas+=kgTotal;

            }else if(kgTotal-90>0 || kgTotal-50>0){
                cerdos++;
                kilosCerdos+=kgTotal;
            }else if (kgTotal-1>0 || kgTotal-10>0){
                pollos++;
                kilospollos+=kgTotal;
            }
        }
            System.out.printf("%d vacas   %d cerdos   %d pollos",vacas,cerdos,pollos);


            sc.close();
    }


}
