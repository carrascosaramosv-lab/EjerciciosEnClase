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

        //int eurosTotales = centimosIniciales/100;
        int resto50 = centimosIniciales%5000,
                resto20 = resto50%2000,
                resto10 = resto20%1000,
                resto5 = resto10%500,
                resto2 = resto5%200,
                resto1 = resto2%100,
                resto50c = resto1%50,
                resto20c = resto50c%20,
                resto10c = resto20c%10,
                resto5c = resto10c%5,
                resto2c = resto5c%2,
                billetes50 = centimosIniciales/5000,
                billetes20 = resto50/2000,
                billetes10 = resto20/1000,
                billetes5 = resto10/500,
                moneda2 = resto5/200,
                moneda1 = resto2/100,
                moneda50c = resto1/50,
                moneda20c = resto50c/20,
                moneda10c = resto20c/10,
                moneda5c = resto10c/5,
                moneda2c = resto5c/2,
                moneda1c = resto2c;

        //  moneda1c = (((((((((((centimosIniciales%5000)%2000)%1000)%500)%200)%100)%50)%20)%10)%5)%2)
        //ASÍ ES COMO ESTABA ASIGNANDO EL VALOR A LAS VARIABLES PERO EL ENTORNO ME HA RECOMENDADO USAR OTRAS VARIABLES AUXILIARES PARA QUE SE VEA MAS BONITO.



        System.out.printf("billetes: \n%02d BILLETES 50€\n%02d BILLETES DE 20€\n%02d BILLETES DE 10€\n%02d BILLETES DE 5€\n%02d MONEDAS DE 2€\n%02d MONEDAS DE 1€\n%02d MONEDAS DE 0.50€\n%02d MONEDAS DE 0.20€\n%02d MONEDAS DE 0.10€\n%02d MONEDAS DE 0.05€\n%02d MONEDAS DE 0.02€\n%02d MONEDAS DE 0.01€",billetes50,billetes20,billetes10,billetes5,moneda2,moneda1,moneda50c,moneda20c,moneda10c,moneda5c,moneda2c,moneda1c);




    }
}
