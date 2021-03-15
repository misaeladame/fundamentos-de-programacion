package problema11;

import java.util.Scanner;

public class Problema11 {

    public static void NuevoSueldo (float sueldoAct)
    {
        float nuevoSuel;
        if(sueldoAct<=5000)
        {
            nuevoSuel = (float) (sueldoAct+(sueldoAct*0.05));
            System.out.println("Su sueldo nuevo es de " +nuevoSuel);
        }
        else if(sueldoAct>5000 && sueldoAct<10000) 
        {
            nuevoSuel = (float) (sueldoAct+(sueldoAct*0.035));
            System.out.println("Su sueldo nuevo es de " +nuevoSuel);
        }        
        else
        {
            nuevoSuel = (float) (sueldoAct+(sueldoAct*0.03));
            System.out.println("Su sueldo nuevo es de " +nuevoSuel);
        }
    }   
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        float sueldoAct;
        System.out.print("Ingrese su sueldo actual: ");
        sueldoAct = leer.nextFloat();
        NuevoSueldo(sueldoAct);
    }
    
}
