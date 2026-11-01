////////////////////////////////////////////////////////////////////////////////////////////
/*

Gasolinera

Filiberto trabaja en una gasolinera. Todo este mes le toca calcular la estimación de litros
                                       que se deben pedir diarios a la central para no presentar
                                        problemas de suministro, y la verdad, no tiene ni idea.
                                        Lo único que ha ido anotando en los tres últimos meses
                                         son los vehículos que han venido a la gasolinera.
                                          Teniendo esto en cuenta, se ha informado del tamaño
                                          máximo del depósito de cada tipo de vehículo,
                                          resultando en lo siguiente:

    Camiones: caben 100 litros

    Todoterrenos/SUV: caben 70 litros

    Turismos: caben 50 litros

En base a esto, y a los vehículos que ha ido anotando mes a mes, debes elaborar un programa
que estime los litros diarios que debe pedir, suponiendo que todos los meses tienen 30 días.

Entrada

La entrada constará de 3 líneas, y cada línea de 3 números. Una línea representa los vehículos
 que han venido en un mes, en el mismo orden expresado más arriba.

Salida

La salida constará de un único número entero indicando la cantidad estimada de litros que se
 consumirían diariamente, en base a los datos mensuales anteriores y  suponiendo que todos los
 vehículos llenaran completamente el depósito.

Entrada de prueba

104 100 100
100 500 100
200 100 100

Salida de prueba

1160


 */
////////////////////////////////////////////////////////////////////////////////////////////


package Tema1.A00EjerciciosParaHacerEnClase;
import java.util.Scanner;
public class Gasolinera {
    public static void main(String[] args){
        final int camionL = 100,
                todoterrenoL = 70,
                turismoL = 50,
                dias = 90;

        System.out.println("Indicame el número de cada tipo vehículos que han repostado en cada mes introduciendo " +
                "primero camiones, terrenos, turísmos escrbiendo un mes por línea:   ");// \n MES 1 \nCamiones: ")
        // \nTodoterrenos: \nTurismos: \n\n MES 2 \nCamiones: \nTodoterrenos: \nTurismos: \n MES 3 \nCamiones:
        // \nTodoterrenos: \nTurismos: ");
        Scanner teclado = new Scanner(System.in);
        int camiones1 = teclado.nextInt(),
            todoterrenos1 = teclado.nextInt(),
            turismos1 = teclado.nextInt(),
            camiones2 = teclado.nextInt(),
            todoterrenos2 = teclado.nextInt(),
            turismos2 = teclado.nextInt(),
            camiones3 = teclado.nextInt(),
            todoterrenos3 = teclado.nextInt(),
            turismos3 = teclado.nextInt();
        int camiones1L = camiones1*camionL,
            todoterrenos1L = todoterrenos1*todoterrenoL,
            turismos1L = turismos1*turismoL,
            camiones2L = camiones2*camionL,
            todoterrenos2L = todoterrenos2*todoterrenoL,
            turismos2L = turismos2*turismoL,
            camiones3L = camiones3*camionL,
            todoterrenos3L = todoterrenos3*todoterrenoL,
            turismos3L = turismos3*turismoL;
        double camionesTotalL =(double) (camiones1L+camiones2L+camiones3L)/dias,
               todoterrenosTotalL = (double)(todoterrenos1L+todoterrenos2L+todoterrenos3L)/dias,
               turismosTotalL = (double)(turismos1L+turismos2L+turismos3L)/dias,
               totalL = camionesTotalL+todoterrenosTotalL+turismosTotalL;
        int total = (int)Math.ceil(totalL);
        //double mes1 = (double)(camiones1L + todoterrenos1L + turismos1L + camiones2L + todoterrenos2L
                 //  + turismos2L + camiones3L + todoterrenos3L + todoterrenos3L)/90;



        System.out.printf("la gasolina es : %02d ",total);








    }



}
