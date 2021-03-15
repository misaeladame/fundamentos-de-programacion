package problema9;

import java.util.Scanner;

public class Problema9 {

    public static String TipoTriangulo(float la1, float la2, float la3)
    {
        String tipotri="";
        if(la1==la2 && la2==la3)
            tipotri="equilatero";
        else if(la1 != la2 && la2 != la3 && la1 != la3)
            tipotri="escaleno";
        else
            tipotri="isosceles";
        return(tipotri);
    }
    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String tipotri;
        float la1, la2, la3;
        System.out.print("Ingrese el lado 1 del triangulo: ");
        la1 = leer.nextFloat();
        System.out.print("Ingrese el lado 2 del triangulo: ");
        la2 = leer.nextFloat();
        System.out.print("Ingrese el lado 3 del triangulo: ");
        la3 = leer.nextFloat();
        
        tipotri = TipoTriangulo(la1,la2,la3);
        System.out.println("El triangulo es de tipo " +tipotri);
    }
    
}
