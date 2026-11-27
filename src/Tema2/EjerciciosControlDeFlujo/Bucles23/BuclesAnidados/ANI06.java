////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Muestra todos los pares de valores (i, j) con i de 1 a 3 y j de 1 a 3, uno por línea.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




package Tema2.EjerciciosControlDeFlujo.Bucles23.BuclesAnidados;

public class ANI06 {
    public static void main(String[]args){

        for(int i =1;i<=3;i++){
            for(int j =1;j<=3;j++){
                System.out.printf("%d %d\n",i,j);

            }
            System.out.println();
        }

    }
}
