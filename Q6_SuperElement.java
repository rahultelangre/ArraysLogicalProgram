package com.nt.arrays2;

public class Q6_SuperElement {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 6 };
		int leng = arr.length;
		int temp = 0;

		for (int i = 0; i < leng; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					count++;
					temp = arr[i];
				}

			}
			if (count >= 2) {
				System.out.print(temp+" ");
			}
		}

	}

}
