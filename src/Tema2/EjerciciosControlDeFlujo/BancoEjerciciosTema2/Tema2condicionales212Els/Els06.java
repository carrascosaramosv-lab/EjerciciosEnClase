/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Realiza un programa que calcule la media de 3 notas recibidas por teclado y que diga la nota del
boletín: insuficiente (menos de 5), suficiente (de 5 a menos de 6), bien (de 6 a menos de 7), notable
 (de 7 a menos de 9) o sobresaliente (9 o más).


 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales212Els;
import java.util.Scanner;
public class Els06 {
    public static void main(String[]args){

        System.out.print("Introduce las tres notas del examen ");
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt(),
            nota2 = sc.nextInt(),
            nota3 = sc.nextInt();
        double x = (nota1+nota2+nota3)/3.0; /*tengo que poner 3.0 en vez de 3 porque la división se evalúa antes
        de la asignación.Java realiza la operación con enteros y descarta los
        decimales, y solo después convierte el resultado a double. Para solucionarlo
        pongo en la division uno de los números con decimales */
        String mensaje="";
        if(x<5){
            mensaje = "insuficiente";
        }else if(x>=5 && x<6) {
             mensaje = "suficiente";
        } else if (x>=6 && x<7) {
             mensaje = "bien";
        }else if(x>=7 && x<9){
             mensaje = "notable";
        } else if (x>=9 && x<=10) {
             mensaje = "sobresaliente";
        }


        System.out.printf("%d,%d y %d ---> media %.1f --->%s",nota1,nota2,nota3,x,mensaje);

    }

}
