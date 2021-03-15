/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaexamen;

/**
 *
 * @author Terry
 */
public class ProblemaExamen {
    
    public static void TarifaXMes ()
    {
        int m = 1;
        float tarifanue = 120;
        while(m<=12)
        {
            System.out.println("En el mes " +m +" la tarifa será de: " +tarifanue);
            tarifanue = tarifanue*(1+0.02f);
            m++;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarifaXMes();
    }
    
}
