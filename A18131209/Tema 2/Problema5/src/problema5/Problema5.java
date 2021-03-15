/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        final float salario=250;
        final double comision=0.15;
        float ArtVendidos, TotalVentas, ComisionVentas, ComisionArt, SalarioTotal;
        // Leer datos
        System.out.print("Ingrese el numero de articulos que vendio: ");
        ArtVendidos = leer.nextFloat();
        System.out.print("Ingrese el total de ventas: ");
        TotalVentas = leer.nextFloat();
        // Calcular la comision de ventas
        ComisionVentas = (float) (TotalVentas * comision);
        // Calcula la comision de articulos
        ComisionArt = ArtVendidos * 15;
        // Calcula el Salario Total
        SalarioTotal = ComisionVentas + ComisionArt + salario;
        // Muestra el salario total
        System.out.println("Su salario total es: " +SalarioTotal +" dolares.");
        
    }
    
}
