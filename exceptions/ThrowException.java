//Write a program containing a function which is expected to throw any kind of exception say NullPointerException or ArithmeticException etc and then handle this
//function in the parent function which calls this function.

package exceptions;

public class ThrowException {

	public static void main(String[] args)
	{
		int i =0;
		try
		{
			if (i<1){
				throw new MyOwnException("Give other than Zero");
			}
		}catch(Exception e){

			System.out.println(e);
		}
	}
}
class MyOwnException extends Exception
{
	public MyOwnException(String str)
	{

		super(str);
	}
}


