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
public class objectalgorima_d {
    public static void main(String[] args) {
        algoritma_d prima = new algoritma_d();
        System.out.println("Menentukan bilangan prima atau tidak");
        System.out.println("====================================");
        Scanner pr = new Scanner (System.in);
        System.out.println("masukkan bilangan yang ingin dibuktikan = ");
        prima.angka = pr.nextInt();
        
        prima.cetak();
    }
}
