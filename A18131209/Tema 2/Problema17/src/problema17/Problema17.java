/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema17;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        float libras, pies, kg, m;
        System.out.print("Ingresa el nombre del dinosaurio: ");
        nombre = leer.nextLine();
        System.out.print("Ingresa las libras: ");
        libras = leer.nextFloat();
        System.out.print("Ingrese los pies: ");
        pies = leer.nextFloat();
        
        kg = CalcularKg(libras);
        m = CalcularM(pies);
        
        System.out.println("El dinosaurio " +nombre +" pesa " +kg +" kg y su longitud es de " +m +" m.");
        
    }
    
    public static float CalcularKg (float libras)
    {
        float kg;
        kg = (float) (libras*0.453592);
        return(kg);
    }
    
    public static float CalcularM (float pies)
    {
        float m;
        m = (float) (pies * 0.3048);
        return(m);
    }
    
}
