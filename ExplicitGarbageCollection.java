// Write a program implementing explicit garbage collection.

package generalPrograms;

public class ExplicitGarbageCollection {

	public static void main(String[] args) {
		ExplicitGarbageCollection ob = new ExplicitGarbageCollection();
	        ob=null;
	        System.gc(); // gc() method is used to call garbage collector explicitly
	    }
	// before collecting the object finalize() method is called by GC thread.
	    public void finalize()
	    {
	        System.out.println("Garbage Collected");
	    }

	}


