class Test{
  void func1(){
    if(true){
      System.out.println("Start of func1()");
      return;
    }
    System.out.println("End of func1()");
  }
  void func2(){
    System.out.println("Start of func2()");
    func1();
    System.out.println("End of func2()");
  }
  public static void main(String[]args){
    Test obj = new Test();
    obj.func2();
    System.out.println("End of main()");
  }
}






/*
  void func1(){
    if(true){
      System.out.println("Start of func1()");
      return;
    }
    System.out.println("End of func1()");
  }
*/