/*
Víctor trabaja en el departamento de aduanas, donde el caos en fechas como Navidad o Black Friday colapsa
el puerto. Para agilizar el trabajo, su jefe le pide un programa que automatice las decisiones basándose en
cuatro datos: tipo de mercancía (3: peligrosa, 2: perecedera, 1: general), peso en toneladas, código de país
de cuatro cifras y estado de la documentación. Si la documentación no está en regla, la carga es rechazada, salvo
 la general, que va a revisión manual.

Además, existen estrictos límites de peso: máximo 12 toneladas para mercancías peligrosas, 16 para perecederas
 y 20 para generales. Los cargamentos perecederos y peligrosos deben proceder exclusivamente de la comunidad
 europea (códigos del 0000 al 0027), a menos que tengan un tratado especial (código que empieza por 1 para
  perecederos y por 3 para peligrosos). A todos los contenedores con dichos tratados se les realiza siempre
  una revisión manual. Finalmente, la carga general que supera su límite de peso es rechazada de inmediato, sin
  permitirse jamás una revisión manual para ella.
*/
import java.util.Scanner;
public class AduanaVictor {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Indica el número del tipo de mercancia : \n1.Mercancia general. \n2.Mercancia perecedera.\n3.Mercancia peligrosa.");
        int tipo = sc.nextInt();
        System.out.print("¿Cual es el peso de la mercancia(en toneladas)?: ");
        int peso = sc.nextInt();
        System.out.print("Introduce el código del país: ");
        int codigoPais = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce si esta en regla la documentación (si/no):");
        String papeles = sc.nextLine();

        final String TIPO1="general",
                     TIPO2="perecedera",
                     TIPO3="peligrosa";

        if (papeles.equalsIgnoreCase("si")){

            if (tipo==1){
                if(peso<=20){

                    System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso APROBADO.",TIPO1,peso,codigoPais);
                }else{
                    System.out.printf("La mercancía de su camión es RECHAZADA por el peso de %d toneladas",peso);
                }
            }else if(tipo==2){
                if(peso<16){
                    if(codigoPais>0 && codigoPais<28){
                        System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso APROBADO.",TIPO2,peso,codigoPais);
                    }else if(codigoPais>1000 && codigoPais<1999){
                        System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso REVISION MANUAL.",TIPO2,peso,codigoPais);
                    }else{
                        System.out.println("Camión RECHAZADO por el origen de la mercancía");
                    }

                }else{
                    System.out.printf("La mercancía de su camión es RECHAZADA por el peso de %d toneladas",peso);
                }
            }else if(tipo==3){
                if(peso<=12){
                    if(codigoPais>=0 && codigoPais<=28){
                        System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso APROBADO.",TIPO3,peso,codigoPais);
                    }else if(codigoPais>=3000 && codigoPais<4000){
                        System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso REVISION MANUAL.",TIPO3,peso,codigoPais);
                    }else{
                        System.out.println("Camión RECHAZADO por el origen de la mercancía");
                    }

                }else {

                    System.out.printf("La mercancía de su camión es RECHAZADA por el peso de %d toneladas",peso);
                }
            }else {
                System.out.println("El tipo de mercancía es ERRÓNEO.");
            }


        }else if(papeles.equalsIgnoreCase("no")&& tipo==1){

            System.out.println("La mercancía de su camión tiene que pasar por REVISIÓN MANUAL por no tener lo papeles en regla.");
        }else {
            System.out.println("RECHAZADO:Por documentación.");
        }


    }
}
