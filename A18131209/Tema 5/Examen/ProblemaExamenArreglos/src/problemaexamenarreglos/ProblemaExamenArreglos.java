/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaexamenarreglos;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class ProblemaExamenArreglos {
    
    // Método para sacar el promedio
    public static float Promedio (int meses, float[] toneladas)
    {
        // Proceso para la sumatoria de las toneladas por mes
        float suma = 0;
        for(int i=0; i<meses; i++)
        {
            suma += toneladas[i];
        }
        // Proceso para calcular el promedio
        float promedio = suma/meses;
        // Retorno de la variable promedio
        return(promedio);
    }
    
    //Método para calcular los meses en que hubo cosecha superior al promedio anual
    public static int CosechaSuperior (float promedio, int meses, float [] toneladas)
    {
        //Proceso para contar los meses
        int MesesMayores = 0;
        for(int i=0; i<meses; i++)
        {
            // Si las toneladas son mayor que el promedio se le suma a los Meses Mayores
            if(toneladas[i]>promedio)
            {
                MesesMayores++;
            }
        }
        // El retorno del metodo
        return(MesesMayores);
    }
    
    //Método para calcular los meses en que hubo cosecha superior al promedio anual
    public static int CosechaInferior (float promedio, int meses, float [] toneladas)
    {
        //Proceso para contar los meses
        int MesesMenores = 0;
        for(int i=0; i<meses; i++)
        {
            // Si las toneladas son mayor que el promedio se le suma a los Meses Mayores
            if(toneladas[i]<promedio)
            {
                MesesMenores++;
            }
        }
        // El retorno del metodo
        return(MesesMenores);
    }
    
    // 
    public static int MesMayorToneladas(int meses, float [] toneladas)
    {
        float MesMayor = 0, NumeroMesMayor = 0;
        for(int i=0; i<meses; i++)
        {
            if(toneladas[i]>MesMayor)
            {
                MesMayor = toneladas[i];
                NumeroMesMayor = i+1;
            }
        }
        return(int)(NumeroMesMayor);
    }
    
    
    // El método principal
    public static void main(String[] args) 
    {    
        Scanner leer = new Scanner(System.in);
        // Titulo del programa 
        System.out.println("**PROGRAMA DE TONELADAS COSECHADAS**");
        // Declaración del arreglo en donde son por meses
        int meses = 12;
        float [] toneladas = new float [meses];
        // Entrada donde se ingresan las toneladas cosechadas por mes
        for(int i=0; i<meses; i++)
        {
            System.out.println("Ingresa las toneladas cosechadas en el mes " +(i+1));
            toneladas[i] = leer.nextFloat();
        }
        // El llamado a los métodos
        float promedio = Promedio(meses, toneladas);
        int MesesMayores = CosechaSuperior(promedio, meses, toneladas);
        int MesesMenores = CosechaInferior(promedio, meses, toneladas);
        int NumeroMesMayor = MesMayorToneladas(meses, toneladas);
        // La salida de los datos de cada inciso
        System.out.println("El promedio anual de la cosecha fue: " +promedio);
        System.out.println("Los meses que superaron al promedio de la cosecha en el año fueron: " +MesesMayores );
        System.out.println("Los meses que hubo inferioridad en el promedio de la cosecha en el año fueron: " +MesesMenores);
        System.out.println("El mes en donde hubo mayor cosecha fue en el: " +NumeroMesMayor);
        
    }
}
