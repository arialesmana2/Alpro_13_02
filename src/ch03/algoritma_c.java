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
public class algoritma_c {
    int a = 4;
    int angka;
    int kecil;
    
    public int getVarAngka(){
        return angka;
    }
    public void cetak(){
        while (a <= angka){
            if(angka % a == 0){
                kecil = a;
                System.out.println(kecil+ "adalah pembagi terkecil dari "+angka);
                break ;
            }else{
                a = a + 1;
                if(angka % a == 0){
                    kecil = a;
                    System.out.println(kecil+ "adalah pembagi terkecil dari "+angka);
                    break;
                }
            }a++;
        }
    }
}

