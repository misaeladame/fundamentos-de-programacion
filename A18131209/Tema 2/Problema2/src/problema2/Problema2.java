/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author aa434
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float altura, base, area;
        // Leer datos
        System.out.print("Introduzca la altura: ");
        altura = leer.nextFloat();
        System.out.print("Introduzca la base: ");
        base = leer.nextFloat();
        // Calcular area
        area = base * altura / 2;
        // Muestra resultado
        System.out.println("El area es " +String.format("%.2f", area));
    }
    
}
