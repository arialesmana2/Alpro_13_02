/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class objectalgoritma_a {
    public static void main(String[] args) {
        algoritma_a angka = new algoritma_a ();
        System.out.println("Menentukan Nilai tertinggi antara variabel x dan y");
        System.out.println("==================================================");
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input nilai x = ");
        angka.a = in.nextInt();
        Scanner out = new Scanner (System.in);
        angka.b = out.nextInt();
        
        angka.cetak();
    }
}

