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
public class r13_SieveofSundaram {
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Algoritma Sieve Of Sundaram");
        r13_SieveofSundaram sos = new  r13_SieveofSundaram();
        System.out.print("Masukkan Limit Bilangan = ");
        int n = scan.nextInt();
        sos.getPrimes(n);
    }

    private boolean[] calcPrimes(int limit) {
        int n = limit/2;
        boolean[] prime = new boolean[limit];

        for (int x = 1; x < n; x++)
            for (int y = x; y <= (n - x) / (2 * x + 1); y++)
                prime[x + y + 2 * x * y] = true;

        return prime;
    }

    public void getPrimes(int N) {
        boolean[] primes = calcPrimes(N);
        display(primes);
    }

    public void display(boolean[] primes) {
        System.out.print("Bilangan Prima Dari Limit Diatas = 2 3 ");
        for (int x = 2; x < primes.length/2; x++)
            if (!primes[x])
                System.out.print((2 * x + 1) +" ");
        System.out.println();
    }
}

