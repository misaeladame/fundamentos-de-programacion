/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author HP OMEN
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("De cuantos alumnos leer las calificaciones? (Base 100) ");
        int nAlumnos= sc.nextInt();
        float calif[][] = new float [nAlumnos][6];
        for (int i = 0; i < nAlumnos; i++) {
            for (int j = 0; j < 6; j++) {
            System.out.println("Ingresa la calificacion " + (j+1));
            calif[i][j] = sc.nextFloat();
        }
            if ((i+1) == nAlumnos) {
                break;
            }
            System.out.println("Siguiente Alumno");
        }
        
        numAprobados(nAlumnos,calif);
        
    }
    
    public static void numAprobados(int nAlumnos, float calif[][])
    {
        int aprobados = 0;
        float suma = 0;
        float prom = 0;
        for (int i = 0; i < nAlumnos; i++) {
            for (int j = 0; j < 6; j++) {
              suma+= calif[i][j];
                
            }
            prom = suma / 6;
            if (prom > 69) {
                    aprobados++;
                }
        }
        System.out.println("La cantidad de alumnos reprobados es: " + aprobados);
    }
    
}
