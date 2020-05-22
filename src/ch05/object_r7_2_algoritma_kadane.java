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
public class object_r7_2_algoritma_kadane {
    public static void main(String[] args) {
        
        System.out.println("Algoritma Kadane = Menentukan nilai maximum dari subArray ");
        System.out.println();
        
        r7_2_algoritma_kadane kadane = new r7_2_algoritma_kadane();
        int araaY [] = {1, 2, -3, -4, 2, 7, -2, 3};
        kadane.cetak();
        System.out.println();
        System.out.println("Maximum subArray = " +kadane.kadane(araaY));
        
        int araaX [] = {-2, -3, -4, -2, -7, -2, -3, -11};
        kadane.cetak2();
        System.out.println();
        System.out.println("Maximum subArray = " +kadane.kadane(araaX));
    }
}

