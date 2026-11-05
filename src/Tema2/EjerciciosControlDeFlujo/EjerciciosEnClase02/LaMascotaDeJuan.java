/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Las mascotas de Juan

Juan tiene a su cargo a dos perros, dos gatos y dos hurones, pero entre ellos se llevan fatal, es decir, los
perros odian a los hurones, los hurones  a los gatos y los gatos odian a los perros, para juan nos ha pedido que le
diseñemos un programa para que comparta el mismo tiempo entre ellos. Para ellos juan nos pidió que en base al tiempo
que pase con los perros, pasemos un poco menos con los gatos y un poco más con los hurones ya que son muy rebeldes, si
juan pasa más de 1h con los perros tendría que dedicarle el doble de tiempo a los hurones y la mitad a los gatos, pero
 si no supera la hora solo seria un tercio más y un tercio menos.

ENTRADA

Al programa le diremos el tiempo que juan pasa con los perros

SALIDA

El programa nos devolverá el tiempo que pasa con los hurones y con los gatos

ENTRADA DE PRUEBA

90

SALIDA DE PRUEBA

135 45
*/

package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class LaMascotaDeJuan {
    public static void main(String[]args){

        System.out.print("Cuanto tiempo has pasado con tu perro: ");
        Scanner sc = new Scanner(System.in);
        double perro = sc.nextDouble();
        if(perro>60){
            double hurones = perro + (perro * 0.5),
                    gatos = perro - (perro * 0.5 );
            System.out.printf("%.2f tiempo perro. \n%.2f tiempo hurones. \n%f.2 tiempo gatos. " ,perro,hurones,gatos);
        }else {
           double hurones = perro + (perro * 1/3),
                    gatos = perro - (perro * 1/3 );
            System.out.printf("%.1f tiempo perro. \n%.1f tiempo hurones. \n%.1f tiempo gatos. " ,perro,hurones,gatos);
        }
    }
}
