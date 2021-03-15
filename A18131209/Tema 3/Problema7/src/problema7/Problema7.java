package problema7;

import java.util.Scanner;

public class Problema7 {
    
    public static void CalcularPrecioT (float lar, float anc, float precioxm)
    {
        float area, ptotal, ptotaldesc;
        area = lar*anc;
        ptotal = area*precioxm;
        
        if(area<500)
        {
            System.out.println("El terreno le costará " +ptotal);
        }
        if(area>=500 && area<1000)
        {
            ptotaldesc = (float) (ptotal-(ptotal*0.15));
            System.out.println("El terreno con 15% de descuento le costará " +ptotaldesc);     
        }
        if(area>=1000)
        {
            ptotaldesc = (float) (ptotal-(ptotal*0.25));
            System.out.println("El terreno con 25% de descuento le costará " +ptotaldesc);
        }
    }        
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        float lar, anc, precioxm;
        System.out.print("Ingrese en metros el largo del terreno: ");
        lar = leer.nextFloat();
        System.out.print("Ingrese en metros el ancho del terreno: ");
        anc = leer.nextFloat();
        System.out.print("Ingrese el costo de cada metro cuadrado: ");
        precioxm = leer.nextFloat();
        
        CalcularPrecioT(lar, anc, precioxm);
    }
    
}
