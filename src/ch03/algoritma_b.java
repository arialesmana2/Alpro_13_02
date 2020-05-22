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
public class algoritma_b {
    int a, b, c;
    
    public int getVarA(){
        return a ;
    }
    public int getVarB(){
        return b ;
    }
    public int getVarC(){
        return c ;
    }
    public void cetak (){
        if(a > b && c > c){
            System.out.println(+a+ "lebih besar dari " +b+". Nilai c = " +c);
        }else if(b > a && b > c){
            System.out.println(+b+ "lebih besar dari " +a+". Nilai z = " +c);
        }else{
            System.out.println(+c+ "lebih besar dari " +a+". Nilai c = " +b);
        }
    }
}

