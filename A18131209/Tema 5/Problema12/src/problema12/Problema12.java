/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema12;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema12 {

    public static float SumaMayorColumna (int columnas, int elementos, float [][] matriz)
    {
        float []sumas_c = new float[elementos];
        float suma;
        for(int c=0; c<columnas; c++)
        {
            suma = 0;
            for (int f=0; f<elementos; f++)
            {
                suma += matriz[f][c];
            }
            sumas_c[c]=suma;
            System.out.println("Suma de Columna "+(c+1) +": "+sumas_c[c]);
        }
        float mayor=0;
        for (int a=0; a<elementos; a++)
        {
            if (a==0)
            {
                mayor=sumas_c[a];
            }
            if(sumas_c[a]>mayor)
            {
                mayor=sumas_c[a];
            }
        }
        return(mayor);
        
    }  
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        // Titulo del programa
        System.out.println("**PROGRAMA PARA DETERMINAR CUAL ES LA SUMA MAYOR DE UNA COLUMNA DE UNA  MATRIZ**");
        // Donde se ingresan las n columnas
        System.out.println("Ingresa el número de columnas de la matriz: ");
        int columnas = leer.nextInt();
        // Donde se ingresan la cantidad de elementos de cada columna
        System.out.println("Ingresa el número de elementos que tendrá cada columna: ");
        int elementos = leer.nextInt();
        float [][] matriz = new float [elementos][columnas];
        for(int i = 0; i<columnas; i++)
        {
            System.out.println("Columna " +(i+1));
            for(int j = 0; j<elementos; j++)
            {
                System.out.println("Ingrese el elemento " +(j+1));
                matriz[j][i] = leer.nextInt();
            }
        }
        float mayor = SumaMayorColumna(columnas, elementos, matriz);
        System.out.println("La suma mayor es: " +mayor);
        
    }
}
