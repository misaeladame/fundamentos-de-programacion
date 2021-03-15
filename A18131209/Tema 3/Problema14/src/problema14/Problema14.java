package problema14;

import java.util.Scanner;

public class Problema14 {
    
    public static String EstadoAlumno (float calif1, float calif2, float calif3)
    {
        String mens="";
        float suma, prom;
        suma = calif1 + calif2 + calif3;
        prom = suma/3;
        if(prom<70)
            mens = "No acreditado.";
        else if(prom>=70 && prom<=79)
            mens = "Regular.";
        else if(prom>=80 && prom<=89)
            mens = "Bien.";
        else if(prom>=90 && prom<=99)
            mens = "Sibresaliente.";
        if(prom==100)
            mens = "Excelente.";
        return(mens);
    }

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String mens;
        float calif1, calif2, calif3;
        System.out.print("Ingrese la calificacion 1: ");
        calif1 = leer.nextFloat();
        System.out.print("Ingrese la calificacion 2: ");
        calif2 = leer.nextFloat();
        System.out.print("Ingrese la calificacion 3: ");
        calif3 = leer.nextFloat();
        
        mens = EstadoAlumno(calif1, calif2, calif3);
        
        System.out.println("El estado del alumno es: " +mens );
    }
    
}
