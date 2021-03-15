/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema8 {

    public static int MenorDeEdad (int personas, int [] edad) 
    {
        // Proceso para calcular las personas que son menores de edad
        int  MenEdad = 0;
        for(int i=0; i<personas; i++)
        {
            if(edad[i]<18)
            {
                MenEdad++;
            }
        }
        return(MenEdad);
    }
    
    public static void main(String[] args) 
    {
      
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**PROGRAMA PARA DETERMINAR CUANTOS SON MENORES DE EDAD DE N PERSONAS**\n");
        // Ingresa las n personas
        System.out.println("Ingrese cuantas personas hay: ");
        int personas = leer.nextInt();
        // La declaración del arreglo
        int [] edad = new int [personas];
        // Entrada de datos
        for(int i = 0; i<personas; i++)
        {
            System.out.println("Ingrese la edad de la persona " +(i+1));
            edad[i] = leer.nextInt();
        }
        // Llamado al método
        int Menores = MenorDeEdad(personas, edad);
        // Salida de las personas que son menores de edad
        System.out.println("Hay " +Menores +" personas que son menores de edad.");
    }   
}