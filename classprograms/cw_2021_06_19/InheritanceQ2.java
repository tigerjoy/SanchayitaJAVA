// Which methods are
// (i) Overridden
// (ii) Overloaded
class A{
    int func1(int num1, int num2){
        System.out.println("Class A: func1()");
        return num1 + num2;
    }
    int func2(int num1, int num2){
        System.out.println("Class A: func2()");
        return num1 * num2;
    }
    void func3(){
        System.out.println("Class A: func3()");
    }
}
class B extends A{
    double func1(double num1, double num2){
        System.out.println("Class B: func1()");
        return num1 + num2;
    }
    int func2(int num1, int num2){
        System.out.println("Class B: func2()");
        return num1 - num2;
    }
}
class C extends B{
    int func1(int num1, int num2, int num3){
        System.out.println("Class C: func1()");
        return num1 + num2 + num3;
    }
    void func3(){
        System.out.println("Class C: func3()");
    }
}

class InheritanceQ2{
  public static void main(String[]args){
    B obj = new B();
  }
}

// class Main{
//   public static void main(String[]args){
//     B obj = new B();
//     obj.func1(5.0, 7.0);
//   }
// }