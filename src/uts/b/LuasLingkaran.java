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
public class LuasLingkaran {
    public static void main (String[] ards){
        
        //siapkan variabel
        float V = (float) 3.14;
        int r = 4;
        
        //proses
        float luas = (float) V * r * r;
        float keliling =(float) 2 * V * r;
        String kalimatluas = "hasil luas adalah ";
        String kalimatkeliling = "hasil keliling adalah ";
        
        //tampilkan
        System.out.println (kalimatluas+luas);
        System.out.println(kalimatkeliling+keliling);
        
    }
    
}
