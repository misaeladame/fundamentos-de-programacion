package problema17;

import java.util.Scanner;

public class Problema17 {

    public static void calcSal(String dia,String turno,float horas)
    {
        float tar=0,aum=0,tarreal,salario;
        switch(turno)
        {
            case "matutino": tar=50;
                break;
            case "vespertino": tar=60;
                break;
            case "nocturno": tar=80;
                break;
        }
        if(dia.equals("domingo"))
        {
            if (tar==50||tar==60)
            {
                aum = 0.05f;
            }
            else
                aum = 0.10f;
        }
        tarreal=tar+(tar*aum);
        salario = tarreal*horas;
        System.out.println("Su salario de este día es: $"+salario);
       
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dia,turno;
        float horas;
        System.out.println("Turno en que trabaja: ");
        turno = leer.next();
        System.out.println("Día de la semana: ");
        dia = leer.next();
        System.out.println("Horas trabajadas: ");
        horas = leer.nextFloat();
        calcSal(dia,turno,horas);
        
    }
    
}