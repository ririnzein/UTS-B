/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.b;

/**
 *
 * @author Zein-Pc
 */
public class UTSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //siapkan variabel
        float A = (float) 3.8;
        int B = 6;
        float C = (float) 8.9;
        int D = 7;
        
        String text = "hasilnya adalah ";
      
        // proses nilai
        float E = 2*A + B + 3*C + D;
        
        // tampilkan 
        System.out.println(text+E);
    }
    
}
