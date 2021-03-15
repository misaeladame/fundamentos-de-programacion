/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float PLista, iva, PVenta;
        // Leer Datos
        System.out.print("Introduce el precio de lista: ");
        PLista = leer.nextFloat();
        // Calcular el Iva
        iva = (float) (PLista * 0.16);
        // Calcular el precio de venta
        PVenta = PLista + iva; 
        // Muestra los resultados
        System.out.println("Precio lista $" +PLista);
        System.out.println("Precio Venta $" +PVenta);
    }
    
}
