////////////////////////////////////////////////////////////
/* Área de un rectángulo (nivel noob)

El área de un polígono es la cantidad de superficie que encierran
 sus lados. El área de un rectángulo es la multiplicación de la
  base por la altura. ¿Sabes calcularla?
Entrada

Cada caso de prueba contiene la definición de un rectángulo en
 una sola línea con cuatro números enteros no negativos menores
 o iguales que 10.000. Los dos primeros definen la posición del vértice
 inferior izquierdo del rectángulo y los dos siguientes la del vértice
 superior derecho.

area.png
Salida

Para cada caso de prueba se escribirá, en una línea independiente, el área del rectángulo dado.
Entrada de ejemplo

1 1 4 3
0 0 1 1
Salida de ejemplo

6
1 */
////////////////////////////////////////////////////////////




package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.EjerciciosParaHacerEnClase;
import java.util.Scanner;
public class AreaDelRectangulo {
    public static void main(String[]args){

       /* System.out.println("Dame la base y la altura del rectángulo");
        Scanner teclado = new Scanner(System.in);
        int base = teclado.nextInt(),
            altura = teclado.nextInt(),
            area = base*altura;
            */

        System.out.print("Dame las coordenadas del rectangulo y luego las otras coordenadas: ");
        Scanner teclado = new Scanner(System.in);
        short valorx1 = teclado.nextShort(),
              valory1 = teclado.nextShort(),
              valorx2 = teclado.nextShort(),
              valory2 = teclado.nextShort(),
              x = (short)(valorx2 - valorx1),
              y = (short)(valory2 - valory1);
        int   area = x*y;


        System.out.printf("El area del rectángulo es: %02d",area);


    }




}
