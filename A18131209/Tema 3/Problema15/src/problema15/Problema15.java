package problema15;

import java.util.Scanner;

public class Problema15  {
    
    public static int numSalida(char letra)
    {
        int num = 0;
        switch(letra)
        {
            case 'a':case 'b': case 'c':num = 2;
            break;
            
            case 'd':case 'e': case 'f':num = 3;
            break;
            
            case 'g':case 'h': case 'i':num = 4;
            break;
            
            case 'j':case 'k': case 'l':num = 5;
            break;
            
            case 'm':case 'n': case 'o':num = 6;
            break;
            
            case 'p':case 'q': case 'r': case 's': num = 7;
            break;
            
            case 't':case 'u': case 'v':num = 8;
            break;
            
            case 'w':case 'x': case 'y':case 'z':num = 9;
            break;
            
            default: num = -1;
            break;
        }
        return(num);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer  = new Scanner(System.in);
        char letra;
        System.out.print("Introduzca una letra: ");
        letra = leer.next().charAt(0);
        int num = numSalida(letra);
        
        if(num > 0)
            System.out.println("La letra " +letra +" corresponde al numero " +num);
        else
            System.out.println("Error en el dato de entrada");
    }
}
