// Fill in the blanks

class A{
    int num;
    A(){
        num = 10;
    }
    void display(){
        System.out.println("In class A num=" + num);
    }
}
class B extends A{
    int num;
    B(){
        num = 20;
    }
    void display(){
        System.out.println("In class A num=" + super.num);
        System.out.println("In class B num=" + num);
    }
}
class C extends B{
    int num;
    C(){
        num = 30;
    }
    void display(){
        // Not possible
        // System.out.println("In class A num=" + super.super.num);
        System.out.println("In class B num=" + super.num);
        System.out.println("In class C num=" + num);
    }
}

public class InheritanceQ1Answer
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