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
public class r7_2_algoritma_LCS {
    int lcs(char[] X, char[] Y, int a, int b){
        int C [][] = new int[a + 1][b + 1];
        for (int j = 0; j <= a; j++){
            for(int k = 0; k <= b; k++){
                if(j == 0 || k == 0)
                    C[j][k] = 0;
                else if(X [j - 1] == Y[k - 1])
                    C[j][k] = C[j - 1][k - 1] + 1;
                else
                    C[j][k] = max(C[j - 1][k], C[j][j - 1]);
            }
        }
        return C[a][b];
    }
    int max(int o, int p){
        return (o > p) ? o : p;
    }
}

