/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema13;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema13 {
    
    public static double Serie(double a, double b)
    {
        double f=0, termino;
        int i = 1, j=1, k=0;
        do
        {
            termino = i/(j*a + k*b);
            f += termino;
            i += j;
            j += 2;
            k += 3;
        }
        while(termino >= 0.001f);
        return(f);
    }
    
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        double a, b, sumaF;
        System.out.print("Valor de A: ");
        a = leer.nextDouble();
        System.out.print("Valor de B: ");
        b = leer.nextDouble();
        sumaF = Serie(a, b);
        System.out.println("valor de la sumatoria es " +sumaF);
        
    }
    
}
