///////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Rubén está enganchado a un juego en el que hay 2 tipos de monedas con las que comprar mejoras, monedas
gratuitas y monedas premium. Las gratuitas se consiguen jugando partidas, mientras que las premium se
pueden conseguir pagando o cambiando las monedas gratuitas por monedas premium. A Rubén le interesan
 estas últimas monedas para comprar los mejores equipos, pero no le gusta la idea de pagar dinero, así
 que decide cambiar sus monedas gratuitas por monedas premium.

Para tener 1 moneda premium debes emplear 100 monedas gratuitas, pero esto no es todo, ya que cada 10
cambios de ese tipo que haga, le cobrarán 50 monedas gratuitas. La cuestión es que Rubén se ha encontrado
con que a veces, cuando tiene 1000 monedas exactas y trata de hacer un cambio el juego le da sólo 9 monedas
premium y 50 monedas gratuitas, para evitar perder su 'comisión'. Es por esto que necesita un programa para
saber cuándo obtendrá las monedas esperadas o cuando el juego se cobrará la comisión por adelantado, perdiendo
 en la operación monedas.

Entrada
Se introducirá un número entero con las monedas gratis disponibles.

Salida
Se mostrarán 2 números enteros, uno indicando cuántas monedas premium se consiguieron, y el otro las monedas gratis que sobraron.

Entradas de Prueba
1500
1
720
1000

Salidas de prueba
14 50
0 1
7 20
9 50


*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema1.A00EjerciciosParaHacerEnClase;
import java.util.Scanner;

public class DeseosGamer {
    public static void main(String[]args){

        System.out.println("¿cuantas monedas te dare? \nIngresa el número de monedas que quieres cambiar: ");
        Scanner teclado = new Scanner(System.in);
        int monedasIngresadas = teclado.nextInt(),
            /*monedasPremium = monedasIngresadas/100,
            monedasGratis = monedasIngresadas%100,
            comision = monedasIngresadas-50,
            premiumComision = comision/100,
            gratisComision = comision%100;  ESTO ES LO QUE ESTABA HACIENDO PARA PONER 10 LLAMADA PARA A LA DECIMA LLAMADA
            COBRAR COMISION PERO LUEGO HE ENTENDIDO QUE NO CUENTA COMO UN CAMBIO CADA VEZ QUE TE DA UNA MONEDA PRECION,
            CADA VEZ QUE HACE 1 MONEDA PREMIUM ES 100 GRATIS ES UN CAMBIO, ES DECIR CADA 1000 MONEDAS GRATIS SE COBRA COMISIÓN,
            NO ES CADA DE VEZ QUE REALICE UN CAMBIO DE X MONEDAS COMO PENSABA
           */

            comisionVeces = monedasIngresadas/1000,
            comision = comisionVeces*50,
            comisionCobrada = monedasIngresadas-comision,
            monedasPremium = comisionCobrada/100,
            monedasGratis = comisionCobrada%100;
            //COMO BUENA PRACTICA DECLARAR CONSTANTES

        System.out.printf("Tus monedas con la cantidad ingresada será: %02d de monedas premium y %02d de monedas gratis",monedasPremium,monedasGratis);






    }
}
