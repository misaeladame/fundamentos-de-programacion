/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author aa426
 */
public class Problema1 {
    
    public static int promedio(int na, int [] calif) 
    {
        int pro, k, suma = 0;
        for(k=0; k<na;k++)
            suma += calif[k];
        pro = suma/na;
        return(pro);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int na, i;
        System.out.print("Numero de alumnos: ");
        na = leer.nextInt();
        // declaracion de un arreglo de una dimension
        int [] calif = new int [na];
        System.out.println("Calificaciones del grupo: ");
        // entrada de datos
        for(i=0; i<na; i++)
            calif[i] = leer.nextInt();
        int pro = promedio(na, calif);
        for(int j=0; j<na; j++)
            System.out.print(calif[j]+ " ");
        System.out.println("promedio = " +pro);
    }
}
