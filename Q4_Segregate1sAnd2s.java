package com.nt.arrays2;

import java.util.Arrays;

public class Q4_Segregate1sAnd2s {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 0, 0, 2, 1, 2, 0};
		int arr1[] = new int[arr.length];
		int j = 0;
		int k = arr.length /2;
        int p=k+2;
        
		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] == 0) {
				arr1[j] = arr[i];
				j++;
			} else if (arr[i] == 1) {
				arr1[k] = arr[i];
				k++;
			}
			else if(arr[i]==2) {
				arr1[p]=arr[i];
				p++;
			}
	
		}
		System.out.println(Arrays.toString(arr1));
	}

}
