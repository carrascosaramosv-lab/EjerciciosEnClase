/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Una tienda ofrece un descuento del 15 % sobre el total de la compra durante el mes de octubre. Dado
un mes (número del 1 al 12) y un importe, calcula la cantidad que se debe cobrar al cliente.

 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs11 {
    public static void main(String[]args){

        final  double REBAJA = 0.85;

        System.out.print("Introduce el mes en número de la compra y el importe de dicha cuenta: ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        double importe = sc.nextInt();

        if(mes==10){
           double descuento = (importe*REBAJA);
            System.out.printf("El importe a pagar en el mes de Octubre es de %.2f€ despues de aplicar \nun descuento " +
                    "del 15%% a tu importe inicial sin descuento de %.2f€ ",descuento,importe);/*con printf para poner %
                      y que se vea tal cual hay que poner dos seguidos %% */
        }else {
            System.out.printf("Tu importe ha pagar es de %.2f€",importe);
        }




    }
}
