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


    public static double Factorial (double n)
    {   
        double fac = 1;
        int i;
        for(i = 1; i<=n; i++)
            fac = fac * i;
        return(fac);
    }    
    
    public static double SerieEuler (double x, double n)
    {
        double seuler = 0, i = 0, j = 0;
        do
        {
            seuler += ((Math.pow(x, i))/Factorial(j));
            i++;
            j++;
        }
        while(i<=n);    
        return(seuler);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        double x = leer.nextDouble();
        System.out.print("Ingrese el valor de n (mayor a 20): ");
        double n = leer.nextDouble();
        if(n>20)
        {
            double seuler = SerieEuler(x,n);
            System.out.println("La suma de la serie de Euler es de " +seuler);
        }
        else
        {
            System.out.println("ERROR: Ingrese un n mayor a 20.");
        }
    }
    
}
