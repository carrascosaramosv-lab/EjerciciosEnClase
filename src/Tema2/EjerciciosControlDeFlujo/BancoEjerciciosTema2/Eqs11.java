/////////////////////////////////////////////////////////////////////////////////////////
/*
Programa un cajero automático de texto con un saldo inicial de 1000 €. El usuario
escribe una orden: «saldo», «ingresar» o «retirar». Con «saldo» se muestra
el saldo; con «ingresar» o «retirar» se pide una cantidad y se actualiza el
saldo (no se puede retirar más dinero del que hay). Si la orden no existe, se
muestra un mensaje de error.
 */
/////////////////////////////////////////////////////////////////////////////////////////
package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2;
import java.util.Scanner;
public class Eqs11 {
    public static void main(String[]args){

        System.out.print("Escribe una orden: ");
        Scanner sc = new Scanner(System.in);
        String orden = sc.nextLine();

        float dineroEnCuenta = 1000.0f;


        if (orden.equalsIgnoreCase("saldo")){
            System.out.printf("%.2f€",dineroEnCuenta);
        } else if (orden.equalsIgnoreCase("retirar")) {
            System.out.print("¿Cuanto dinero desea retirar?: ");
            float cantidadRetirar = sc.nextFloat();
            float retirarDinero = dineroEnCuenta-cantidadRetirar;
            System.out.printf("saldo actual despues de retirar %.2f es ---> %.2f€",cantidadRetirar,retirarDinero);
        }else if(orden.equalsIgnoreCase("ingresar")){
            System.out.print("¿Cuanto dinero desea ingresar?: ");
            float cantidadIngresar = sc.nextFloat();
            float ingresarDinero = dineroEnCuenta+cantidadIngresar;
            System.out.printf("Su saldo actual despues de ingresar %.2f es %.2f€ ",cantidadIngresar,ingresarDinero);
        }else {
            System.out.println("Error.");
        }


    }

}
