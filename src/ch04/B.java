/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class B {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Cari angka : ");
        
	Scanner cariX = new Scanner (System.in);	
	int cari = cariX.nextInt();
	boolean ketemu = false;

	for (int i=0;i<nilai.length;i++){
		if(nilai[i]==cari){
		   System.out.println("Angka "+cari+" ada di index ke "+i);  
		   ketemu=true;
		}
		
        }
	if (ketemu == false){
	   System.out.println("Angka "+cari+" tidak ditemukan");
	}
    }
}

