package problema13;

import java.util.Scanner;

public class Problema13 {

    public static String CalcularTemp(float temp)
    {
        String mens="";
        if(temp<=36.5)
            mens = "tiene hipotermia.";
        else if(temp>36.5 && temp<=37.0)
            mens = "esta sano.";
        else if(temp>37.0 && temp<=37.5)
            mens = "tiene fiebre leve.";
        else
            mens = "tiene fiebre severa.";
        return(mens);
    }
    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        float temp;
        String mens;
        System.out.print("Ingrese su temperatura: ");
        temp = leer.nextFloat();
        
        mens = CalcularTemp(temp);
        
        System.out.println("Usted " +mens);
    }
    
}
