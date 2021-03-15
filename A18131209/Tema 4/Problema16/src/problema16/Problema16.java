/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema16;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema16 {

    public static double Factorial (int n)
    {   
        double fac = 1;
        int i;
        for(i = 1; i<=n; i++)
            fac = fac * i;
        return(fac);
    }
    
    public static void CoefBino (int n) 
    {
        double CB;
        int j = 0;
        System.out.println("para n = " +n);
        System.out.println("J        Coef.Bin");
        do 
        {
            CB = Factorial(n)/(Factorial(n-j)*Factorial(j));
            System.out.println(j +"        "+CB);
            j++;
        }
        while(j <= n);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Valor de n: ");
        n = leer.nextInt();
        CoefBino(n);
    }
    
}
