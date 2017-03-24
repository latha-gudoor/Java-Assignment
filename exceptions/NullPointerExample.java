package exceptions;

public class NullPointerExample {


	public String name;
	public int id;

	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	

	public static void main(String[] args) {

	NullPointerExample np = new NullPointerExample();
		np.setName(null);
		String name = np.getName();
		try{
			System.out.println(name.length()); 	
		}catch(Exception e){
			e.getMessage();
		}finally{
			np.setId(100);
			System.out.println(np.getId());
			System.out.println(np.getName());
		}
	
		
		
		
	}
}

