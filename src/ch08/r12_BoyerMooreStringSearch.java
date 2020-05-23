/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08;

/**
 *
 * @author asus
 */
public class r12_BoyerMooreStringSearch {
   static int NO_OF_CHARS = 936;
    static int max (int a, int b) { return (a>b)? a : b;}

    static void badCharHeuristic(char []str, int size, int badchar[]){
        int i;

        for (i = 0; i < NO_OF_CHARS; i++)
            badchar[i] = -1;

        for (i = 0; i < size; i++)
            badchar[(int) str[i]] = i;
    }

    static void search ( char txt[], char pat[]){
        int m = pat.length;
        int n = txt.length;

        int badchar[] = new int[NO_OF_CHARS];

        int s = 0;
        while(s <= (n - m)){

            int j = m-1;

            while (j >= 0 && pat[j] == txt[s+j])
                j--;
            if (j < 0){

                System.out.println("Paterens occur at shift = " + s);

                s += (s+m < n)? m-badchar[txt[s+m]] : 1;
            }

            else
                s += max(1, j - badchar[txt[s+j]]);
        }
    }

    public static void main(String[] args) {

        char txt[] = "ABAAABCD".toCharArray();
        char pat[] = "ABC".toCharArray();
        search(txt, pat);
    }
}