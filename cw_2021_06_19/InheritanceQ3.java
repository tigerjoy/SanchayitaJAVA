// Classify the following function call bindings 
// into (i) Static/Early Binding, 
// (ii) Dynamic/Late Binding
class SuperClass{
    private void privateMethod(){
        System.out.println("Class A: privateMethod()");
    }
    static void staticMethod(){
        System.out.println("Class A: staticMethod()");
    }
    final void finalMethod(){
        System.out.println("Class A: finalMethod()");
    }
    void func1(){
        System.out.println("Class A: func1()");
    }
    void func2(int num1){
        System.out.println("Class A: func2()");
    }
    void func3(){
      privateMethod();
    }
}

class SubClass extends SuperClass {
    static void staticMethod(){
        System.out.println("Class B: staticMethod()");
    }
    void func1(){
        System.out.println("Class B: func1()");
    }
    int func2(int num1, int num2){
        System.out.println("Class B: func1()");
    }
}


public class InheritanceQ3
{
	public static void main(String[] args) {
		SuperClass objSuper = new SuperClass();
		SubClass objSub = new SubClass();
		SuperClass objSuperSub = new SubClass();
		
		objSuper.staticMethod(); // 1. 
		objSub.staticMethod();   // 2.
		objSub.finalMethod();    // 3.
		objSuperSub.func1();     // 4.
		objSub.func2(1,2);       // 5.
		objSub.func2(1);         // 6.
    objSub.func3();          // 7.
	}
}
