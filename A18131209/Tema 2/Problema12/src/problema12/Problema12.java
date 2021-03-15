/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema12;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar varables
        float h, angulo, co, ca;
        // Leer datos
        System.out.print("**CATETOS DE UN TRIANGULO**\n\n");
        System.out.print("Ingrese la hipotenusa: ");
        h = leer.nextFloat();
        System.out.print("Ingrese el angulo: ");
        angulo = leer.nextFloat();
        
        co = CalcularCo(h, angulo);
        ca = CalcularCa(h, angulo);
        
        // Mostrar resultado
        System.out.println("El cateto opuesto es: " +co);
        System.out.println("El cateto adyacente es: " +ca);
    }
    
    public static float CalcularCo (float h, float angulo)
    {
        float co;
        co = (float) (h * (sin(0.0174533 * angulo)));
        return(co);
    }
    
    public static float CalcularCa (float h, float angulo)
    {
        float ca;
        ca = (float) (h * (cos(0.0174533 * angulo)));
        return(ca);
    }
            
    
}
