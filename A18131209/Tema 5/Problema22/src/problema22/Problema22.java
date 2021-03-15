/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema22;

/**
 *
 * @author terry
 */
public class Problema22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array [][] = new int [4][4];
        array[0][0] = 5;
        array[0][1] = 8;
        array[0][2] = 10;
        array[0][3] = 8;
        
        array[1][0] = 5;//
        array[1][1] = 10;
        array[1][2] = 9;
        array[1][3] = 10;
        
        array[2][0] = 8;//
        array[2][1] = 5;//
        array[2][2] = 15;
        array[2][3] = 9;
        
        array[3][0] = 10;//
        array[3][1] = 15;//
        array[3][2] = 15;//        58
        array[3][3] = 20;
        
        superiorDerecha(array);
        
        inferiorIzquierda(array);
    }
    
    public static void superiorDerecha(int array[][]){  //SUMA SUPERIOR DERECHA
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = (i+1); j < array.length; j++) {
                suma = suma + array[i][j];
            }
        }
        
        System.out.println("suma: " + suma);
    }
    
    public static void inferiorIzquierda(int array[][]){  //SUMA Inferior Izq.
        int suma = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                suma = suma + array[i][j];
            }
        }
         System.out.println("suma: " + suma);
    }
    
}
