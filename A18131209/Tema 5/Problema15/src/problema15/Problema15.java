/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema15;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema15 {

    public static int MayorPromedioPeso (float[] peso)
    {
        float suma = 0;
        int MayorPeso = 0;
        for(int i = 0; i < 3; i++)
        {
            suma += peso[i];
        }
        float promedio = suma/3;
        for(int i = 0; i < 3; i++)
        {
            if(peso[i]>promedio)
            {
                MayorPeso++;
            }
        }
        return(MayorPeso);
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("**PROGRAMA PARA DETERMINAR CUANTOS ALUMNOS PESAN MAS QUE EL PROMEDIO DEL GRUPO**");
        float [] peso = new float [3];
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Ingrese el peso del alumno " +(i+1));
            peso[i] = leer.nextFloat();
        
        }
        int MayorPeso = MayorPromedioPeso(peso);
        System.out.println("El numero de alumnos que tienen un mayor peso que el promedio son " +MayorPeso);

    }
    
}
