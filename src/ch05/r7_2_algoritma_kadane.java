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
public class r7_2_algoritma_kadane {
    int [] aray1 = {1, 2, -3, -4, 2, 7, -2, 3};
    int [] aray2 = {-2, -3, -4, -2, -7, -2, -3, -11};
    public int kadane (int[]araaY){
        int max_end = 0;
        int max_far = 0;
        for (int i = 0; i < araaY.length; i++ ){
            max_end += araaY[i];
            if (max_end < 0){
                max_end = 0;
            }
            if(max_far < max_end){
                max_far = max_end;
            }
        }
        return max_far;
    }
    public int KadaneModif(int[] araaY){
        int max_end = araaY[0];
        int max_far = araaY[0];
        for(int i = 0; i < araaY.length; i++){
            max_end = Math.max(araaY [i], max_end + araaY [i]);
            max_far = Math.max(max_far, max_end);
        }
        return max_far;
}
    public void cetak(){
        for(int i = 0; i < aray1.length; i++ ){
            System.out.println(aray1[i]+", ");
        }
    }
    public void cetak2(){
        for(int i = 0; i < aray2.length; i++){
            System.out.println(aray2[i]+", ");
        }
    }
}

