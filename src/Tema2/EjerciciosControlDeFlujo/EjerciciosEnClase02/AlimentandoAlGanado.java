////////////////////////////////////////////////////////////////////////////////////////
/*Alimentando al ganado
Ramón es un ganadero que cría vacas. En una parcela tiene vacas negras, y en otra parcela
vacas marrones. Para alimentarlas requiere un determinado número de kilos de pienso. Cada
vaca negra come la mitad de lo que come una vaca marrón. Ramón no sabe el número de vacas negras
 que tiene, pero sí el de vacas marrones. Sabe además que por cada vaca negra tiene 2 vacas
  marrones. Ramón se pregunta, dado un número de vacas marrones, cuántos kilos de pienso
   necesitará para alimentar a su ganado.

Entrada

La entrada estará compuesta por dos números enteros mayores que 0 y menores que 10000. El
 primero representará el número de vacas marrones que tiene Ramón y el segundo los kilos
 que come una vaca negra. Para evitar que Ramón tenga medias vacas, el número de vacas marrones
 deberá ser par, en caso contrario el programa dará como salida ANIMAL.

Salida

La salida estará compuesta por dos números, el primero de ellos nos dirá cuántas vacas tiene
en realidad Ramón en total, y el segundo el número de kilos de pienso que necesitará para
alimentarlas.

Entrada de prueba

10 2
6 1

Salida de Prueba

15 50
9 15




*/

////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class AlimentandoAlGanado {

    public static void main(String[]args){

        System.out.print("¿Introduce cuantas vacas marrones tienes?(tiene que ser un número par): ");
        Scanner sc = new Scanner(System.in);
        int vacasMarrones = sc.nextInt();
        System.out.println("¿Introduce el numero de kilos que come la vaca negra?: ");
        int kilosNegras = sc.nextInt();

        double vacasNegras = vacasMarrones*0.5;
        int vacasTotales = vacasMarrones+(int)vacasNegras,
                kilosMarron = kilosNegras*2,
                kilosTotales = (kilosMarron*vacasMarrones)+(kilosNegras*(int)vacasNegras);

        System.out.println(vacasTotales+ "vacas " + kilosTotales+"kg");





    }



}
