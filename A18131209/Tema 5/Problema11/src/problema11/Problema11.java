/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema11 {

    public static void OrdenAscendente (int n, int [] nums)
    {
        int i, k,j;
        for(i=0; i<n-1; i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    k = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=k;
                }
            }
        }
        System.out.println();
        for(i=0; i<n; i++)
        {
            System.out.println(nums[i]);
        }
    }
    
    public static void main(String[] args)
    {
        
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**PROGRAMA PARA ORDENAR NUMEROS DE FORMA ASCENDENTE**");
        // Ingresa los n números
        System.out.println("Ingresa los n números que desea ordenar: ");
        int n = leer.nextInt();
        // Declaracion del arreglo
        int [] nums = new int[n];
        // Entrada de datos
        for(int i=0; i<n; i++)
        {
            System.out.println("Ingresa el número " +(i+1));
            nums[i] = leer.nextInt();
        }
        // Llamar al método
        OrdenAscendente(n, nums);
    }
    
}
