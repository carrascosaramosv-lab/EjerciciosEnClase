///////////////////////////////////////////////////////
/*Escribe un programa que sume, reste, multiplique y
divida dos números introducidos por teclado. */
///////////////////////////////////////////////////////

package EjerciciosParaPracticar.Ejercicios_ExpresionesYOperadores.Ejercicios_de_Programacion_Expresiones_Y_Operadores; //uso este paquete.
import java.util.Scanner; //importo la clase Scanner.
    public class Ejercicio6 { //creo una clase pública llamada "Ejercicio6";

             public static void main(String[]args){
             //Entrada principal del programa.




        System.out.println("                                                          ***");
        System.out.println("                                                       *********");
        System.out.println("                                                    ***************");
        System.out.println("                                                 *********************");
        System.out.println("                                              ***************************");
        System.out.println("                                           *********************************");
        System.out.println("                                        ***********CALCULADORA BASICA***********");
        System.out.println("                                        *              0-SALIDA                *      ");
        System.out.println("                                       **              1-SUMAR                 **     ");
        System.out.println("                                      ***              2-RESTAR                ***    ");
        System.out.println("                                       **              3-MULTIPLICAR           **     ");
        System.out.println("                                        *              4-DIVIDIR               *      ");
        System.out.println("                                        ****************************************");
        System.out.println("                                           *********************************");
        System.out.println("                                              ***************************");
        System.out.println("                                                 *********************");
        System.out.println("                                                    ***************");
        System.out.println("                                                       *********");
        System.out.println("                                                          ***");



        //pido por texto con System.out.println.

        Scanner teclado = new Scanner(System.in); //Creo el objeto.
        int num0 = teclado.nextInt(); //Estoy declarando la variable que va a pedir por teclado cuando elija en el menu.

        /* if (num0==0) { //estoy haciendo un bucle if para cuando elige la opción 0.
            System.out.println("SALIENDO...");
            System.out.println("¡ADIOS!");
            System.exit(0); //Esto detiene el programa por completo.
            else
            */


        switch (num0){

            case 0:
                System.exit(0);
            break;
            case 1:
                float num1 = teclado.nextFloat();  //Estoy declarando la primera variable que va a pedir por teclado.
                float num2 = teclado.nextFloat();  //Estoy declarando la segunda variable que va a pedir por teclado.
                System.out.println("Escribe los dos números que quieras sumar.");
                float sum = num1+num2;
                System.out.print("El resultado de la suma es: " + sum);
                break;
            case 2:
                System.out.print("Escribe los dos números que quieras restar.");
                float res = num1-num2;
                System.out.print("El resultado de la resta es: " + res);
                break;
            case 3:
                System.out.print("Escribe los dos números que quieras multiplicar.");
                float mul = num1*num2;
                System.out.print("El resultado de la resta es: " + mul);
                break;
            case 4:
                System.out.print("Escribe los dos números que quieras multiplicar.");
                float div = num1/num2;
                System.out.print("El resultado de la resta es: " + div);
                break;

        }




        }







    }




