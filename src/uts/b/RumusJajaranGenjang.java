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
public class RumusJajaranGenjang {
    public static void main (String[] ards){
        
        //siapkan variabel
        int a;
         a = 5;
        int t;
        t = 12;
        String kalimatLuas = "luas jajarangenjang adalah ";
        String kalimatKeliling = "luas keliling ";
        
        //proses
        int luas = a * t;
        int keliling = 2 * a * t ;
        
        //tampilkan
        System.out.println(kalimatLuas+luas);
        System.out.println (kalimatKeliling+keliling);
        
               
    }
}
