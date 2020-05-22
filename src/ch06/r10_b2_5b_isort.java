/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author asus
 */
public class r10_b2_5b_isort {
    void isort(int aar []){
        int a = aar.length;
        for(int i = 1; i < a; i++){
        int key = aar[i];
        int j = i - 1;
        
        while (j >= 0 && aar [j] > key){
            aar [j + 1] = aar[j];
            j = j- 1;
        }
        aar[j + 1] = key;
        }
    }
    public static void printArray(int aar[]){
        int a = aar.length;
        for(int i = 0; i < a; i++)
            System.out.println(aar[i]+", ");
        System.out.println();
    }
}
