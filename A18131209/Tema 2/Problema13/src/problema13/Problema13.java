/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema13;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // Declarar variables
        float dis, vel, lit, coslit = 0, tiempo, litcon, costvia;
        // Leer datos
        System.out.print("**COSTO DE VIAJE**\n\n");
        System.out.print("Ingrese la distancia: ");
        dis = leer.nextFloat();
        System.out.print("Ingrese la velocidad: ");
        vel = leer.nextFloat();
        System.out.print("Ingrese los litros que consume por km: ");
        lit = leer.nextFloat();
        System.out.print("Ingresa el costo por litro: ");
        coslit = leer.nextFloat();
        
        tiempo = CalcularTiempo(dis, vel);
        litcon = CalcularLitCon (dis, lit);
        costvia = CalcularCostoViaje (litcon, coslit);
        
        // Mostrar Resultados
        System.out.println("El tiempo fue de " +tiempo);
        System.out.println("Los litros consumidos fueron " +litcon +" L.");
        System.out.println("El costo de viaje fue de $" +costvia);
        
    }
    
    public static float CalcularTiempo (float dis, float vel)
    {
        float tiempo;
        tiempo = dis / vel;
        return(tiempo);
    }
    
    public static float CalcularLitCon (float dis, float lit)
    {
        float litcon;
        litcon = dis / (dis * lit);
        return(litcon);
    }
    
    public static float CalcularCostoViaje (float litcon, float coslit)
    {
        float costvia;
        costvia = litcon * coslit;
        return(costvia);
    }
}
