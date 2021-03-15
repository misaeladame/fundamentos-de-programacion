package problema6;

import java.util.Scanner;

public class Problema6 {
    
    public static void Invalidacion ()
    {
        System.out.println("UN CIRCULO NO PUEDE TENER RADIO NEGATIVO");
    }
    
    public static float CalcularArea(float radio)
    {
        float area;
        area = (float) (Math.PI *(Math.pow(radio,2)));
        return(area);
    }
    
    public static float CalcularPeri (float radio)
    {
        float perimetro;
        perimetro = (float) (Math.PI*(2*radio));
        return(perimetro);
    }
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        float area, perimetro, radio;
        System.out.print("Ingrese el radio del circulo: ");
        radio = leer.nextFloat();
        
        if(radio>=0)
        {
            area = CalcularArea(radio);
            perimetro = CalcularPeri(radio);
            
            System.out.println("El area del circulo es de " +area);
            System.out.println("El perimietro es de " +perimetro);
        }
        
        if(radio<0)
            Invalidacion();
    }
    
}
