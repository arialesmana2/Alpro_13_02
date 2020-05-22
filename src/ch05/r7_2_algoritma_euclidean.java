/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class r7_2_algoritma_euclidean {
    int p, q, r;
    public int getVarP(){
        return p;
    }
    public int getVarQ(){
        return q;
    }
    public int getVarR(){
        return r;
    }
    public void cetak(){
        int x = p;
        int y = q;
        while(q!=0){
            r = p % q;
            p = q;
            q = r;
        }
        System.out.println(" PBB dari = ("+x+" , "+y+" ) = "+p);
    }
}
