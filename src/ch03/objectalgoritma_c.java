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
public class objectalgoritma_c {
    public static void main(String[] args) {
        algoritma_c pembagi = new algoritma_c();
        Scanner angka = new Scanner (System.in);
        System.out.println("Menentukan bilangan pembagi terkecil selain 1 dan 2");
        System.out.println("====================================================");
        System.out.println("Input angka = ");
        pembagi.angka = angka.nextInt();
        
        pembagi.cetak();
    }
}

