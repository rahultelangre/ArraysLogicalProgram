package com.nt.arrays2;

import java.util.Arrays;

public class Q4_Segregate1sAnd2s2 {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 0, 0, 2, 1, 2, 0};
		
		int low=0;
		int  high=arr.length-1;
		int mid=0;
		
		while(mid<=high) {
			switch (arr[mid]) {
			case 0:
				arr[low]=arr[mid];
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				arr[mid]=arr[high];
				high--;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
