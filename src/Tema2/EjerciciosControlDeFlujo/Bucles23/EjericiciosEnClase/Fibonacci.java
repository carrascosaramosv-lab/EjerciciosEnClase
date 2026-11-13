////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Fibonacci

El mes pasado, como Jaime se aburría, nos mandó hacer una calculadora en lenguaje ensamblador, que ya
hay que tener ganas. En la calculadora, una de las opciones que había que hacer era realizar la secuencia de
 Fibonacci (se trata de una secuencia que empieza con 0 y 1, y en la que el número siguiente es la suma del
  último número con el penúltimo, y así sucesivamente. Ej: 0,1,1,2,3,5,8,13,21...). Jonathan, como es muy curioso,
   se preguntaba como se haría dicha secuencia en Python, que es el lenguaje de programación que estaba dando
   con Emilio. Para ello Jonathan tendría que hacer un programa en el que solo se pida el número de veces que quiere
    que se repita la secuencia y que de como salida esta misma secuencia. Hay que tener en cuenta que la serie
    ya mostrará nada más empezar el 0 y el 1 siempre, con lo que la secuencia que se pida debe tener más de 2 dígitos.
    Al saber esto también debemos de tener cuidado, ya que la serie siempre valdrá cuando el número de repeticiones
     sea positivo, si es negativo tendrá que avisar que la secuencia no funcionará con un número negativo o igual a 0.

ENTRADA

Como entrada introduciremos el número de veces que queremos que se repita la secuencia

SALIDA

Mostrará la secuencia de Fibonacci el número de veces que hayamos introducido en la entrada

ENTRADAS DE EJEMPLO

8

15

SALIDAS DE EJEMPLO

0,1,1,2,3,5,8,13

0,1,1,2,3,5,8,13,21,34,55,89,144,233,377
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23.EjericiciosEnClase;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        System.out.print("Escribe un número y te muestro la frecuencia de Fibonacci: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int j=1;
        int sum=0;
        int aux=0;
        for (int i =0;i<=num-1;i++){
            sum=aux+j;
            j=aux;
            aux=sum;
            System.out.println(j);
        }


    }
}
