////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Una empresa que vende desinfectantes necesita gestionar sus facturas, pero en cada factura solo
figura el código del artículo y la cantidad vendida en litros, porque el precio depende del
artículo: 1) 0,6 €/litro, 2) 3 €/litro y 3) 1,25 €/litro. Se pide, de 5 facturas introducidas: facturación
total, cantidad en litros vendidos del artículo 1 y cuántas facturas se emitieron de más de 600 €.
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Tema2.EjerciciosControlDeFlujo.Bucles23;
import java.util.Scanner;
public class for31 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        final double PRECIOARTICULO1=0.6;
        final double PRECIOARTICULO2=3;
        final double PRECIOARTICULO3=1.25;

        System.out.println("Introduce el código del artículo y lo gastado en esa factura: ");
        int codArticulo = sc.nextInt();
        int litrosVendidos= sc.nextInt();



    }
}
