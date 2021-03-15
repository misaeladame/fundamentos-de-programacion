package problema1;

import java.util.Scanner;

public class Problema1 {
    
    public static String ObtenerTipo (int numero)
    {
        String respuesta="";
        if(numero%2 == 0)
            respuesta="par";
        if(numero%2 == 1)
            respuesta="impar";
        return(respuesta);
    }

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int numero;
        String respuesta;
        System.out.print("Ingrese un número: ");
        numero = leer.nextInt();
        respuesta = ObtenerTipo(numero);
        
        System.out.println("El numero " +numero +" es " +respuesta);
        
    }
    
}
