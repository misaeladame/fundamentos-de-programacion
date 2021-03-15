/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema14;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        int num = 0, d1, d2;
        // Leer datos
        System.out.print("**NUMERO INVERTIDO**\n\n");
        System.out.print("Ingresa un número de dos digitos: ");
        num = leer.nextInt();
        
        d1 = Dig1(num);
        d2 = Dig2(num);
        
        // Muestra resultado
        System.out.println("El número invertido es " +d2 +d1);
        
    }
    
    public static int Dig1 (int num)
    {
        float d1;
        d1 = num / 10;
        return(int) (d1);
    }
    
    public static int Dig2 (int num)
    {
        float d2;
        d2 = num % 10;
        return(int) (d2);
    }
}
