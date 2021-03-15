/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema9 {

    public static float Años (float inversion, float acumular)
    {
        int años = 0;
        float suma = 0;
        while(suma<acumular)
        {
            años++;
            inversion = inversion*(1+0.06f);
            suma = suma+inversion;            
        }
        return(años);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de inversión: ");
        float inversion = leer.nextFloat();
        System.out.println("Ingresa la cantidad total a acumular: ");
        float acumular = leer.nextFloat();
        
        float años = Años(inversion,acumular);
        System.out.println("El número de años que necesita para acumular " +acumular +" son " +años +" años.");
        
    }
    
}
