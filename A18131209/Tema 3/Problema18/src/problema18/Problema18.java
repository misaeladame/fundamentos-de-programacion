package problema18;

import java.util.Scanner;

public class Problema18 {

    public static void fecha(int mes, int dia, int año)
    {
        String fechames="";
        boolean flag=true;
        switch(mes)
        {
            case 1:fechames="Enero";
                break;
            case 2:fechames="Febrero";
                break;
            case 3:fechames="Marzo";
                break;
            case 4:fechames="Abril";
                break;
            case 5:fechames="Mayo";
                break;
            case 6:fechames="Junio";
                break;
            case 7:fechames="Julio";
                break;
            case 8:fechames="Agosto";
                break;
            case 9:fechames="Septiembre";
                break;
            case 10:fechames="Octubre";
                break;
            case 11:fechames="Noviembre";
                break;
            case 12:fechames="Diciembre";
                break;
            default:
                flag=false;
                    break;
        }
        
        if ((mes==2&&dia>28&&año%4!=0)||(mes==2&&dia>29&&año%4==0)||(mes==4&&dia>30)||(mes==6&&dia>30)||(mes==9&&dia>30)||(mes==11&&dia>30)||(dia>31||dia<1))
        {
            flag=false;
        }
        if (flag==true)
        {
            if (año<10)
            {
                System.out.println(fechames+" "+dia+" "+"del 200"+año);
            }
            else
                System.out.println(fechames+" "+dia+" "+"del 20"+año);
        }
        else
            System.out.println("Fecha no válida");
                
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia,mes,año;
        System.out.println("Introduzca la fecha con el formato MM DD AA: ");
        mes = leer.nextInt();
        dia = leer.nextInt();
        año = leer.nextInt();
        fecha(mes,dia,año);
        
    }
    
}