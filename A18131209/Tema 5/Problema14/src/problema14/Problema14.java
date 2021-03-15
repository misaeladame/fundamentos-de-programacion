/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema14;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema14 {

    public static void Menor_MayorDe23 (int [] edades)
    {
        int MenorDeEdad = 0, MayorDe23 = 0;
        for(int i=0; i<35; i++)
        {
            if(edades[i]<18)
            {
                MenorDeEdad++;
            }
            if(edades[i]>23)
            {
                MayorDe23++;
            }
        }
        System.out.println("La cantidad de alumnos que son menores de edad son: " +MenorDeEdad);
        System.out.println("La cantidad de alumnos que tienen mas de 23 años son: " +MayorDe23);
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("**PROGRAMA PARA ENCONTRAR QUE ALUMNOS SON MENORES DE EDAD Y MAYORES DE 25**");
        int [] edades = new int [35];
        for(int i = 0; i < 35; i++)
        {
            System.out.println("Ingrese la edad del alumno " +(i+1));
            edades[i] = leer.nextInt();
        }
        Menor_MayorDe23(edades);
        
    }
    
}
