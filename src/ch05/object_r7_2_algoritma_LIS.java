/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author asus
 */
public class object_r7_2_algoritma_LIS {
     public static void main(String[] args) {
        int aar[] = {30, 22, 9, 33, 25, 55, 41, 60};
        r7_2_algoritma_LIS lis = new r7_2_algoritma_LIS();
        int n = aar.length;
        System.out.println("Length dari LIS adalah = " +lis.lis(aar, n) +" \n");
    }
}

