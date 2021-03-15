package problema8;

import java.util.Scanner;

public class Problema8 {

    public static String EtapaDeVIda (int edad)
    {
        String resp="";
        if(edad<5)
            resp="BEBE";
        else if(edad>=5 && edad<=12)
            resp="NIÑO";
        else if(edad>=13 && edad<=18)
            resp="ADOLESCENTE";
        else if(edad>=19 && edad<=25)
            resp="JOVEN";
        else if(edad>25)
            resp="ADULTO";
        return(resp);
    }
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String resp;
        int edad;
        System.out.print("Ingresa ti edad: ");
        edad = leer.nextInt();
        
        resp = EtapaDeVIda (edad);
        System.out.println("Usted es un " +resp);
    }
}
