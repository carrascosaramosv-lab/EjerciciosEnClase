////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Muestra una cuenta atrás desde 10 hasta 1 y, al terminar, el mensaje «¡Despegue!».
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.WhileWHL;

public class Whl06 {
    public static void main(String[]args){

        int i =10;

        while(i>=0){
            System.out.println(i);
            i--;
        }
        System.out.println("¡Despegue!");

    }
}
