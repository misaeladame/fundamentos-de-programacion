/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema13;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema13 {

    public static int VecesAscender (float peso[])
    {
        float suma = 0;
        for(int i=0; i<20; i++)
        {
            suma += peso[i];
        }
        float veces = (suma/300)+1;
        return(int)(veces);
        
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**CALCULAR CUANTAS SE NECESITA ELEVAR EL ELEVADOR**");
        // Declaracion del arreglo
        float peso [] = new float[20];
        // Entrada de Datos
        for(int i = 0; i<20 ; i++)
        {
            System.out.println("Ingrese el peso de la persona " +(i+1));
            peso[i] = leer.nextFloat(); 
        }
        int veces = VecesAscender (peso);
        System.out.println("Las veces que tendrá que ascender el ascensor son " +veces);
        
    }
    
}
