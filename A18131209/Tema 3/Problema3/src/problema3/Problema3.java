package problema3;

import java.util.Scanner;

public class Problema3 {
    
    public static String ObtenerResp (int num)
    {
        String resp = "";
        if(num%3== 0)
            resp = "es multiplo de 3";
        if(num%3 !=0 )
            resp = "no es multiplo de 3";
        return(resp);
    }

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int num;
        String resp;
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        
        resp = ObtenerResp(num);
        
        System.out.println("El numero " +num +" " +resp);
    }
}
    
    

