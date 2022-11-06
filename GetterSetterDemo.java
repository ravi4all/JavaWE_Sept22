class User {
	private String name = "Ram";
	
	// Getter
	public String getName() {
		return this.name;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
}

public class GetterSetterDemo {

	public static void main(String[] args) {
		
		User obj = new User();
		System.out.println(obj.getName());
		
		obj.setName("Shyam");
		System.out.println(obj.getName());
		
//		System.out.println(obj.name);
//		obj.name = "Shyam";
//		System.out.println(obj.name);
	
	}

}
