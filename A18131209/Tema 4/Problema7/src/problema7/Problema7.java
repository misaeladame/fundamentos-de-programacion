/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema7 {

    public static int CalcularMeses (float prestamo, float abono) 
    {
        int meses = 0;
        float interes;
        interes = abono * 0.06f;
        do 
        {
            prestamo -= abono-interes;
            meses++;
        }
        while(prestamo>0);
        return(meses);   
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float prestamo, abono;
        int meses;
        System.out.print("Ingrese el monto del prestamo: ");
        prestamo = leer.nextFloat();
        System.out.print("Ingrese el monto del abono: ");
        abono = leer.nextFloat();
        
        meses = CalcularMeses(prestamo, abono);
        
        System.out.println("El número de meses en que pagará son " +meses);
        
    }
    
}
