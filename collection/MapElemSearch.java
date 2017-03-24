/*Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.*/



package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapElemSearch {

	public void mapExample(){

		// map creation
		Map<Integer,String> map = new HashMap<Integer,String>();

		// adding values to map

		map.put(101, "akhil");
		map.put(121, "henry");
		map.put(102, "tejas");
		map.put(null, "megha");
		map.put(110, null);

		// Iteration- retrieving elements

		for(Entry<Integer, String> mapentry : map.entrySet()){
			System.out.println("key : " + mapentry.getKey() + " Value : " + mapentry.getValue() + " HashCode : " + mapentry.hashCode());
		}

		// searching element and displaying corresponding value
		if(map.containsKey(null)){
			System.out.println(map.get(null));

		}
	}

	public static void main(String[] args) {
		MapElemSearch mp = new MapElemSearch();
		mp.mapExample();
	}

}
