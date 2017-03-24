//Write a program to remove duplicates in an array using set.
package collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSet {

	public void duplicateValue(int []arr){
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i])){
				set.remove(arr[i]);
			}else{
				set.add(arr[i]);
			}
		}
	//to display 
		for(Integer newSet : set){
			System.out.println(newSet);
		}
	
	}
	
	public static void main(String[] args) {

		DuplicateSet set1 = new DuplicateSet();
		int [] arr = {6,3,7,6,12,7,9};
		set1.duplicateValue(arr);
	}

}


