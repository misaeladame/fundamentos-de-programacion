/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema19;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    
    public static String [][] Leerdatos (int np)
    {
        Scanner teclado = new Scanner(System.in);
        String [][] datos = new String [np] [6];
        String titulo [] = {"Nombre: ", "Edad: ", "Sexo F o M : ", "Estatura: ", "Peso: ", "Tipo de Sangre: "};
        System.out.println("Introduzca los datos de los pacientes:");
        for(int i = 0; i<np; i++)
        {    
            System.out.println();
            for(int j=0; j<6; j++)
            {
                System.out.print(titulo[j]);
                datos[i][j] = teclado.next();
            }
        }
        return(datos);
    }
    
    public static int numeroMuj (int np, String[][] pacientes)
    {
        int cM = 0, i;
        String Mu = "F";
        for(i=0;i<np;i++)
        {
            if(Mu.contentEquals(pacientes[i][2]))
            {
                cM++;
            }
        }
        return(cM);
    }
    
    public static int edadPromedioH (int np, int nh, String [][] pa)
    {
        int edp, suma = 0, i;
        String ho = "M";
        for(i=0; i<np; i++)
        {
            if(ho.contentEquals(pa[i][2]))
            {
                suma = suma + Integer.valueOf(pa[i][1]);
            }
        }
        edp = suma / nh;
        return edp;
    }
    
    public static int tipoAhom (int np, String[][] pa)
    {
        int tah = 0, i;
        for(i=0; i<np; i++)
        {
            if(pa[i][2].contentEquals("M") && pa[i][5].contentEquals("A"))
            {
                tah++;
            }
        }
        return(tah);
    }
    
    public static int EdadPromedioGeneral (int np, String [][] pacientes)
    {
        int suma = 0;
        for(int i=0; i<np; i++)
        {
            suma = suma + Integer.valueOf(pacientes[i][2]);
        }
        int promedioEdadG = suma/np;
        return(promedioEdadG);
    }
  
    public static int PesoPromedioMujeres (int np, String [][] pacientes, int nmuj)
    {
        int suma = 0;
        String mujeres = "F";
        for(int i = 0; i < np; i++)
        {
            if(mujeres.contentEquals(pacientes[i][2]))
            {
                suma = suma + Integer.parseInt(pacientes[i][4]);
            }
        }
        int PromedioPM = suma/nmuj;
        return(PromedioPM);
    }
    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("No. de pacientes: ");
        int np = leer.nextInt();
        String[][] pacientes = new String [np][6];
        pacientes = Leerdatos(np);
        
        int nmuj = numeroMuj(np, pacientes);
        int nh = np - nmuj;
        int epH = edadPromedioH(np, nh, pacientes);
        int nHtA = tipoAhom(np, pacientes);
        int promedioEdadG = EdadPromedioGeneral(np, pacientes);
        int PromedioPM = PesoPromedioMujeres(np, pacientes, nmuj);
        
        System.out.println();
        System.out.println("El número de hombres: " +nh);
        System.out.println("El número de mujeres: " +nmuj);
        System.out.println("Edad promedio en hombres: " +epH);
        System.out.println("Edad promedio general: " +promedioEdadG);
        System.out.println("Hombres con tipo de Sangre A: " +nHtA);
        System.out.println("Peso promedio de las mujeres: " +PromedioPM);
    }
}
