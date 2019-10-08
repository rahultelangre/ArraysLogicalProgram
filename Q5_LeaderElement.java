package com.nt.arrays2;

public class Q5_LeaderElement {
	
	public static void main(String[] args) {
		 
		int arr1[]=new int[]{1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		
		for (int i = 0; i < arr1.length; i++) {
			int j;
			for (j = i+1; j < arr1.length; j++) {
				if(arr1[i]<=arr1[j]);
				break;
			}
			if(j>=arr1.length) {
				System.out.print(arr1[i]+" ");
			}
		}
	}
}
