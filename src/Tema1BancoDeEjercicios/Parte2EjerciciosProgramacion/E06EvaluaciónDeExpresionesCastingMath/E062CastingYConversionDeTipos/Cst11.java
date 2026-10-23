/////////////////////////////////////////////////////////////////////////////////
/*
Nuestro amigo Luis necesita ayuda para poder llenar su piscina. Nos ha dicho
que no sabe bien las medidas así que nosotros tendremos que medir el ancho, el
largo y la altura. También nos ha dicho que la bomba para echar el agua a la piscina
 solo puede estar encendida 40 minutos y no sabe la cantidad que cae al
  minuto. Calcula cuánto tiempo tardará Luis en llenar su piscina si nos dicen
  además cuántos litros por segundo echa la bomba.


 */
//////////////////////////////////////////////////////////////////////////////////




package Tema1BancoDeEjercicios.Parte2EjerciciosProgramacion.E06EvaluaciónDeExpresionesCastingMath.E062CastingYConversionDeTipos;

import java.util.Scanner;

public class Cst11 {
    public static void main(String[] args){
       final int UNAHORA=3600,
                 UNMINUTO=60;


        System.out.println("Dime las medidas de la  piscina ancho,largo,altura");
        System.out.println("¿cuántos litros por segundo echa la bomba?");
        Scanner sc = new Scanner(System.in);
        int ancho = sc.nextInt(),
            largo = sc.nextInt(),
            altura = sc.nextInt(),
            litrosPorSec = sc.nextInt(),
            m3=ancho*largo*altura,
            litros = m3*1000, //1000litros que hay en un m3
            segundosTotal = litros/litrosPorSec,
            hora = segundosTotal/UNAHORA,
            min = (segundosTotal%UNAHORA)/UNMINUTO,
            seg = (segundosTotal%UNAHORA)%UNMINUTO;

             System.out.printf("%02dh,%02dmin y %02dseg",hora,min,seg);






    }
}
