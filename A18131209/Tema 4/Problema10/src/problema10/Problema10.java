/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema10 {
    
    public static int Sumatoria (int periodo)
    {
        int suma = 0, i;
        for(i = 1; i<=periodo; i++)
            suma += i;
        return(suma);
    }
    
    public static void Depreciacion (float valor, int periodo)
    {
        float depre;
        int suma, i;
        suma = Sumatoria(periodo);
        for (i=periodo; i>=1; i--)
        {
            depre = valor*i/suma;
            System.out.println("depre = " +depre);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float valor;
        int periodo;
        System.out.print("Introduce el valor actual del bien: ");
        valor = leer.nextFloat();
        System.out.print("Introduce el periodo en años: ");
        periodo = leer.nextInt();
        Depreciacion(valor, periodo);
    }
    
}
