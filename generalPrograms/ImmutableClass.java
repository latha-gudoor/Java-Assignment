// Write an Immutable class.

package generalPrograms;

// class declared as final, hence we can not create subclass
public final class ImmutableClass {
	// variable declared as final, so we can not the change the value, once object is created
	final String ssnNumber;  

	// Constructor
	public ImmutableClass(String ssnNumber){  
		this.ssnNumber=ssnNumber;  
	}  
	// we can get the value..no setter method hence value cannot be changed.
	public String getSsnNumber(){  
		return ssnNumber;  
	}  
}
