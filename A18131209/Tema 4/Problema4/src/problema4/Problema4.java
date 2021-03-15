/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema4 {

    public static void Estadistica ()
    {
        Scanner leer = new Scanner(System.in);
        int a = 1, napr = 0, nrep = 0;
        float suma = 0;
        while(a<=15) 
        {
            System.out.println("Ingrese la calificacion del alumno " +a);
            float calif = leer.nextFloat();
            if(calif>=70)
                napr++;
            else
                nrep++;
            a++;
            suma += calif;
        }
        float promedio = suma/15;
        System.out.println("El promedio del grupo es de " +promedio);
        System.out.println("El número de alumnos aprobados son: " +napr);
        System.out.println("El número de alumnos reprobados son: " +nrep);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estadistica();
    }
}
