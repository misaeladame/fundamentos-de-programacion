/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author aa416
 */
public class Problema8 {
    
    public static int calcularAños (float inver, float tasa, float retiro)
    {   
        int naños = 0;
        float interes;
        do
        {
            interes = inver * tasa;
            inver += interes;
            inver -= retiro;
            naños++;
        }
        while(inver >= retiro);
        System.out.println("capital $" +inver);
        return(naños);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        float inver, tasa, retiro;
        int naños;
        System.out.print("Introduzca la inversión: ");
        inver = leer.nextFloat();
        System.out.print("Introduzca la tasa: ");
        tasa = leer.nextFloat();
        System.out.print("Introduzca el retiro: ");
        retiro = leer.nextFloat();
        naños = calcularAños(inver,tasa,retiro);
        System.out.println("En " +naños +" años ya no es posible");
        
    }
    
}
