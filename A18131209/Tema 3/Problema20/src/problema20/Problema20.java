package problema20;

import java.util.Scanner;

public class Problema20 {

    public static void clasif(String hom, int edad,float peso,float estatura)
    {
    if (hom.equals("hombre")||hom.equals("mujer"))
    {
        if (edad>21)
        {
            if (((hom.equals("hombre") && (edad<=40&&peso<=90&&estatura>=1.8f)))||(hom.equals("mujer")&&edad<=35&&estatura>=1.7f))
            {
                System.out.println("Futuro policía.\nMuchas gracias.");                    
            }
            else
                System.out.println("Rechazado.\nMuchas gracias.");
        }
        else
            System.out.println("Rechazado.\nMuchas gracias.");
    }
    else
            System.out.println("Error: Género no especificado");
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String hom;
        int edad;
        float peso,estatura;
        System.out.println("Introduzca si es hombre o mujer(favor de usar minúsculas): ");
        hom = leer.next();
        System.out.println("Introduzca su edad: ");
        edad = leer.nextInt();
        System.out.println("Introduzca su peso: ");
        peso = leer.nextFloat();
        System.out.println("Introduzca su estatura en metros: ");
        estatura = leer.nextFloat();
        clasif(hom,edad,peso,estatura);
        
        
    }
    
}
