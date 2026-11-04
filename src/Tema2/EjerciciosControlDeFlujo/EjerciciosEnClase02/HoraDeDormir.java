///////////////////////////////////////////////////////////////////////////////////////////////
/*
Hora de dormir

Daniel, tras verse obligado a asistir a clase después de su confinamiento, ha
decidido crear una calculadora para saber a qué hora debería irse a dormir durante la
semana. Él debe madrugar mucho a diario para ir a clase y se ha dado cuenta que dormir bien
es muy importante para resolver los problemas a los que debe enfrentarse en programación. Tras
una rápida búsqueda en Google, ha decidido que las horas de sueño óptimas serán 8.

Teniendo en cuenta que vive en España y no en Nueva Zelanda, realiza un programa que, tras
 introducir la hora y los minutos con los que configurará su alarma, devuelva la hora mínima
 a la que debería estar dormido.

Entrada de prueba

6 45
7 00
9 30

Salida de prueba

22:45
23:00
01:30

 */
///////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class HoraDeDormir {
    public static void main(String[]args){
        final int MINUTOSHORA = 60;


                Scanner scanner = new Scanner(System.in);

        int horaAlarma = scanner.nextInt();
        int minutoAlarma = scanner.nextInt();

        // Restamos 8 horas
        int horaDormir = horaAlarma - 8;

        // Truco matemático sin condicionales:
        // Si horaDormir es positivo (ej. 9 - 8 = 1), (1 + 24) % 24 = 1.
        // Si horaDormir es negativo (ej. 6 - 8 = -2), (-2 + 24) % 24 = 22.
        // El truco de sumar 24 antes del módulo garantiza que siempre funcione con números negativos en Java.
        horaDormir = (horaDormir + 24) % 24;

        // Para formatear a dos dígitos sin usar condicionales, sumamos un "0"
        // y cogemos los últimos 2 caracteres de la cadena resultante.
        String horaStr = ("0" + horaDormir);
        horaStr = horaStr.substring(horaStr.length() - 2);

        String minutoStr = ("0" + minutoAlarma);
        minutoStr = minutoStr.substring(minutoStr.length() - 2);

        System.out.println(horaStr + ":" + minutoStr);

        scanner.close();





    }
}
