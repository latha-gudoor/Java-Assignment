/*Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator.*/




package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProgram {

	public void arrayListMethod(){

		// creating the ArraList Class object with List Interface
		List<String> list = new ArrayList<String>();
		// Adding the Elements using add method
		list.add("apple");
		list.add("pineapple");
		list.add("Strawbery");
		list.add("banana");
		list.add("grapes");

		// displaying the elements from list

		for (int i=0;i<list.size();i++){
			System.out.println("Element at " + i +  " posiotion is : " + list.get(i));
		}
		System.out.println("Size of the list is : " + list.size());
		System.out.println("first element in list is : " + list.get(0));
		System.out.println("last element in list is : " + list.get(list.size()-1));

		//searching element
		if (list.contains("banana")){
			System.out.println("search element is found");
			System.out.println("index value of searched element " + list.indexOf("banana"));
		}
		else{
			System.out.println("element not found in list");
		}

	}
	public void integerList(){

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(12);
		intList.add(18);
		intList.add(null);
		intList.add(25);
		intList.add(30);

		// displaying the elements using Iterator
		System.out.println("Integer list elements are : ");

		Iterator<Integer> itr = intList.iterator();
		while(itr.hasNext()){
			System.out.println( itr.next());

		}
		//printing list in reverse
		System.out.println("Integer list elements in reverse order : ");
		ListIterator<Integer> liitr = intList.listIterator();
		while(liitr.hasPrevious()){
			System.out.println(liitr.previous());
		}

	}


	public static void main(String[] args) {

		ArrayListProgram al = new ArrayListProgram();
		al.arrayListMethod();
		al.integerList();
	}

}
