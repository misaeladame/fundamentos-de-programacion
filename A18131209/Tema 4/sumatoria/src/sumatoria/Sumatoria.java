/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

import java.util.Scanner;
/**
 *
 * @author aa415
 */
public class Sumatoria {
    
    public static int factorial(int n)
    {
        int fac = 1, i = 1;
        while (i<=n) 
        {
            fac *= i; // fac = fac * i;
            i++; //  i = i + 1
        }
        return(fac);
    }
    public static int sumatoria(int n)
    {
        int suma = 0, i=0;
        while(i<n)
        {
            i++; // i = i + 1;
            suma = suma + i; // suma +=1;
            System.out.println("valor de i: " +i +" Valor de la suma " +suma);
        }
        return(suma);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, suma, fac;
        System.out.print("Introduzca el limite de la sumatoria: ");
        n = leer.nextInt();
        suma = sumatoria(n);
        fac = factorial(n);
        System.out.println("La suma de la serie es = " +suma);
        System.out.println("el factorial de " +n +" = " +fac);
    }
    
}
