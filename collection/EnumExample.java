/* Write a program that defines an enum having months of the year and then prints the value 
 * of all the enum elements.
 */


package collection;

public class EnumExample {

	enum Months{
		January,February,March,April,May,June,July,August,September,October,November,December;
	}
	public static void main(String[] args) {
		Months[] months = Months.values();
		for(Months month : months){
			System.out.println(month +" : "+month.ordinal());

		}

	}

}
