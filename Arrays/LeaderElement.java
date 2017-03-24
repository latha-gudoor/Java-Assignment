/*Find leader elements from an array?
Element is said to be leader if all the elements to its right side are smaller than itself.
i/p : {6,9,15,1,11,3,10}
o/p : 15, 11, 10   */

package com.wbl.Arrays;

public class LeaderElement {
	
	int[] arr = {6,9,15,1,11,3,10};
	public void leader(){
		System.out.println("Array Length : " + arr.length);
		for(int i=0;i<arr.length;i++){
			 if (arr[i] > arr[i+1]) {  
			 System.out.println(":eader Elements : " + arr[i]);
		}
		}
		
	}
	public static void main(String[] args) {
		LeaderElement l = new LeaderElement();
		l.leader();
	}

}
