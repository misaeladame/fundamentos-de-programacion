/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;

import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float a, b, c, x1, x2;
        // Leer datos
        System.out.print("**FORMULA GENERAL**\n\n");
        System.out.print("Introduce la variable a: ");
        a = leer.nextFloat();
        System.out.print("Introduce la variable b: ");
        b = leer.nextFloat();
        System.out.print("Introduce la variable c: ");
        c = leer.nextFloat();
        
        x1 = CalcularEcu1(a, b, c);
        x2 = CalcularEcu2(a, b, c);
        
        //Mostrar resultado
        System.out.println("x1 = " +x1 +",  x2 = " +x2);
        
    }
    
    public static float CalcularEcu1 (float a, float b, float c)
    {
        float radical, x1;
        radical = (float) sqrt(Math.pow(b, 2)-4*a*c);
        x1 = (-b+radical)/(2*a);
        return(x1);
    }
    
    public static float CalcularEcu2 (float a, float b, float c)
    {
        float radical, x2;
        radical = (float) sqrt(Math.pow(b, 2)-4*a*c);
        x2 = (-b-radical)/(2*a);
        return(x2);
    }
    
}
