//  Write a program to sort a map by value.

package collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapSortByValue {

	public void treeMap(){
		
		//creating tree map
		Map<Integer,String> map1 = new TreeMap<Integer,String>();

		// adding key and value - pair values
		map1.put(101, "akhil");
		map1.put(103, "henry");
		map1.put(102, "tejas");
		map1.put(105, "megha");
		
		// retrieving elements from treemap
		
		for(Entry<Integer,String> mapentry : map1.entrySet()){
			System.out.println("key : " + mapentry.getKey() + " Value : " + mapentry.getValue());
		}

		//creating soreted treemap with comparator
		
		Map<Integer,String> sortedMap = new TreeMap<Integer,String>(new Comparator<Integer>() 
				{
			public int compare(Integer o1, Integer o2) {
		return map1.get(o1).compareTo(map1.get(o2));

	} 
				});
		sortedMap.putAll(map1);	
		System.out.println("sorted order by value :\n ");
		
		for(Entry<Integer, String> sortEntry : sortedMap.entrySet()){
			System.out.println("key : " + sortEntry.getKey() + " Value : " + sortEntry.getValue() + " HashCode : " + sortEntry.hashCode());
		}
	}
	

	public static void main(String[] args) {
		TreeMapSortByValue mp = new TreeMapSortByValue();
		mp.treeMap();
	}

}


