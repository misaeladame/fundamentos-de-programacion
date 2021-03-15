/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema3 {

    public static boolean esPrimo (int n)
    {
        int i, c=0, res;
        boolean sino = false;
        for(i=1; i<-n; i++)
        {
            res = n%i;
            if(res==0)
                c++;
        }
        if(c==2)
            sino = true;
        return sino;
    }
    
    public static int[] nosPrimos(int cnp)
    {
        int c = 0, i = 1;
        boolean resp;
        int[] nP = new int[cnp];
        do
        {
            resp = esPrimo (i);
            if(resp)
            {
                nP[c]=i;
                System.out.println(nP[c]);
                c++;
            }
            i++;
        }
        while(c <= cnp);
        return(nP);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cnp;
        System.out.print("Cuantos numeros primos: ");
        cnp = leer.nextInt();
        int [] numP = new int[cnp];        
        numP = nosPrimos(cnp);
        int i;
        for(i = 0; i< cnp; i++)
            System.out.println(numP[i]);
    }
    
}
