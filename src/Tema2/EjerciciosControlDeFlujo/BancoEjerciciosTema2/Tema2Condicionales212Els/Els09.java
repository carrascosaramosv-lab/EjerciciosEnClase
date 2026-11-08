////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Pedir dos fechas (día, mes y año de cada una) y mostrar el número de días que hay de diferencia, suponiendo que
todos los meses tienen 30 días.
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2Condicionales212Els;
import java.util.Scanner;
public class Els09 {
    public static void main(String[]args){
        System.out.println("Introduce las dos fechas en formato dd mm aaaa dd mm aaaa ");
        Scanner sc = new Scanner(System.in);
        final int DIASENANIO = 360;
        final int DIASENMES = 30;

        int dia1 = sc.nextInt(),
            mes1 = sc.nextInt(),
            anio1 = sc.nextInt(),
            dia2 = sc.nextInt(),
            mes2 = sc.nextInt(),
            anio2 = sc.nextInt();

         int anioResto = anio2 - anio1,
                 mesResto = mes2-mes1,
                 diaResto= dia2-dia1,
                 diasAnioResto = anioResto*DIASENANIO,
                 diasMesResto = mesResto*DIASENMES,
                 diasRestoTotales = diaResto + diasAnioResto + diasMesResto;

         if (diasRestoTotales<0){
             diasRestoTotales*=-1;
         }
        System.out.printf("%d días.",diasRestoTotales);


    }
}
