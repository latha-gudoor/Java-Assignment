/* Write a program to print 1 to 10 numbers without using loops and 
 * you should not have more than 1 print statement.*/

package generalPrograms;

public class PrintingNumbers {

	public void printNumbersRecur(int n){
		if(n<=10){
			System.out.println(n);
			printNumbersRecur(n+1);
		}
	}
	public static void main(String[] args) {
		PrintingNumbers num = new PrintingNumbers();
		num.printNumbersRecur(5);
		System.out.println("\n");
		num.printNumbersRecur(1);
	}

}
