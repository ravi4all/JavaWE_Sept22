class Student {
	//public - main method must be public, because JRE wants to access main 	
	//method, and if main is not public than JRE won't be able to find main

	// static - whatever is static will be loaded in memory first
	// no need to create object of class to access static things

	// void - because main() does not return anything that's why main method 	
	//return type is void

	// String []args - command line arguments
	// when we wants to pass some value through command prompt than args 	
	//will store those values
	public static void main(String []myArray) {
		// System is a pre-defined class in Java
		// out is a member of System and Object of PrintStream Class
		// println is a method of PrintStream class that is used to print anything 		
		// on output screen
		System.out.println("Hello...");
     }

}


