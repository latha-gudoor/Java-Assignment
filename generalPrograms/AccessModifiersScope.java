//Write a program that implements various functions of different type of access modifiers
//(private,protected,default,public) and then access these methods with in or outside the class 
//based on the identifier scope.


package generalPrograms;

public class AccessModifiersScope {

	//Access modifiers in java : public,private,protected and default
	//public -- accessed anywhere

	private final int id=101;
	public String empname;
	private int ssnNum;
	protected int salary;
	String desig;



	private void privateMethod(){
		System.out.println("This is private method which can be accessed any where ");
	}
	public void display(){
		System.out.println("name : " + empname);
		System.out.println("id : " + id);
		System.out.println("SSN Number : " + ssnNum);
		System.out.println("Salary : " + salary);
	}
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSsnNum() {
		return ssnNum;
	}

	public void setSsnNum(int ssnNum) {
		this.ssnNum = ssnNum;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

}
