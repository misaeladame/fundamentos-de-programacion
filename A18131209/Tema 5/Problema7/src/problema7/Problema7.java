/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema7 {

    public static int Promedio (int n, int [] nums) 
    {
        // Proceso para calcular el promedio
        int suma = 0;
        for(int i=0; i<n; i++)
        {
            suma += nums[i];
        }
        int promedio = suma/n;
        return(promedio);
    }
    
    public static void main(String[] args) 
    {
      
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**PROGRAMA PARA DETERMINAR EL PROMEDIO DE N NUMEROS**\n");
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
        int promedio = Promedio(n, nums);
        // Salida del promedio
        System.out.println("El promedio es: " +promedio);
        
        
        
    }
    
}
