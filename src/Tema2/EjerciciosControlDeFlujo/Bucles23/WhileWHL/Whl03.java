////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;

public class Whl03 {
    public static void main(String[]args){
        int i=0;
        while (i<=100) {
            if (i % 5 == 0){
                System.out.println(i);
            }
         i++;
        }

    }
}
