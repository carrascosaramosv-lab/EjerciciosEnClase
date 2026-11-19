package Tema2.EjerciciosControlDeFlujo.Bucles23.EjericiciosEnClase;
import java.util.Scanner;
public class borrar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // El 'for' lee un número en cada vuelta y sigue mientras sea >= 0
        for (int numero = sc.nextInt(); numero >= 0; numero = sc.nextInt()) {

            if (numero == 0) {
                System.out.println("0 = 0");
            } else {
                int divisor = 1;
                // Calculamos el divisor usando 'for' sin inicialización
                for (; numero / divisor >= 10; divisor = divisor * 10) {
                }

                int suma = 0;

                // Extraemos dígitos reduciendo el divisor en cada vuelta
                for (; divisor > 0; divisor = divisor / 10) {
                    int digito = numero / divisor;
                    suma = suma + digito;

                    System.out.print(digito);

                    if (divisor > 1) {
                        System.out.print(" + ");
                    }

                    numero = numero % divisor;
                }

                System.out.println(" = " + suma);
            }
        }

        sc.close();
    }
}

