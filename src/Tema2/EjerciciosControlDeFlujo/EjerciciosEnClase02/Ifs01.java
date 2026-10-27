/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Declara una variable B de tipo entero y asígnale un valor. A continuación muestra un mensaje
 indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo.


 */
/////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ifs01 {
    public static void main(String []args){
        System.out.print("Escribe un numero para decirte si es positivo o negativo");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.printf("El número %02d es negativo",num);
        } else {
            System.out.printf("El número %02d es positivo",num);
        }


    }
}
