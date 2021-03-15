/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema15;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer =  new Scanner(System.in);
        float nhF, nhM, nhA, iA, iM, iF, cM, cF, cA, CT;
        System.out.print("No. de hectareas del arroz: ");
        nhA = leer.nextFloat();
        System.out.print("Importe del arroz: ");
        iA = leer.nextFloat();
        System.out.print("No. de hectareas del frijol: ");
        nhF = leer.nextFloat();
        System.out.print("Importe del frijol: ");
        iF = leer.nextFloat();
        System.out.print("No. de hectareas del maiz: ");
        nhM = leer.nextFloat();
        System.out.print("Importe del maiz: ");
        iM = leer.nextFloat();
        
        cM = costo(nhM, iM);
        cF = costo(nhF, iF);
        cA = costo(nhA, iA);
        
        CT = cM + cF + cA;
        
        System.out.println("El costo del seguro agricola es $" +CT);
    }
    
    public static float costo(float nh, float imp)
    {
        // Declaracion de constante
        final float porcentaje = 0.035f;
        float costocu = nh * imp * porcentaje;
        return(costocu);
    }
       
}
