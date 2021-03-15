/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema18;

import static java.lang.Math.sin;
import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float co, angulo, h;
        System.out.print("Ingrese el cateto opuesto: ");
        co = leer.nextFloat();
        System.out.print("Ingrese el angulo: ");
        angulo = leer.nextFloat();
        
        h = CalcularHip(co, angulo);
        
        System.out.println("La hipotenusa es de " +h);
        
    }
    
    public static float CalcularHip (Float co, float angulo)
    {
        float h;
        h = (float) (co/(sin(0.0174533*angulo)));
        return(h);
    }
    
}
