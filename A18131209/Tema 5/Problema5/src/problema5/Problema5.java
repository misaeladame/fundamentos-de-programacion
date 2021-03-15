/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema5 {
    
    public static int [] CalcularSumaHoras (int nt, int[][]horas)
    {
        int i, j, suma;
        int [] totalH = new int[nt];
        for(i=0; i<nt; i++)
        {
            suma = 0;
            for(j=0; j<6; j++)
                suma += horas[i][j];
            totalH[i]=suma;
        }
        return(totalH);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String [] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};
        int i, nt, e=0, j;
        Scanner leer = new Scanner(System.in);
        System.out.println("No. de trabajadores: ");
        nt = leer.nextInt();
        int[][] horas = new int [nt][6];
        int [] totalH = new int[nt];
        for(i = 0; i < nt; i++)
        {
            e++;
            System.out.println("Introduzca las horas del empleado " +e);
            for(j = 0; j < 6; j++)
            {
                System.out.println("dia " +dias[j]);
                horas[i][j] = leer.nextInt();
            }
        }
        totalH = CalcularSumaHoras(nt, horas);
        for(i=0; i<6; i++)
            System.out.print("  " +dias[i]);
        System.out.println(" suma");
        e=0;
        for(i=0; i<nt; i++)
        {
            for(j=0; j<6; j++)
                System.out.print("      " +horas[i][j] +"   ");
            System.out.println("     " +totalH[i]);
            
        }
  
    }
}

