package problema2;

import java.util.Scanner;

public class Problema2 {
    
    public static String ObtenerTipo (int numero)
    {
        String respuesta="";
        if(numero>0)
            respuesta="positivo";
        if(numero<0)
            respuesta="negativo";
        if(numero == 0)
            respuesta="cero";
        return(respuesta);
    }

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int numero;
        String respuesta;
        System.out.print("Introduzca un número: ");
        numero = leer.nextInt();
        respuesta = ObtenerTipo(numero);
        System.out.println("El numero " +numero +" es " +respuesta);
    }
    
}
