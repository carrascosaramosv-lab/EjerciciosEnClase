/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Mala memoria

Cuando era pequeño y jugaba en mi pueblo, vivía un anciano, Domingo, muy entrañable y particular. Contaba unas
historias maravillosas, pero el hombre tenía algún tipo de trastorno que afectaba a la forma en la que su cerebro
concebía las fechas, y siempre que iba a empezar a contarnos una historia la empezaba "Era el día ..." y nosotros
nos mirábamos estupefactos con las fechas que decía. El caso es que nos informamos y descubrimos que todo lo que decía
era verdad, y que las fechas tenían su sentido.

De esta forma descubrimos que cuando el hombre decía el 43 del 25 de 1931, en realidad estaba diciendo el 12  de
 Febrero de 1933. Y era curioso, porque nunca decía días mayores que el 59.

Elabora un algoritmo que dada la fecha en el formato que este hombre la pronunciaba, aparezca por pantalla el día,
 el mes y el año que todos entendemos, teniendo en cuenta que para simplificar, no vamos a contar los años bisiestos.

Podéis hacer que el mes salga en número o en letra.

Entrada

3 números enteros indicando el día, el mes y el año de la forma en que Domingo los daría.

Salida

Se mostrará la fecha exacta transformada de forma que sea entendible por todos, pero considerando que no vamos a
tener en cuenta si un año es bisiesto o no.
 */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////





package Tema2.EjerciciosControlDeFlujo.EjerciciosEnClase02;
import java.util.Scanner;
public class MalaMemoria {
    public static void main(String[]args){

        System.out.print("Introduce la fecha de Domingo dd mm aaaa: ");
        Scanner sc = new Scanner(System.in);
        int dia1 = sc.nextInt(),
                mes1 = sc.nextInt(),
                anio1 = sc.nextInt();

        // 1. Calculamos los años extra a partir de los meses que superan el 12
        int aniosmas = mes1 / 12;
        int anioFinal = anio1 + aniosmas;

        // El mes resultante antes de ajustar (del 1 al 12)
        int mesFinal = mes1 % 12;
        if (mesFinal == 0) {
            mesFinal = 12;
            anioFinal--; // Ajuste si cae en múltiplo exacto de 12
        }

        // 2. Averiguamos cuántos días tiene este mes
        int diasDelMes = switch (mesFinal) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 31;
        };

        // 3. Gestionamos el desbordamiento de los días (sin bucles)
        int diasTotales = dia1;

        if (diasTotales > diasDelMes) {
            diasTotales -= diasDelMes;
            mesFinal++;

            // Si al sumar el mes pasa de 12, pasa al año siguiente
            if (mesFinal > 12) {
                mesFinal = 1;
                anioFinal++;
            }
        }

        System.out.printf("%d de %d del año %d", diasTotales, mesFinal, anioFinal);

        sc.close();

        }




    }

