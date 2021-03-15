/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema21;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema21 {

    public static float calcOpe(float num1,float num2, char op)
    {
        float operacion = 0;
        switch(op)
        {
            case '+': operacion = num1+num2;
                break;
            case '-': operacion = num1-num2;
                break;    
            case '*': operacion = num1*num2;
                break;    
            case '/': operacion = num1/num2;
                break;    
        }
        return operacion;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num1,num2,operacion=0;
        char op;
        boolean bandera=false;
        String respa="";
        System.out.println("Introduzca un número: ");
        num1 = leer.nextFloat();
        System.out.println("Introduzca un operador: ");
        op = leer.next().charAt(0);
        System.out.println("Introduzca otro número: ");
        num2 = leer.nextFloat();
        switch(op)
            {
                case '+':case'-':case'*':case'/':
                    if (op=='/' && num2 == 0)
                    {
                        respa = "No puede calcularse el denominador 0";
                    }
                    else
                    {
                        operacion = calcOpe(num1,num2,op);
                        bandera = true;
                    }
                    break;
                default: respa="Operación no reconocida";
                    break;
            }
        if (bandera)
        {
            System.out.println(num1+" "+op+" "+num2+" = "+operacion);
        }
        else 
            System.out.println(respa);
        
    }
    
}
