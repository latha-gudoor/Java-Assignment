package collection;
import java.util.HashSet;
import java.util.Set;

public class DupplicateString {

	public static void main(String[] args) {

		String[] str = {"apple","cherry","banana","apple","orange","strawbery","cherry"};
		Set<String> set = new HashSet<String>();
		Set<String> set1 = new HashSet<String>();
		for(String s:str){
			if(set.add(s)==false){
				set1.add(s);
			} else{
				set1.remove(s);
			}
		}
		//System.out.println("the duplicate elements are :  " + );

		for(String st:set1){
			System.out.println(st);
		}
	}
}
