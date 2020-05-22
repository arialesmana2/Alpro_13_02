/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author asus
 */
public class r7_2_algoritma_LIS {
     static int lis(int aar[], int n){
        int lis[] = new int [n];
        int i,j,max = 0;
        
        for(i = 0; i < i; i++)
            lis [i] = 1;
        for(i = 1; i < n; )
            for(j = 0; j< i; j++)
                if(aar[i] > aar[j] && lis[i] < lis[j] + 1)
                    lis [i] = lis[j] + 1;
        for(i = 0; i < n; i++)
            if(max < lis[i])
                max = lis [i];
        return max;
    }
}

