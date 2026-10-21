////////////////////////////////////////////////////////////////////////////
/*Tarta de manzana, moras y crema (nivel sencillo)


        Alfonso quiere hacer una receta que ha sacado de internet, tarta de
        manzana y moras con crema. Según la receta, por cada manzana que utilice
        necesita el doble de moras; además, el número total de tazas de crema
        será siempre la mitad del número total de frutas. Alfonso necesita saber
        cuántas moras y crema necesitará para hacer la tarta, sabiendo que tiene
        cierto número de manzanas. ¿Puedes ayudarlo?
        Entrada

        Constará de un solo número entero positivo pedido por pantalla que será el número de manzanas de las que dispone.
        Salida

        Mostrará el número de moras y de tazas de crema que se necesitan, por ese orden.
        Entradas de Prueba

        15
        4
        1
        Salidas de prueba

        30 22.5
        8 6
        2 1.5
*/
/////////////////////////////////////////////////////////////////////////////////


package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.EjerciciosParaHacerEnClase;
import java.util.Scanner;

public class TartaDeManzana {
    public static void main(String[] args){

        System.out.print("¿Cuantas manzanas quieres usar en la tarta de manzana?: ");
        Scanner teclado = new Scanner(System.in);
        int manzanas = teclado.nextInt(),
            moras = manzanas*2;
        double tazasCrema =(double) (manzanas+moras)/2;
        System.out.printf("Los ingredientes serian: \n%02d manzanas.\n%02d moras.\n%.2f tazas de crema.",manzanas,moras,tazasCrema);
        // con el tipo double pongo ½.2f porque f espara double y .2 es que quiero solo dos decimales.



    }


}
