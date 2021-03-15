/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;
/**
 *
 * @author Terry
 */
public class Problema1 {
    
    public static void Menu() 
    {
        System.out.println("a. Sumatoria de los números pares del 1 al 100");
        System.out.println("b. Todos los números impares mayores a 10 pero menores a 150");
        System.out.println("c. Todos los múltiplos de 5 mayores o iguales a 10 pero menores o iguales a 200");
        System.out.println("d. Ingresar 20 números y despliega el mayor");
        System.out.println("e. Ingresar 20 números y despliega el menor");
        System.out.println("f. Secuencia de números desde el 100 hasta el 1");
    }
    
    public static int A ()
    {
        int i = 1, suma = 0, res;
        while(i<=100)
        {
            res = i%2;
            if(res==0)
                suma = suma + i;
            i++;
        }
        return(suma);
    }
    
    public static void B ()
    {
        int i = 10;
        while(i<=150) 
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
            i++;
        }
    }
    
    public static void C ()
    {
        int mult = 10;
        while(mult<=200)
        {
            System.out.println(mult);
            mult += 5;
        }
    }
    
    public static int D ()
    {
        Scanner leer = new Scanner (System.in);
        int c = 1;
        double mayor = Double.NEGATIVE_INFINITY;
        while(c<=20)
        {
            System.out.println("Ingrese el entero No. " +c);
            int num = leer.nextInt();
            c++;
            if(num>mayor) 
            {
                mayor = num;  
            }
        }
        return(int)(mayor);
    }
    
    public static int E ()
    {
        Scanner leer = new Scanner (System.in);
        int c = 1;
        double menor = Double.POSITIVE_INFINITY;
        while(c<=20)
        {
            System.out.println("Ingrese el entero No. " +c);
            int num = leer.nextInt();
            c++;
            if(num<menor) 
            {
                menor = num;  
            }
        }
        return(int)(menor);
    }
    
    public static void F ()
    {
        int sec = 100;
        while(sec>=1)
        {
            System.out.println(sec);
            sec--;
        }
    }
    
    public static void Error ()
    {
        System.out.println("ERROR: Introduce una opción válida");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Menu();
        System.out.println("Introduce una opción: ");
        char opcion = leer.next().charAt(0);
        
        switch(opcion)
        {
            case 'a':
            int suma = A();
            System.out.println("La sumatoria de los pares del 1 al 100 es: " +suma);
            break;
            
            case 'b':
            B();
            break;
            
            case 'c':
            C();
            break;
            
            case 'd':
            int mayor = D();
            System.out.println("El número mayor es: " +mayor);
            break;
            
            case 'e':
            int menor = E();
            System.out.println("El número menor es: " +menor);
            break;
            
            case 'f':
            F();
            break;

            default:
            Error();  
            break;
        }
    }
    
}
