import java.util.Scanner;
public class aduana1 {
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
                if(peso<20){

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
                    }

                }else{
                    System.out.printf("La mercancía de su camión es RECHAZADA por el peso de %d toneladas",peso);
                }
            }else if(tipo==3){
                if(peso<=12){
                    if(codigoPais>0 && codigoPais<28){
                        System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso APROBADO.",TIPO3,peso,codigoPais);
                    }else if(codigoPais>3000 && codigoPais<3999){
                        System.out.printf("Su camion con mercancía %s , de %d toneladas y de origen %d, tiene el acceso REVISION MANUAL.",TIPO3,peso,codigoPais);
                    }

                }else{
                    System.out.printf("La mercancía de su camión es RECHAZADA por el peso de %d toneladas",peso);
                }
            }


        }else {
            System.out.println("RECHAZADO:Por documentación.");
        }


    }
}
