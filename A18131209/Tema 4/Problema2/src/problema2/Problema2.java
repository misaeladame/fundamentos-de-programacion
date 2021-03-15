/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema2 {
    
    public static float Promedioedad (float np)
    {
        Scanner leer = new Scanner(System.in);
        int c = 0;
        float suma = 0, edad, pe;
        while(c<np)
        {
            c = c+1;
            System.out.println("Introduce la edad del jugador número " +c);
            edad = leer.nextFloat();
            suma = suma + edad;
        }
        pe = suma/np;
        return(pe);
    }
    
    public static float PromedioPeso (float np)
    {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        float s = 0, peso, pp;
        while(i<np)
        {
            i = i+1;
            System.out.println("Introduce el peso del jugador número " +i);
            peso = leer.nextFloat();
            s = s + peso;
        }
        pp = s/np;
        return(pp);
    }
    
    public static void main (String[] args)
    {
        Scanner leer = new Scanner(System.in);
        float np, pe, pp;
        System.out.print("Introduce el número de personas del equipo: ");
        np = leer.nextFloat();
        pe = Promedioedad(np);
        pp = PromedioPeso(np);
        System.out.println("El promedio de edad del equipo es de " +pe);
        System.out.println("El promedio de peso del equipo es de " +pp);
    }
}
