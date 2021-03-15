/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema18;

import java.util.Scanner;

/**
 *
 * @author Terry
 */
public class Problema18 {

    public static int porcapital(int nc, int [][]datos)
    {
        int pcap, i, c=0;
        for (i =0; i<nc;i++)
        {
            if (datos[i][2]==1)
            {
                c++;
            }
        }
        pcap = c*100/nc;
        return(pcap);
    }
    public static int pormas18_25(int nc, int[][]datos)
    {
        int pmas, i ,c=0;
        for(i=0;i<nc;i++)
        {
            if (datos[i][1]==2)
            {
                if (datos[i][0]>=18 && datos[i][0]<=25)
                {
                    c++;
                }
            }
        }
        pmas = c*100/nc;
        return(pmas);
    }
    public static int porfem(int nc, int[][]datos)
    {
        int porfem, i, c =0;
        for(i=0;i<nc;i++)
        {
            if (datos[i][1]==1)
            {
                c++;
            }
        }
        porfem = c*100/nc;
        return(porfem);
    }
    public static int pormen25 (int nc, int[][]datos)
    {
        int c =0, i,pormen;
        for(i=0;i<nc;i++)
        {
            if (datos[i][0]<25)
            {
                c++;
            }
        }
        pormen = c*100/nc;
        return(pormen);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int c = 0, i, pmas, porfem, pormen, pcap;
        Scanner leer = new Scanner (System.in);
        int[][]datos = new int[3][3];
        String [] encabezado = {"Edad ", " Sexo (1) F (2) M: ", "Ciudad (1)Mex (2 Prov): "};
        String resp = "Si";
        do
        {
            for(i =0;i<3;i++)
            {
                System.out.print(encabezado[i]);
                datos [c][i] = leer.nextInt();
            }
            c++;
            System.out.print("Hay otro conductor: ");
            resp = leer.next();
        } 
        while(resp.contentEquals("Si"));
        pcap = porcapital(c,datos);
        pmas = pormas18_25(c,datos);
        porfem = porfem(c,datos);
        pormen = pormen25(c,datos);
        System.out.print("Edad sexo CD");
        for (i=0;i<c;i++)
        {
            for(int j=0;j<3;j++)
            { 
                System.out.print(datos[i][j]+ "   ");
            }
        }
        System.out.println("Porcentaje conductores menores de 25 años "+pormen+ "   ");
        System.out.println("Porcentaje de conductoras "+porfem+ "   ");
        System.out.println("Porcentaje de conductores entre 18 y 25 años "+pmas+ "   ");
        System.out.println("Porcentaje de conductores de la capital "+pcap+ "   ");
    }
}
