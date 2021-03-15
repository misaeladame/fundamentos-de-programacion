/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaexamen;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class ProblemaExamen {
    
    public static void CalcularHip (float b, float c)
    {
        float a; 
        a = (float) Math.sqrt((b*b)+(c*c));
        System.out.println("La hipotenusa de ese triángulo es " +a);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el cateto 1: ");
        float b = leer.nextFloat();
        System.out.print("Ingrese el cateto 2: ");
        float c = leer.nextFloat();
        CalcularHip(b,c);
    }
}
