// Access Modifiers Main Class
package generalPrograms;

public class ModifiersMainClass {

	public static void main(String[] args) {
		AccessModifiersScope ob1 = new AccessModifiersScope();

		//accessing public methods
		ob1.setEmpname("sree");
		ob1.setSalary(50000);
		ob1.setSsnNum(1234);
		ob1.setDesig("programmer");
		System.out.println(ob1.getDesig());
		System.out.println(ob1.getEmpname());
		System.out.println(ob1.getSalary());
		System.out.println(ob1.getSsnNum());
		ob1.display(); // private instance variables can be called using public method


		//private variables or methods can not be accessed outside the class-- private instance variable 
		//can be accessed using public methods
		AccessModifiersScope ob2 = new AccessModifiersScope();
		System.out.println("Second Object Details : ");
		System.out.println(ob2.desig= "accountant"); // default -- can be accessed in same package
		System.out.println(ob2.empname="sri"); //public
		System.out.println(ob2.salary=4500);  // protected 
		//ob2.id=453; -- not accessible --its declared as private which is not accessible without public method, final cant be altered
		// ob2.ssnNum=3456;--- private no visibility outside the class
		//ob2.privateMethod();-- private cant be accessed






	}

}
