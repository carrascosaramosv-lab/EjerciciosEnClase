/////////////////////////////////////////////////////////////////////////////
/* El anuncio más caro del mundo

En España, la tradición de comer 12 uvas con las primeras (¿o son las últimas?) campanadas
del año lleva a todo el país a conectar la televisión para ver la retransmisión desde algún
                 reloj emblemático. Eso supone unas cuotas de pantalla irrepetibles durante el
                  resto del año, y las cadenas aprovechan para pedir a los anunciantes una gran
                  cantidad de dinero por emitir su anuncio. Cuanto más cerca está el anuncio de las
                  campanadas más gente lo verá, lo que lleva a que el último anuncio emitido del año
                  se convierte normalmente en el más caro del año completo.

En la Nochevieja de 2014−15, los responsables de Canal Sur intentaron acercar tanto el último
 anuncio a las campanadas que… se pasaron y lo pusieron durante las propias campanadas, dejando
 a decenas de miles de andaluces sin comer las uvas. Sabiendo que las campanadas comienzan
 exactamente a las 12:00 de la noche, y dada la duración del último anuncio, ¿cuál es la hora
 límite para comenzar su emisión?
Entrada

Cada caso de prueba indica la duración del último anuncio, suministrando las horas, minutos
 y segundos en 3 números separados por espacios. La entrada cumple las reglas de las
 horas (0 ≤ HH < 24, 1 ≤ MM,SS < 60). Los anuncios no pueden tener en su duración ni 0 minutos ni 0 segundos.
Salida

Para cada caso de prueba se indicará la hora más tardía a la que puede empezar el anuncio, en
formato HH:MM:SS, siguiendo también las restricciones habituales de las horas.
Entradas de ejemplo

00 01 30
01 01 59
Salidas de ejemplo

23:58:30
22:58:01
 */

//////////////////////////////////////////////////////////////////////////////////////////////////




package Tema1.A00EjerciciosParaHacerEnClase;
import java.util.Scanner;

public class ElAnuncioMasCaroDelMundo {
    public static void main(String[]args){
        //CREO OBJETO DEL SCANNER
        Scanner teclado = new Scanner(System.in); //creo el objeto

        //MUESTRO TEXTO POR PANTALLA.
        System.out.println("¿Cuanto tiempo tardará la emisión (HH MM SS) ?: "); // Le pido que me ingrese el tiempo asi ejemplo: 02:43:45
        //teclado.useDelimiter(":"); // le digo que use de limitador : (los dos puntos).

       //PIDO ENTRADA POR TECLADO Y DECLARO SUS VARIABLES.
        String token1 = teclado.next(); /* Aqui estoy delarando que el dato ingresado por teclado es del tipo
                                                    cadena de texto y además con el netx() le estoy dicendo que trate cada tocken como cadena de texto
                                                    y vaya token a token los cuales están delimitados por los espacios por defecto.*/
        String token2 = teclado.next();
        String token3 = teclado.next(); /* con estoy estoy indicando que coge hasta el 3 token, si hay más los ignora. */

        //HAGO CONVERSIÓN DE STRING A INT
        int hora = Integer.parseInt(token1); /* aqui estoy declarando la variable hora como un entero y le estoy
                                                asignando la conversión de tocken1 que es un String que lo trate como un entero */
        int min = Integer.parseInt(token2);
        int seg = Integer.parseInt(token3);

        //PASO TODO A SEGUNDOS Y HAGO LA OPERACIÓN EN SEGUNDOS.
        int segundosIngresados = (hora*3600) + (min*60) + seg; /*Estoy pasando a segundos toda la hora ingresada
                                                                 multiplicando el numero de la hora por 3600 segundos que tiene una hora. */
        int segundos24h = 24*3600;                            /* Paso las horas que tiene un día a segundos 24 horas que tiene un día por
                                                                3600 segundos que tiene una hora. */
        int segundosTotales = segundos24h - segundosIngresados; /* Declaro una variable de tipo entero llamandola segundosTotales
                                                                    asignadole la resta de la variable segundos24h menos segundosIngresados  */
        //AHORA PASO LOS SEGUNDOS A HORAS MINUTOS Y SEGUNDOS.
        int horaInicio = segundosTotales/3600;           /* Declaro una variable int como la division de
                                                            la variable segundosTotales entre los segundos que
                                                            tiene una hora (3600) y me quedo con la parte entera de la división.  */
        int minutosInicio = (segundosTotales%3600)/60;     /* Declaro una variable entera llamada minutosInicio que le asigno el resto de
                                                            la división de la variable segundosTotales entre 3600 y a ese resto le estoy
                                                            dividiendo entre 60 que son los segundos que tiene un minuto y me quedo con la parte entera.  */
        int segundosInicio = segundosTotales%60;         /* Declaro un variable de tipo entero llamada segundosIncio que le asigno el modulo de la
                                                            división de segundosTotales entre 60 que son los segundo que hay en un minuto.*/

        //MUESTRO POR PANTALLA EL RESULTADO
        System.out.printf("La hora limite para meter contenido en cadena de esa duración es: %02d:%02d:%02d", horaInicio, minutosInicio, segundosInicio); /* Aquí muestro texto por pantalla, usando un printf
         que sirve en este caso para dar formato de horas (hh:mm:ss) y evitar concatenar */




    }
}
