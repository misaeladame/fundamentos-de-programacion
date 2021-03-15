/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema12;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema12 {

    public static double Serie(float x, int n) 
    {
        double suma = 1;
        int i = 1, j = 1, sig = -1;   
        do
        {
            suma += ((Math.pow(x, i))/j)*sig;
            i++;
            j+=2;
            sig = sig*(-1);
        }
        while(i<=n);
        return(suma);
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float x;
        int n;
        double suma;
        System.out.print("Ingrese el valor de x: ");
        x = leer.nextFloat();
        System.out.print("Ingrese el valor de n: ");
        n = leer.nextInt();
        suma = Serie(x, n);
        System.out.println("La suma de la serie es " +suma);
    }
    
}
