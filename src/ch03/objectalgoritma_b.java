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
public class objectalgoritma_b {
    public static void main(String[] args) {
        algoritma_b angka = new algoritma_b();
        System.out.println("Menentukan nilai tertinggi antara a, b, dan c");
        System.out.println("=============================================");
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input nilai a = ");
        angka.a = in.nextInt();
        
        Scanner out = new Scanner (System.in);
        System.out.println("Input nilai b = ");
        angka.b = out.nextInt();
        
        Scanner up = new Scanner (System.in);
        System.out.println("Input nilai c = ");
        angka.c = up.nextInt();
        
        angka.cetak();
    }
}

