// ISC 2017

import java.util.Scanner;
class Adder
{
  int a[];
  
  Adder()
  {
    a = new int[2];
    a[0]=0;
    a[1]=0;
  }
  // Enter the hours:
  // Enter the minutes:
  void readtime()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the hours");
    a[0]= sc.nextInt();
    System.out.println("Enter the minutes");
    a[1]=sc.nextInt();
  }
  // Function call
  // sum.addtime(obj1, obj2);
  // X -> obj1, Y -> obj2
  // this -> sum
  void addtime(Adder X,Adder Y)
  {
    // h1 -> X.a[0], m1 -> X.a[1]
    // h2 -> Y.a[0], m2 -> Y.a[1]
    // h3 -> this.a[0], m3 -> this.a[1]
    this.a[0] =(X.a[0]+Y.a[0])+(X.a[1]+Y.a[1])/60;
    this.a[1]=(X.a[1]+Y.a[1])%60;
  }
  // Hours = 6 Minutes = 32
  void disptime()
  {
    System.out.println("Hours ="+a[0]+" Minutes ="+a[1]);
  }
  public static void main(String[]args)
  {
    Adder obj1 = new Adder();
    System.out.println("Enter Time 1");
    obj1.readtime();
    Adder obj2 = new Adder();
    System.out.println("Enter Time 2");
    obj2.readtime();
    Adder sum = new Adder();
    // currently calling object sum
    // we need to call -> addtime
    // What do we need to pass? -> obj1 , obj2
    sum.addtime(obj1,obj2);
    System.out.println("The first Time:");
    obj1.disptime();
    System.out.println("The second Time:");
    obj2.disptime();
    System.out.println("The sum Time:");
    sum.disptime();
    
  }
}