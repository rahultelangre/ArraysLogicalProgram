
package com.nt.arrays2;

import java.util.Arrays;

public class Q7_RearrangeMinAndMax {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int arr1[]=new int[arr.length];
		int j=0;
		int k=arr.length-1;
		boolean flag=true;
		
		for (int i = 0; i < arr.length; i++) {
			if(flag) {
				arr1[i]=arr[k--];
			}
			else {
				arr1[i]=arr[j++];
			}
			flag=!flag;
		}
		System.out.println(Arrays.toString(arr1));
	}

}
