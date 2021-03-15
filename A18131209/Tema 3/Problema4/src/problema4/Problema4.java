package problema4;

import java.util.Scanner;

public class Problema4 {
    
    public static String ObtenerEdad (int edad)
    {
        String resp = "";
        if(edad>=18)
            resp = "ES MAYOR DE EDAD";
        if(edad<18)
            resp = "ES MENOR DE EDAD";
        return(resp);
    }

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int edad;
        String resp;
        System.out.print("Ingrese la edad de la persona: ");
        edad = leer.nextInt();
        
        resp = ObtenerEdad(edad);
        
        System.out.println("La persona " +resp);
    }
    
}
