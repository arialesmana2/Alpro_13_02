/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;
/**
 *
 * @author asus
 */
public class r10_b2_5a_bsort {
 public static void main(String[] args) {

        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Array Sebelum Diurutkan Adalah ");
        for (int i = 0; i < bil.length; i++){
            System.out.print(bil[i]);
            System.out.print(" ");
        }


            for (int i = 0; i < bil.length; i++){
                for (int x = 0; x < bil.length - 1; x++){
                    boolean urutanarray = bil[x] < bil[x + 1];
                    if (!urutanarray) {
                        int lain = bil[x];
                        bil[x] = bil[x + 1];
                        bil[x + 1] = lain;
                    }
                }
            }
            System.out.println(" ");
            System.out.println("Urutan Array Terkecil Menggunakan Bubble Sort adalah");

            for (int i = 0; i < bil.length; i++){
                System.out.print(bil[i]);
                System.out.print(" ");
            }

        }
    }

