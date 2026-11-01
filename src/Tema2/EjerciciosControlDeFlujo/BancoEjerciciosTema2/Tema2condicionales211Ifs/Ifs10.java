/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Algoritmo que nos diga si una persona puede acceder a cursar un ciclo formativo de grado
superior o no. Se puede acceder si se tiene el título de bachiller; en caso de no tenerlo, se puede
acceder si se ha superado una prueba de acceso. El programa preguntará primero por el título y solo
 preguntará por la prueba si no lo tiene (respuestas s o n).


 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////



package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs10 {
    public static void main(String[]args){




        System.out.println("PARA COMPROBAR SI PUEDES ACCEDER A UN GRADO SUPERIOR TE HARE UNAS \nREGUNTAS CONTESTA s/n");
        System.out.print("¿Tienes título de bachiller?: ");
        Scanner sc = new Scanner(System.in);
        String titulo = sc.nextLine();

        if(titulo.equalsIgnoreCase("s")){
            System.out.println("Enhorabuena, gracias a que tienes el título de bachiller,SÍ PUEDES ACCEDER A UN GRADO SUPERIOR");
        }else {
            /*sc.nextLine();  AQUI LIMPIAR NEXTLINE PARA LIMPIAR LOS BUFFER NO ES NECESARIO PORQUE SOLO
             HAY QUE HACERLO CUANDO LOS DATOS INTRODUCIDOS AL ESCANER SON NUMÉRICOS Y LUEGO QUIERES METER CON SCANNER
            DATOS STRINGS */
            System.out.print("¿Tienes superada la prueba de acceso?:");
            String prueba = sc.nextLine();
            if(prueba.equalsIgnoreCase("s")){
                System.out.println("Enhorabuena, gracias a que tienes la prueba de acceso,SÍ PUEDES ACCEDER A UN GRADO SUPERIOR");
            }else {
                //sc.nextLine();
                System.out.println("No puedes optar al acceso a grado superior.");
            }
        }


    }
}
