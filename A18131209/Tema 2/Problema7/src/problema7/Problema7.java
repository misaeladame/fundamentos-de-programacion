/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float la1, la2, la3, area;
        // Leer datos
        System.out.print("**PROGRAMA DE AREA DEL TRIANGULO**\n\n");
        System.out.print("Ingrese el lado 1: ");
        la1 = leer.nextFloat();
        System.out.print("Ingrese el lado 2: ");
        la2 = leer.nextFloat();
        System.out.print("Ingrese el lado 3: ");
        la3 = leer.nextFloat();
        
        area = CalcularArea(la1, la2, la3);
        
        //Mostrar resultado
        System.out.println("El área del triangulo es: " +area);
        
    }
    
    public static float CalcularArea (float la1, float la2, float la3)
    {
        float area, p;
        p = (la1 + la2 + la3) / 2;
        area = (float) Math.sqrt(p*(p-la1)*(p-la2)*(p-la3));
        return(area);
    }
    
}
