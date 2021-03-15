/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema11 {
    
    public static void Fibonacci (int n)
    {
        int n1 = 0, n2 = 1, n3;
        if(n>0)
        {
            System.out.print(n2+" ");
            for(int i = 1; i<n; i++)
            {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(n3+" ");
            }
        }
        else
            System.out.println("ERROR");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el N números de la secuencia de Fibonacci: ");
        int n = leer.nextInt();
        Fibonacci(n);
        
    }
    
}
