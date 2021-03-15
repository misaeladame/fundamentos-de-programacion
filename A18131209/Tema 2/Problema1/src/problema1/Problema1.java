/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;
/**
 *
 * @author aa434
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        float radio;
        double area;
        // Mostrar comentario
        System.out.print("Introduzca el radio del circulo: ");
        // Leer el valor del radio
        radio = leer.nextFloat();
        // Calcular area
        area = Math.PI * Math.pow(radio, 2);
        // Mostrar resultado
        System.out.println("El area del circulo es: " +area);
        
    }
    
}
