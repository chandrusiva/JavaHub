/*
 * This program illustrates the concepts of static members/methods in java
 */

class Static_stub {
	static int a = 100;
	static int b;
	int c;
	
	//A non static method can access a static member  
	void non_static_method() {
		a = a + 100;
		b = a;
		System.out.println("Using Non static method: Value of a and b = "+a+", "+b);
	}
	
	static void static_method() {
		a = a + 100;
		b = a;
		/*
		 * This line would throw a compilation error as a static method
		 * cannot access a non-static member
		 */
		//c = 5;
		System.out.println("Using Static method: Value of a and b = "+a+", "+b);
	}
}

public class Static_Example {

	static int c = 5;
	static int d;
	
	/*
	 * Static block is called exactly once when the class is first loaded.
	 * This block can be used to initialize static variables
	 * after some computation. 
	 */
	static {
		System.out.println("Initializing static block");
		c = c * 100;
		d = c;
	}
	
	public static void main(String[] args) {
		
		//Use classname.name to access a static member/method outside its class
		System.out.println("a = "+Static_stub.a);
		Static_stub.static_method();
		
		//This is the usual way to call a (non-static) method
		Static_stub ob = new Static_stub();
		ob.non_static_method();
		
		//Static members can be accessed directly when called from inside its class
		System.out.println("d = "+d);
	}

}
