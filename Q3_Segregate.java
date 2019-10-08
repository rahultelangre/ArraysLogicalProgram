package com.nt.arrays2;

public class Q3_Segregate {
	public static void main(String[] args) {
		
		int arr[]= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int ele1=0;
		int ele2=arr.length-1;
		
		while(ele1<ele2) {
			if(arr[ele1]==1) {
				//swapping
				arr[ele2]=arr[ele2]+arr[ele1];
				arr[ele1]=arr[ele2]-arr[ele1];
				arr[ele2]=arr[ele2]-arr[ele1];
				ele2--;
			}
			else {
				ele1++;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
