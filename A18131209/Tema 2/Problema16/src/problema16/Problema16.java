/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema16;

import java.util.Scanner;
/**
 *
 * @author aa434
 */
public class Problema16 {
    
    public static void main (String[] args) 
    {
        int num1;
        num1 = leerEntero();
        double raiz;
        raiz = raizCuadrada(num1);
        mostrar(num1, raiz);
    }
    
    public static int leerEntero()
    {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número entero: ");
        num = leer.nextInt();
        return(num);
    }
    
    public static double raizCuadrada(int num)
    {
        double raiz = Math.sqrt(num);
        return raiz;
    }
    
    public static void mostrar(int num, double resp)
    {
        System.out.println(" La raíz cuadrada de " +num +" = " +resp);
    }
    
}
