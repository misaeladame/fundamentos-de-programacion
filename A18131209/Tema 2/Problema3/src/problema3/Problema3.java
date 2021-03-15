/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;
/**
 *
 * @author aa434
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float cm, m;
        // Leer datos 
        System.out.print("Introduzca los metros que desee convertir a centimetros: ");
        m = leer.nextFloat();
        // Calcular la conversion
        cm = m * 100;
        // Muestra resultado.
        System.out.println(cm +" cm equivale a " +m +" m.");
    }
    
}
