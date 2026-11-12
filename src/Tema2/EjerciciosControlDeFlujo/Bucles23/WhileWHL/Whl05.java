////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Muestra los números pares comprendidos entre 1 y 50 utilizando un bucle while.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;

public class Whl05 {
    public static void main(String[]args){
        int i=1;
        while (i<51){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
