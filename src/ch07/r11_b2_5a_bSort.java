/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07;

/**
 *
 * @author asus
 */
public class r11_b2_5a_bSort {
   int [] aar = new int [] {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int temp=0;
    
    public void cetak(){
        System.out.println("Array yang diinputkan = ");
        for(int a = 0; a < aar.length; a++){
            System.out.println(aar [a]+", ");
        }
        for(int a = 0; a < aar.length; a++){
            for( int b = 0; b < aar.length; b++){
                if (aar[a] < aar[b]){
                    temp = aar[a];
                    aar[a] = aar[b];
                    aar[b] = temp;
                }
            }
            
        }
        System.out.println();
        System.out.println("Urutan Array setelah di blockSort ");
        for (int a = 0; a < aar.length; a++){
            System.out.println(aar[a] +", ");
        }
        System.out.println();
    }
}
