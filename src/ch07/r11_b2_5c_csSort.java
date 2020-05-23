/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07;
import java.util.Arrays;
/**
 *
 * @author asus
 */
public class r11_b2_5c_csSort {
      public static void main(String[] args) {
        r11_b2_5c_csSort in = new r11_b2_5c_csSort();
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Nilai Array Sebelum Diurutkan Adalah = ");
        System.out.print(Arrays.toString(bil));
        System.out.println(" ");

        in.r11_b2_5c_csSort(bil);
        System.out.print("Nilai Array Setelah Diurutkan Adalah = ");
        System.out.println(Arrays.toString(bil));
    }

    void r11_b2_5c_csSort(int [] bil) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= bil.length - 2; i++){
                if (bil[i] > bil[i + 1]) {
                    int temp = bil[i];
                    bil[i] = bil[i + 1];
                    bil[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = bil.length - 2; i >= 0; i--){
                if (bil[i] > bil[i + 1]) {
                    int temp = bil[i];
                    bil[i] = bil[i + 1];
                    bil[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

