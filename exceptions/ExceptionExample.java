/*Write a program containing a function which is expected to throw any kind of exception say 
 * NullPointerException or ArithmeticException etc and then handle this function in the 
 * parent function which calls this function.*/
 
package exceptions;


public class ExceptionExample {
int k;
int [] arr = new int[5];
	public void funcException()  {
		int i=10;
		int j= 0;
		try{
		k= i/j;
		}catch(ArithmeticException ae){
			ae.getMessage();
		}
		try{
		arr[6]=10;
		}catch(ArrayIndexOutOfBoundsException aob){
			System.out.println("array index error : " + aob.getMessage());
		}
		System.out.println("k : " + k);

		System.out.println("Dealing with Exception programs");
		}
	
	
	public static void main (String [] args){
	ExceptionExample fe = new ExceptionExample();
	try {
		fe.funcException();
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}