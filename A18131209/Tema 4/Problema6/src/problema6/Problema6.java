/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema6 {

    public static void Claves ()
    {
        System.out.println("1.- CIVIL");
        System.out.println("2.- INDUSTRIAL");
        System.out.println("3.- BIOLOGIA");
        System.out.println("4.- INFORMATICA");
        System.out.println("5.- ELECTRONICA");
        System.out.println("6.- MECANICA");
        System.out.println("7.- SISTEMAS");
    }
    public static void AlumnosSistemas ()
    {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int a = 1, as = 0;
        while(a<=10) 
        {
            System.out.println("Ingrese su nombre alumno " +a +" : ");
            nombre = leer.next();
            System.out.println("Ingrese su carrera (en base a la clave): ");
            int carrera = leer.nextInt();
            System.out.println("Ingrese su semestre: ");
            int semestre = leer.nextInt();
            if(carrera==7 && semestre==4)
            {
                as++;
                System.out.println("El alumno " +nombre +" estudia SISTEMAS y en 4to semestre");
            }
            a++;
        }
        System.out.println("El número de alumnos que estudian SISTEMAS y están en 4to semestre son: " +as);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Claves();
        AlumnosSistemas();
    }
    
}
