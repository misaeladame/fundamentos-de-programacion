package problema19;

import java.util.Scanner;

public class Problema19 {

    public static float calcDesc(int per)
    {
        float desc,tot,resta;
        final float ins = 4000;
        switch(per)
            {
            case 1:desc = 0;
                break;
            case 2:desc = 0.02f;
                break;
            case 3:desc = 0.05f;
                break;
            case 4:desc = 0.10f;
                break;
            default:desc = 0.15f;         
                break;
            }
        resta = 800*desc;
        tot = ins+(800-resta);
        return tot;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int per;
        float tot;
        System.out.println("N°de personas inscritas: ");
        per = leer.nextInt();
        tot = calcDesc(per);
        System.out.println(tot);
        
    }
    
}

    
