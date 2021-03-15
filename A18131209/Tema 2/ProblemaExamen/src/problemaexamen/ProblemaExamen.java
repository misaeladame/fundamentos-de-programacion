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


    public static float CalcularLo (float h, float rad)
    {
        float lo;
        lo = (float) (h*Math.sin(rad));
        return(lo);
    }
    
    public static float CalcularLa (float h, float rad)
    {
        float la;
        la = (float) (h*Math.cos(rad));
        return(la);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float h, ang, rad, lo, la;
        System.out.print("Ingrese la hipotenusa: ");
        h = leer.nextFloat();
        System.out.print("Ingrese el ángulo: ");
        ang = leer.nextFloat();
        
        rad = (float) ((ang*Math.PI)/180);
        
        lo = CalcularLo (h, rad);
        la = CalcularLa (h, rad);
        
        System.out.println("El lado es " +lo);
        System.out.println("El lado adyacnte es " +la);
    }  
}
