package com.nt.arrays2;
//hi heloow hw r u feature1
import java.util.Arrays;

public class Q1_RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7} ;
                int x=111;
		int leng=arr.length;
		int arr1[]=new int[2];
		int arr2[]=new int[leng-2];
		int j=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(i<2) {
				arr1[i]=arr[i];
			}
			else if(i>=2) {
				arr2[j]=arr[i];
				j++;
			}
		}
		int concate[]=new int[arr1.length+arr2.length];
		System.arraycopy(arr2, 0, concate, 0, arr2.length);
		System.arraycopy(arr1, 0, concate, arr2.length, arr1.length);
		System.out.println(Arrays.toString(concate));

	}

}
