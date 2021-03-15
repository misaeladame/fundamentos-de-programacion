/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema9 {

    public static int Acreditacion (int alumnos, int [] califs) 
    {
        // Proceso para calcular las personas que acreditaron la materia
        int  acreditados = 0;
        for(int i=0; i<alumnos; i++)
        {
            if(califs[i]>=70)
            {
                acreditados++;
            }
        }
        return(acreditados);
    }
    
    public static void main(String[] args) 
    {
      
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**PROGRAMA PARA DETERMINAR CUANTOS ALUMNOS ACREDITARON LA MATERIA**\n");
        // Ingresa las n personas
        System.out.println("Ingrese el numero de alumnos que hay en la materia: ");
        int alumnos = leer.nextInt();
        // La declaración del arreglo
        int [] califs = new int [alumnos];
        // Entrada de datos
        for(int i = 0; i<alumnos; i++)
        {
            System.out.println("Ingrese la calificacion del alumno " +(i+1));
            califs[i] = leer.nextInt();
        }
        // Llamado al método
        int acreditados = Acreditacion(alumnos, califs);
        // Salida de las personas qiue son menores de edad
        System.out.println("El número de alumnos que acreditaron la materia: " +acreditados);
    }   
}