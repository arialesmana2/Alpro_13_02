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
public class algoritma_d {
    int angka;
    
    public int getVarAngka(){
        return angka;
    }
    public void cetak(){
        if(angka== 2 || angka!=1 && angka%2!=0){
        if(angka== 3 || angka% 3!=0){
            if(angka== 5 || angka% 5!=0){
            if(angka==7 || angka%7!=0){
 System.out.println(angka+ "ialah bilangan prima");
                }else{
                        System.out.println(angka+ "bukan bilangan prima");
                }
            }else{
                    System.out.println(angka+ "bukan bilangan prima");
                    }
        }else{
                System.out.println(angka+ "bukan bilangan prima");
                }
    }else{
            System.out.println(angka+ "bukan bilangan prima");
            }
    }
}

