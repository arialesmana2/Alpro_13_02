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
  public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Nilai Array Sebelum Diurutkan = ");
        for (int x:bil){
            System.out.print(x+" ");
        }
        System.out.println();
        new r11_b2_5a_bSort(bil);

        System.out.print("Nilai Array Setelah Diurutkan = ");
        for(int x:bil){
            System.out.print(x+" ");
        }
    }
   r11_b2_5a_bSort(int[] bil) {
        int w = bil.length;

        for (int y = 1 ; y < w ; y++) {
            int key = bil [y];
            int x=y-1;

            while ((x>-1)&&(bil[x]>key)){
                bil[x+1] = bil[x];
                x--;
            }
            bil[x+1]=key;
        }
    }
}