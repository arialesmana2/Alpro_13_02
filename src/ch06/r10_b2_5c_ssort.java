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
public class r10_b2_5c_ssort {
    public static void ssort(int aar[]){
        int a = aar.length;
        for(int i = 0; i < a - 1; i++){
            int mn_idx = i;
            for (int j = i + 1; j < a; j++)
                if(aar [j] < aar[mn_idx])
                    mn_idx=j;
            int temp = aar[mn_idx];
            aar[mn_idx]=aar[i];
            aar[i]=temp;
        }
    }
    public void printArray(int aar[] ){
        int a = aar.length;
        for(int i = 0; i< a; ++i)
            System.out.println(aar[i]+"");
        System.out.println();
    }
            
        }

