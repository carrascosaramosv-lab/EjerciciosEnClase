/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Lee la temperatura en grados y muestra «Frío» si es menor de 10, «Templado» si está entre 10 y 25
(ambos incluidos) y «Calor» si es mayor de 25.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////





package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els04 {
    public static void main(String[]args){

        System.out.print("Introduce cuantos grados hace de temperatura: ");
        Scanner sc = new Scanner(System.in);
        int grados = sc.nextInt();

        if(grados<10){
            System.out.printf("%d ---> Frío.",grados);
        }else if(grados>25){
            System.out.printf("%d ---> Calor.",grados);
        }else {
            System.out.printf("%d ---> Templado.",grados);
        }



    }

}
