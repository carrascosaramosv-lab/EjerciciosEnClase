//////////////////////////////////////////////////////////////////////////////////
/* Álvaro busca conocer el cambio en metálico de un pago, este deberá ser dado de
la forma más exacta posible, por lo que se indicará la cantidad exacta del cambio
 a devolver en céntimos, este se introducirá en el programa y devolverá el valor
  en billetes y monedas.

Entrada.

Se introduce un número entero positivo que represente el cambio a dar al cliente.

Salida.

El programa dará los billetes de 50, 20, 10 y 5€; como las monedas de 2€, 1€, 50, 20, 10, 5 y 1 céntimos

Entrada de prueba.

8886

Salida de prueba.

1 billete de 50€
1 billete de 20€
1 billete de 10€
1 billete de 5€
1 moneda de 2€
1 moneda de 1€
1 moneda de 50 cent
1 moneda de 20 cent
1 moneda de 10 cent
1 moneda de 5 cent
0 moneda de 2 cent
1 moneda de 1 cent. */
//////////////////////////////////////////////////////////////////////////////////


package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.EjerciciosParaHacerEnClase;
import java.util.Scanner;
public class EnCambioLaVuelta {
    public static void main(String[] args){

        System.out.print("Dime la cantidad de € en centimos y te muestro la forma mas exacta de tenerlo: ");
        Scanner teclado = new Scanner(System.in);
        int centimosIniciales = teclado.nextInt();

        int eurosTotales = centimosIniciales/100,
            billetes50 = eurosTotales/5000,
            billetes20 = (eurosTotales%50)/2000,
            billetes10 = (eurosTotales%50)%2000,
            billetes5 = billetes10%500;




        System.out.printf("billetes: \n%02d BILLETES 50\n%02d BILLETES DE 20\n%02d BILLETES DE 10",billetes50,billetes20,billetes10);




    }
}
