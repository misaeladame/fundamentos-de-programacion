/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Leer variables
        float r, area, vol;
        // Leer datos
        System.out.print("**AREA Y VOLUMEN DE LA ESFERA**\n\n");
        System.out.print("Inserte el radio de la esfera: ");
        r = leer.nextFloat();
        
        area = CalcularArea(r);
        vol = CalcularVol(r);
        
        // Mostrar resultado
        System.out.println("EL area de la esfera es de " +area);
        System.out.println("El volumen de la esfera es de " +vol);
    }
    
    public static float CalcularArea (float r)
    {
        float area;
        area = (float) (4 * Math.PI * Math.pow(r, 2));
        return(area);
    }
    
    public static float CalcularVol (float r)
    {
        float vol;
        vol = (float) ((4/3) * Math.PI * Math.pow(r, 3));
        return(vol);
        
    }
    
}
