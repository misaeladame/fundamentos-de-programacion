/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        int numero, suma;
        // Leer los datos
        System.out.print("**SUMA DE DIGITOS**\n\n");
        System.out.print("Inserte un numero de dos crifras para su sumatoria de digitos: ");
        numero = leer.nextInt();
        
        suma = CalcularSumDig(numero);
        
        // Mostrar resultado
        System.out.println("La suma de los digitos es: " +suma);
            
    }
    
    public static int CalcularSumDig (int numero)
    {
        int d1, d2, suma;
        d1 = numero/10;
        d2 = numero%10;
        suma = d1 + d2;
        return(suma);
    }
    
    
}
