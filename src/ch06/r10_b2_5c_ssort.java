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
public class r10_b2_5c_ssort {
    public static void main(String args[]) {
        r10_b2_5c_ssort in = new r10_b2_5c_ssort();
        int bil[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        in.sort(bil);
        System.out.println("Urutan Array Dari Yang Terkecil ");
        in.printArray(bil);
    }
    private void sort(int bil[]) {
        int a = bil.length;
        for (int x = 0; x < a-1; x++){

            int min_idx = x;
            for (int y = x+1; y < a ; y++)
                if (bil[y] < bil[min_idx])
                    min_idx = y;
            int temp = bil[min_idx];
            bil[min_idx] = bil[x];
            bil[x] = temp;
        }
    }
    private void printArray(int bil[]) {
        int i = bil.length;
        for (int x = 0; x < i; ++x)
            System.out.print(bil[x]+" ");
        System.out.println();
    }
}
