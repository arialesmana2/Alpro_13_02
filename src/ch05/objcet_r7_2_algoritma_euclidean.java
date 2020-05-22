/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class objcet_r7_2_algoritma_euclidean {
    public static void main(String[] args) {
        r7_2_algoritma_euclidean euclidean = new r7_2_algoritma_euclidean();
        System.out.println("Program Aljabar Euclidean -> Menghitung PBB");
        System.out.println();
        Scanner in = new Scanner (System.in);
        System.out.println("Input nilai p = ");
        euclidean.p = in.nextInt();
        
        Scanner out = new Scanner (System.in);
        System.out.println("Input nilai q = ");
        euclidean.q = out.nextInt();
        
        Scanner up = new Scanner (System.in);
        System.out.println("Input nilai r = ");
        euclidean.r = up.nextInt();
        
        euclidean.cetak();
    }
}
