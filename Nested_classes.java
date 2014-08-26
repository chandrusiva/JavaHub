/*
 * This program illustrates the concepts of nested and inner classes
 */

public class Nested_classes {
	private int x = 10;
	
	void display() {
		System.out.println("Inside outer class");
		System.out.println("x = "+x);
		/*
		 * The inner class can be instantiated only by the enclosing class
		 */
		Inner ob1 = new Inner();
		ob1.display();
		/*
		 * The enclosing class do not have access to its static nested
		 * class members. The following will throw a compilation error.
		 */
		//System.out.println("z = "+z);
	}
	
	class Inner {
		int y = 5;
		void display() {
			System.out.println("Inside inner(non-static nested) class");
			/*
			 * The inner class can access even the private member of the
			 * enclosing class
			 */
			System.out.println("x,y = "+x+","+y);		
		}
	}
	/*
	 * This is the second type of the nested class - static nested class.
	 * This can access only members/methods that are in static context. 
	 * (i.e) Cannot access non-static members/methods
	 */
	static class Nested {
		int z = 20;
		void print() {
			System.out.println("Inside static nested class");
			System.out.println("x,z = "+z);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested_classes ob = new Nested_classes();
		ob.display();
		Nested ob3 = new Nested();
		ob3.print();
		/*
		 * Use the following when calling from outside the Nested_classes class.
		 */
		//Nested_classes.Nested ob2 = new Nested_classes.Nested();
		//ob2.print();
	}

}
