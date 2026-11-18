////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Crea un programa donde muestre un menú.Las opciones son las siguientes:
    1-Sumar
    2-Restar
    3-Multiplicar
    4-Dividir
    5-Salir
    Si elige 0 deberá mostrar una despedida y terminar el programa.
    Si se elige una opción no contemplada se deberá indicar.
    En cualquier otro caso se solicitará dos números, se efectuara la operacion correspondiente y se mostrará
    el resultado hasta que el usuario pulse ENTER, momento en el que se volvera a mostrar el menu inicial.

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.EjericiciosEnClase;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[]args){
        int opcion;
        do {
            System.out.println("                                                          ***");
            System.out.println("                                                       *********");
            System.out.println("                                                    ***************");
            System.out.println("                                                 *********************");
            System.out.println("                                              ***************************");
            System.out.println("                                           *********************************");
            System.out.println("                                        ***********CALCULADORA BASICA***********");
            System.out.println("                                       **              1-SUMAR                 **     ");
            System.out.println("                                      ***              2-RESTAR                ***    ");
            System.out.println("                                       **              3-MULTIPLICAR           **     ");
            System.out.println("                                        *              4-DIVIDIR               *      ");
            System.out.println("                                        *              5-SALIDA                *      ");
            System.out.println("                                        ****************************************");
            System.out.println("                                           *********************************");
            System.out.println("                                              ***************************");
            System.out.println("                                                 *********************");
            System.out.println("                                                    ***************");
            System.out.println("                                                       *********");
            System.out.println("                                                          ***");


            Scanner sc = new Scanner(System.in);
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            if (opcion!=5) {
                int num1, num2, res;
                double res1;
                System.out.print("Introduce un número para operar: ");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo número para operar: ");
                num2 = sc.nextInt();


                switch (opcion) {
                    case 1:
                        res = num1 + num2;
                        System.out.printf("%d + %d = %d", num1, num2, res);
                        break;
                    case 2:
                        res = num1 - num2;
                        System.out.printf("%d - %d = %d", num1, num2, res);
                        break;
                    case 3:
                        res = num1 * num2;
                        System.out.printf("%d x %d = %d", num1, num2, res);
                        break;
                    case 4:
                        if(num2!=0) {
                            res1 = (double) num1 / num2;
                            System.out.printf("%d / %d = %.2f", num1, num2, res1);
                        }else {
                            System.out.println("No se puede dividir entre 0 ERROR.");

                        }
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("ERROR.");

                }
            }else {
                System.out.println("ERROR.");

            }


        }while(opcion!=5);


    }
}
