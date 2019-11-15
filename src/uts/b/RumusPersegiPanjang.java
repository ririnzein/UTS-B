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
public class RumusPersegiPanjang {
    //  public static void main (String[] args) {
    public static void main (String[] args) {
        //sipkan variabel
        int P = 5;
        int L = 8;
        String kalimatLuas = "hasil luas adalah";
        String kalimatKeliling = "hasil keliling adalah";
        
        //proses
        int luas = P*L;
        int keliling = 2*(P+L);
        
        //tampilkan
        System.out.println (kalimatLuas+luas);
        System.out.println (kalimatKeliling+keliling);
               
                
    }
    
}
