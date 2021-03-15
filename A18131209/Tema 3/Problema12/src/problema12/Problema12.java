package problema12;

import java.util.Scanner;

public class Problema12 {

    public static void CalcularMayor(int c1, int c2, int c3)
    {
        if(c1>c2 && c1>c3)
            System.out.println("EL NUMERO MAYOR ES " +c1);
        else if(c2>c1 && c2>c3)
            System.out.println("EL NUMERO MAYOR ES " +c2);
        else if(c3>c1 && c3>c2)
            System.out.println("EL NUMERO MAYOR ES " +c3);
    }
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int c1, c2, c3;
        System.out.print("Ingrese el primer numero: ");
        c1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        c2 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        c3 = leer.nextInt();
        
        CalcularMayor(c1,c2,c3);
        
    }
    
}
