/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema10 {

    public static int Menor (int n, int [] nums) 
    {
        // Proceso para calcular el número menor
        int menor = 0;
        for(int i=0; i<n; i++)
        {
            if(i==0)
            {
                menor = nums[i];
            }
            if(nums[i]<menor)
            {
                menor = nums[i];
            }
        }
        return(menor);
    }
    
    public static void main(String[] args) 
    {
      
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**PROGRAMA PARA DETERMINAR EL NUMERO MAYOR**\n");
        // Ingresa los n números
        System.out.println("Ingrese los números que desea ingresar: ");
        int n = leer.nextInt();
        // La declaración del arreglo
        int [] nums = new int [n];
        // Entrada de datos
        for(int i = 0; i<n; i++)
        {
            System.out.println("Ingresa el número " +(i+1));
            nums[i] = leer.nextInt();
        }
        // Llamado al método
        int menor = Menor(n, nums);
        // Salida del número menor
        System.out.println("El número menor es: " +menor);   
    }
}

