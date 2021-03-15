/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema6 {
    
    public static int Mayor (int n, int [] nums) 
    {
        // Proceso para calcular el número mayor
        int mayor = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>mayor)
            {
                mayor = nums[i];
            }
        }
        return(mayor);
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
            System.out.println("Ingrese el número " +(i+1));
            nums[i] = leer.nextInt();
        }
        // Llamado al método
        int mayor = Mayor(n, nums);
        // Salida del número mayor
        System.out.println("El número mayor es: " +mayor);       
    }
}
