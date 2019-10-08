package com.nt.arrays2;

import java.util.Arrays;

public class Q3_Segregate0sAnd1s2 {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 ,0,0,1,1,1,1};
	    int a=0;
	    int b=0;
	    
	    for (int i = 0; i < arr.length; i++) {
	    	if(arr[i]<1) {
	    		b=arr[a];
	    		arr[a]=arr[i];
	    		arr[i]=b;
	    		a++;
	    	}
		}
	    System.out.println(Arrays.toString(arr));
	
	}

}
