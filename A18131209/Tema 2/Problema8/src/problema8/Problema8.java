/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        int seg, minutos, segS;
        // Leer datos
        System.out.print("**CONVERSION**\n\n");
        System.out.print("Inserte los segundos que desea convertir a su equivalencia en minutos: ");
        seg = leer.nextInt();
        
        minutos = CalcularMin(seg);
        segS = CalcularSeg(seg);
        
        // Mostrar resultado
        System.out.println(seg +" segundos son: " +minutos +" minutos " +segS +" segundos. ");
                
    }
    
    public static int CalcularMin (int seg)
    {
        int minutos;
        minutos = seg/60;
        return(minutos);
    }
    
    public static int CalcularSeg (int seg)
    {
        int segS;
        segS = seg%60;
        return(segS);
    }    
    
}
