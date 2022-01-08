class A {
    
}

class B extends A {
    
}

// Change to Main
public class InstanceOf
{
	public static void main(String[] args) {
		A obj = new A();
		
		A sup = new B();
		
		System.out.println("sup instanceof B: " + (sup instanceof B));
		System.out.println("sup instanceof A: " + (sup instanceof A));
		System.out.println("obj instanceof A: " + (obj instanceof A));
		System.out.println("obj instanceof B: " + (obj instanceof B));
	}
}
