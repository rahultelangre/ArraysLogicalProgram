package com.nt.arrays2;

import java.util.HashMap;
import java.util.Map;

public class Q5_LeaderElement2 {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
		 else
			 map.put(arr[i],1);
		}
					
	  for(Map.Entry<Integer,Integer> entry :map.entrySet()) {
		  if(entry.getValue()>=(arr.length)/2) {
			 System.out.println("leader element:"+entry.getKey());
		    return;
		  }
	  }
    System.out.println("there is no leader element");
	}
}
