/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class r12_LongestCommonSubstingProblem {
        public static int lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        int max = 0;

        int[][] dp = new int[m][n];

        for (int a = 0; a < m; a++){
            for (int j = 0; j < n; j++){
                if (X.charAt(a) == Y.charAt(j)) {
                    if (a == 0 || j == 0) {
                        dp[a][j] = 1;
                    } else {
                        dp[a][j] = dp[a - 1][a - 1] + 1;
                    }

                    if (max < dp[a][j])
                        max = dp[a][j];
                }

            }
        }

        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String X;
        String Y;

        System.out.println("Algoritma Longest Common Substring Problem");
        System.out.print("Masukkan Karakter A = ");
        X = in.nextLine();
        System.out.print("Masukkan Karakter B = ");
        Y = in.nextLine();

        System.out.println(lcs(X,Y));

    }
}

