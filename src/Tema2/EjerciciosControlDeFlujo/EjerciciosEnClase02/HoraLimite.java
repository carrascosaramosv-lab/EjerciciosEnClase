/////////////////////////////////////////////////////////////////////////////////////////////////////
/*Hora límite

Queremos saber si un camionero puede seguir conduciendo o tiene que descansar. Sabiendo que
 por ley puede conducir como máximo 56 horas por semana.


Entrada


Consta de 7 entradas, cada una de ella son las horas conducidas cada día.


Salida


Si el camionero puede descansar o puede seguir conduciendo.


Entrada de prueba


9 10 10 9 8 9 10


Salida de prueba


Debe descansar.
* */
/////////////////////////////////////////////////////////////////////////////////////////////////////








package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
import java.util.SequencedCollection;

public class HoraLimite {
    public static void main(String[]args){

        final int HORASMAXIMAS = 56;

        System.out.println("Introduce el numero de horas de cada dia.");
        System.out.print("LUNES: ");
        Scanner sc = new Scanner(System.in);
        int lunes = sc.nextInt();
        System.out.print("MARTES: ");
        int martes = sc.nextInt();
        System.out.print("MIÉRCOLES: ");
        int miercoles= sc.nextInt();
        System.out.print("JUEVES: ");
        int jueves = sc.nextInt();
        System.out.print("VIERNES: ");
        int viernes = sc.nextInt();
        System.out.print("SÁBADO: ");
        int sabado = sc.nextInt();
        System.out.print("DOMINGO: ");
        int domingo = sc.nextInt();


        int horasSemanales = lunes+martes+miercoles+jueves+viernes+sabado+domingo;
        if(horasSemanales>=HORASMAXIMAS){
            System.out.println("¡DESCANSA!");

        }else {
            int resto = HORASMAXIMAS - horasSemanales;
            System.out.printf("Puedes seguir conduciendo esta semana %d horas.",resto);
        }

    }
}
