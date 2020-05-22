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
public class object_r7_2_algoritma_LCS {
    public static void main(String[] args) {
        r7_2_algoritma_LCS lcs = new r7_2_algoritma_LCS ();
        System.out.println("Algoritma Longest Common Subsequence = ");
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input bilangan pertama = ");
        String s1 = in.nextLine();
        
        Scanner out = new Scanner (System.in);
        System.out.println("Imput bilangan kedua = ");
        String s2 = out.nextLine();
        
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        
        int a = X.length;
        int b = Y.length;
        
        System.out.println(" Length dari LCS adalah = " +lcs.lcs(X, Y, a, b));
    }
}
