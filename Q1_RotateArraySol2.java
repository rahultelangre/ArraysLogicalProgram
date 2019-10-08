package com.nt.arrays2;

public class Q1_RotateArraySol2 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int p=2;
                int c=0;
		
		for (int i = 0; i < p; i++) {
			int j;
			int temp=arr[0];
			for (j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
			//System.out.println(arr[j]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
