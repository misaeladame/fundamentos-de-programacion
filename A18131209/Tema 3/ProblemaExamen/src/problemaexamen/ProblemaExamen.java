/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaexamen;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class ProblemaExamen {

    public static void CalcularMedia (int ncontrol, float exauno, float exados, float exatres)
    {
        float suma, media;
        suma = exauno + exados + exatres;
        media = suma/3;
        if(media >= 60)
        {
            if(media>=60 && media<70)
            {
                System.out.println("El alumno con No. de control " +ncontrol +" ha sacado " +media +" de calificacion. Ha pasado, pero esta en duda.");
            }
            else
            {
                System.out.println("El alumno con No. de control " +ncontrol +" ha sacado " +media +" de calificacion. Ha pasado.");
            }
        }
        else
        {
            System.out.println("El alumno con No. de control " +ncontrol +" ha sacado " +media +" no ha pasado.");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int ncontrol;
        float exauno, exados, exatres;
        System.out.print("Ingrese el número de control: ");
        ncontrol = leer.nextInt();
        System.out.print("Ingrese la calificacion del examen 1: ");
        exauno = leer.nextFloat();
        System.out.print("Ingrese la calificacion del examen 2: ");
        exados = leer.nextFloat();
        System.out.print("Ingrese la calificacion del examen 3: ");
        exatres = leer.nextFloat();
        
        CalcularMedia(ncontrol, exauno, exados, exatres);
        
    }
    
}
