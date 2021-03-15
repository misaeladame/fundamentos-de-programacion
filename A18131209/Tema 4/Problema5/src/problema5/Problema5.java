/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;



/**
 *
 * @author Terry
 */
public class Problema5 {
    
    public static void Estadistica ()
    {
        Scanner leer = new Scanner(System.in);
        int na = 0, nap = 0, nre = 0, promedio, suma = 0, calif = 0;
        while(calif>=0)
        {
            System.out.print("Introduzca Calif. (para terminar Calif negativa): ");
            calif = leer.nextInt();
            if(calif>=0) 
            {
                na++;
                if(calif>=70)
                    nap++;
                else
                    nre++;
                suma += calif;
                          
            }
        }
        promedio = suma/na;
        
        System.out.println("Promedio general: " +promedio);
        System.out.println("Alumnos aprobados: " +nap);
        System.out.println("Alumnos reprobados: " +nre);
        System.out.println("Total de los alumnos: " +na);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estadistica();
    }
    
}
