/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class r13_AKSPrimality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Algoritma AKS Primality");
        System.out.print("Masukkan Bilangan = ");
        int n = in.nextInt();
        if (isPrime(n))
            System.out.println(n +" Adalah Bilangan Prima");
        else
            System.out.println(n + " Bukan Bilangan Prima");
    }

    static long x[] = new long[500];
    static void coef(int n) {
        x[0] = 1;
        for (int a = 0; a < n; x[0] = -x[0], a++) {
            x[1 + a] = 1;

            for (int j = a; j > 0; j--)
                x[j] = x[j - 1] - x[j];
        }
    }

    static boolean isPrime(int n) {
        coef(n);
        x[0]++;
        x[n]--;
        int a = n;
        while ((a--) > 0 && x[a] % n == 0) ;
        return a < 0;
    }
}

