// Write a program to copy arraylist to an array.
package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2Array {

	public void arrayList2Array(){



		List<Integer> list = new ArrayList<Integer>();
		// adding elements
		list.add(12);
		list.add(16);
		list.add(10);
		list.add(2);
		list.add(21);
		list.add(26);
		list.add(12);
		list.add(18);
		System.out.println("printing arraylist elements : ");
		for(Integer ls:list){
			System.out.println(ls);
		}

		// converting list to array
		Integer[] array1 = new Integer[list.size()];
		list.toArray(array1);
		//printing array elements
		System.out.println("array elements : ");
		for(Integer arr:list){
			System.out.println(arr);

		}
	}
	public static void main(String[] args) {
		Arraylist2Array al = new Arraylist2Array();
		al.arrayList2Array();
	}

}
