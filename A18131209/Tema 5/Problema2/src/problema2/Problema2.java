/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema2 {

    public static float[] CalcularSalarioNeto (int nt, float[] SalarioB)
    {
        float[] SNeto = new float[nt];
        for(int i=0; i<nt; i++) 
        {
            if(SalarioB[i]<1000) 
            {
                float desc = SalarioB[i]*0.05f;
                SNeto[i] = SalarioB[i]-desc;
            }
            else
            {
                SNeto[i] = SalarioB[i]*0.94f;
            }
        }
        return(SNeto);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de trabajadores: ");
        int nt = leer.nextInt();
        float[] SalarioB = new float [nt];
        float[] SNeto = new float[nt];
        int i;
        System.out.println("Salario de los " +nt);
        for(i=0; i<nt; i++)
            SalarioB[i] = leer.nextFloat();
        SNeto = CalcularSalarioNeto(nt, SalarioB);
        System.out.println("Salario Bruto     Salario Neto");
        for(i=0; i<nt; i++)
            System.out.println(SalarioB[i] +"              " +SNeto[i]);
    }
    
}
