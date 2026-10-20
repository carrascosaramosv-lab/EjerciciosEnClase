////////////////////////////////////////////////////////////
/* Perímetro de un rectángulo (nivel noob)

El perímetro de un polígono es la suma de la longitud de todos sus lados. ¿Eres capaz de calcular el perímetro de un rectángulo?
Entrada

La entrada consta de dos números enteros que indican el ancho y el alto del rectángulo. Se garantiza que la longitud de un lado será un número entero que no superará 108.
Salida

Para cada caso de prueba se escribirá, en una línea independiente, el perímetro del rectángulo.
Entrada de ejemplo

3 2
5 4
Salida de ejemplo

10
18  */
////////////////////////////////////////////////////////////




package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.EjerciciosParaHacerEnClase;
import java.util.Scanner;
public class PerimetroRectangulo {

    public static void main(String[]args){
        System.out.print("Introduce el alto y el ancho del rectangulo: ");
        Scanner teclado = new Scanner(System.in);
        double altura_rec = teclado.nextInt(),
                anchura_rec = teclado.nextInt();
        double perimetro_rec = (altura_rec+anchura_rec)*2;
        System.out.print("El perimetro del rectángulo es: " +perimetro_rec);






    }



}
