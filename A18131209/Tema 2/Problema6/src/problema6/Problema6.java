/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float num1, num2, suma, res, mult, divisionReal, raiz1, raiz2;
        // Leer datos
        System.out.print("**PROGRAMA DE OPERACIONES ARITMETICAS**\n\n");
        System.out.print("Ingrese el número 1: ");
        num1 = leer.nextFloat();
        System.out.print("Ingrese el número 2: ");
        num2 = leer.nextFloat();
        
        suma = calcularSuma(num1, num2);
        res = calcularResta(num1, num2);
        mult = calcularMultiplicacion(num1, num2);
        divisionReal = calcularDivisionReal(num1, num2);
        raiz1 = calcularRaizNum1(num1);
        raiz2 = calcularRaizNum2(num2);
        
        // Mostrar resultados
        System.out.println(num1 +" + " +num2 +" = " +suma);
        System.out.println(num1 +" - " +num2 +" = " +res);
        System.out.println(num1 +" x " +num2 +" = " +mult);
        System.out.println(num1 +" / " +num2 +" = " +divisionReal);
        System.out.println("La raiz cuadrada del primer numero es " +raiz1);
        System.out.println("La raiz cuadrada del segundo numero es " +raiz2);
    }
    
    public static float calcularSuma (float num1, float num2)
    {
        float suma;
        suma = num1 + num2;
        return(suma);
    }
    
    public static float calcularResta (float num1, float num2)
    {
        float res;
        res = num1 - num2;
        return(res);
    }
    
    public static float calcularMultiplicacion (float num1, float num2)
    {
        float mult;
        mult = num1 * num2;
        return(mult);
    }
    
    public static float calcularDivisionReal (float num1, float num2)
    {
        float divisionReal;
        divisionReal = num1 / num2;
        return(divisionReal);
    }
    
    public static float calcularRaizNum1 (float num1)
    {
        float raiz1;
        raiz1 = (float) sqrt(num1);
        return(raiz1);
    }
    
    public static float calcularRaizNum2 (float num2)
    {
        float raiz2;
        raiz2 = (float) sqrt(num2);
        return(raiz2);
    }


    
       
}

