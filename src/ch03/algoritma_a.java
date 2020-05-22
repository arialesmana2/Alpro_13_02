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
public class algoritma_a {
    int a, b ;
    
    public int getVarA(){
        return a;
    }
    public int getVarB(){
        return b;
    }
    public void cetak(){
        if (a > b){
            System.out.println(+a+ ", lebih besar dari " +b );
        }else{
            System.out.println(+a+ "lebih besar dari " +b);
        }
    }
}

