//Write a program that contains a constructor, a static block and a static method.
//Execute the program in order to verify the order to execution of methods and block.


package generalPrograms;

public class ConstructorStaticExample {
	// static methods are executed before the class is loaded into JVM
	static {
		System.out.println("static methods are executed before the class is loaded into JVM");
	}

	public ConstructorStaticExample(){
		System.out.println("constructor");
	}
	// Static variable doesn't need object for execution : using class name it can be accessed 
	public static String staticStr = "variable";

	static {
		System.out.println("Second static block and : "+ staticStr);

	}

	public static void main(String[] args){
		ConstructorStaticExample staticOb = new ConstructorStaticExample();//constructor called
		ConstructorStaticExample.staticMethod2();//this executes after the constructor
	}

	static {
		staticMethod();
		System.out.println("This is third static block");
	}

	public static void staticMethod() {
		System.out.println("This is static method");
	}

	public static void staticMethod2() {
		System.out.println("This is static method2");
	}
}

