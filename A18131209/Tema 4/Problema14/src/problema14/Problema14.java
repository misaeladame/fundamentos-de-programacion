/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema14;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema14 {

    public static double Factorial (double n)
    {   
        double fac = 1;
        int i;
        for(i = 1; i<=n; i++)
            fac = fac * i;
        return(fac);
    }
    
    public static double sseno (double x, double n)
    {
        double ssin = 0, i = 1, j = 1, sig = 1;
        do
        {
            ssin += ((Math.pow(x, i))/Factorial(j))*sig;
            i+=2;
            j+=2;
            sig = sig*(-1);
        }
        while(i<=n);
        return(ssin);
    }
    
    public static double scoseno (double x, double n)
    {
        double scos = 0, i = 0, j = 0, sig = 1;
        do
        {
            scos += (Math.pow(x, i)/Factorial(j))*sig;
            i+=2;
            j+=2;
            sig = sig*(-1);
        }
        while(i<=n);
        return(scos);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        double x = leer.nextDouble();
        System.out.print("Ingrese el valor de n: ");
        double n = leer.nextDouble();
        double xrad = (x * Math.PI) / 180;
        
        double ssin = sseno(xrad, n);
        double scos = scoseno(xrad, n);
        
        System.out.println("La suma de la serie del seno es de: " +ssin);
        System.out.println("La suma de la serie del coseno es de: " +scos);
        
    }
    
}
