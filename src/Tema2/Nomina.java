/*
víctor quiere hacer un programa para saber si le han bien la nomina y para ello sabemos que victor cobra a 12,00€
la hora , su jornadas son de 8horas todo lo que sea mas de ese tiempo se considera hora extra y le pagan un 30%
mas la hora, también hay que tener en cuenta que de 22:00 a 6:00 de la mañana se considera hora nocturna que pagan
un 35% mas la hora, y si entre que sale de trabajar y vuelve a entrar no pasa 12horas le pagan una prima por no
descansar lo suficiente.Victor está una semana de mañanas otra de tarde y otra de noches y trabaja de 5 dias a la semana.
las horas extras solo se echan despues de tu 8 horas, nunca te harean entrar antes para hacer horas extras y que te vayas con tu turno.

 */

package Tema2;
import java.util.Scanner;
public class Nomina {
    public static void main(String[]args){
        System.out.println("TURNO DE ESTA SEMANA M/T/N : ");
        Scanner sc = new Scanner(System.in);
        String turno = sc.nextLine();
        System.out.println("Introduce el numero de horas ");
        int horas=sc.nextInt();

        final int PRECIOHORA=12;
        final double HORAEXTRA=1.30;
        final double HORANOCTURNA=1.35;
        final int JORNADANORMAL=40;


        if(turno.equalsIgnoreCase("m"))
            if(horas>40){
                int numExtra = horas-JORNADANORMAL;
                double dineroExtra = numExtra*HORAEXTRA;
                System.out.printf("el dinero de la primera semana es %.2f",dineroExtra+(PRECIOHORA*JORNADANORMAL));
            }




    }
}
