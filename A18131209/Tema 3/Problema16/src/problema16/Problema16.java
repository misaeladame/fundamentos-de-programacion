package problema16;

import java.util.Scanner;

public class Problema16 { 

    public static void calcularPrecio(int tipoCli,int cantLibros,float costoxlib, String nombre)
    {
        float desc, descLib,descTotal ,costoNeto, costoTotal,preciodesc,descad;
       
        switch(tipoCli)
        {
            case 1:desc=0.30f;
            break;
            case 2:desc=0.20f;
            break;
            case 3:desc=0.10f;
            break;
            default:desc=0;
            break;
        }
        if(cantLibros<=50)
            descLib = 0;
        else if (cantLibros<=100)
            descLib = 0.05f;
        else
            descLib = 0.10f;
        
        costoNeto=cantLibros * costoxlib;
        desc=costoNeto*desc;
        preciodesc = costoNeto-desc;
        descad = preciodesc*descLib;
        descTotal = desc+descad;
        costoTotal = costoNeto-descTotal;
        
        
        System.out.println(nombre);
        System.out.println("El precio sin descuento es: $"+costoNeto);
        System.out.println("Su descuento es: $"+String.format("%.2f",descTotal));
        System.out.println("Total a pagar: $"+costoTotal);
        
    }
    
    public static void main(String[] args) 
    {
            Scanner leer = new Scanner(System.in);
            String nombre;
            int cantLibros,tipoCli;
            float costoxlib;
            System.out.println("Introduzca su nombre: ");
            nombre = leer.next();
            System.out.println("Tipo de cliente: ");
            tipoCli = leer.nextInt();
            System.out.println("Cantidad de libros a comprar: ");
            cantLibros = leer.nextInt();
            System.out.println("Costo por libro: ");
            costoxlib = leer.nextFloat();
            
            calcularPrecio(tipoCli,cantLibros, costoxlib, nombre);
            
    }
    
}

