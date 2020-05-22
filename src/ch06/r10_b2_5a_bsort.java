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
public class r10_b2_5a_bsort {
    static void bSort (int aar[], int n)
    {
            int i, j, temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++)
    
                {
            swapped = false;
            for(j = 0; j < n - 1; j++)
                {
            if(aar[j] > aar[j + 1]){
    temp = aar[j];
    aar[j] = aar[j + 1];
    aar[j + 1] = temp;
    swapped = true;
    }
}
    if (swapped == false)
        break;
    }
}
            
       static void printArray(int aar[], int size ){
int i;
for(i = 0; i < size; i++)
System.out.println(aar[i] +"");
System.out.println();
}
public static void main(String args[]){
int [] aar = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
int n = aar.length;
bSort(aar, n);
System.out.println(" Urutan Aray setelah BSORT = ");
printArray(aar, n);
}
}

