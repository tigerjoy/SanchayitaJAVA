// Fill in the blanks

class A{
    int num;
    A(){
        num = 10;
    }
    void display(){
        System.out.println("In class A num=" + ______);
    }
}
class B extends A{
    int num;
    B(){
        num = 20;
    }
    void display(){
        System.out.println("In class A num=" + ______);
        System.out.println("In class B num=" + ______);
    }
}
class C extends B{
    int num;
    C(){
        num = 30;
    }
    void display(){
        System.out.println("In class A num=" + ______);
        System.out.println("In class B num=" + ______);
        System.out.println("In class C num=" + ______);
    }
}

public class InheritanceQ1
{
	public static void main(String[] args) {
		C obj = new C();
		obj.display();
	}
}

// public class Main
// {
// 	public static void main(String[] args) {
// 		C obj = new C();
// 		obj.display();
// 	}
// }