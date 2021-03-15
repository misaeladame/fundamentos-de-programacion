package problema5;

import java.util.Scanner;

public class Problema5 {

    public static void ObtenerProm (String nombre, float c1, float c2, float c3)
    {
        float suma,prom;
        suma = c1+c2+c3;
        prom = suma/3;
        if(prom>=70)
            System.out.println("El alumno " +nombre +", ACREDITADO");
        if(prom<70)
            System.out.println("El alumno " +nombre +", NO ACREDITADO");
    }
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String nombre;
        float c1, c2, c3;
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese calificacion 1: ");
        c1 = leer.nextFloat();
        System.out.print("Ingrese calificacion 2: ");
        c2 = leer.nextFloat();
        System.out.print("Ingrese calificacion 3: ");
        c3 = leer.nextFloat();
        
        ObtenerProm(nombre, c1, c2, c3);
       
    }
    
}
