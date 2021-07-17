class CallStack{
  
  int function3(){
    System.out.println("function3");
    return 3;
  }

  int function2(){
    System.out.println("function2");
    return 2 + function3();
  }

  int function1(){
    System.out.println("function1");
    return 1 + function2();
  }

  public static void main(String[]args){
    System.out.println("main");
    CallStack obj = new CallStack();
    int x = obj.function1();
    
    System.out.println("Return Value = " + x);
  }
}