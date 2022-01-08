// Scored - 0 points
import java.util.Scanner;

// OBSERVATION #1
// Here we need to declare the interface Shape with the
// specifications provided in the question
interface Shape {
  // By default all the method declarations are abstract method
  // and has the access specifier of public
  double area();
}

// OBSERVATION #2
// The class Circle implements the interface Shape

class Circle implements Shape
{
  static Scanner sc = new Scanner(System.in);
  double radius;
 Circle(int r)
  {
    // OBSERVATION #3
    // class Circle does not any data member named r
    // this.r=r;
    radius = r;
  }
  // OBSERVATION #4
  // As the access specifier of area() is public, we can 
  // only make the inherited method area() have an access specifier
  // which is less restrictive than public. Since, there aren't
  // any, the access specifier should be made public.

  // Absence of any access specifier states that the access 
  // specifier is default, which is more restrictive than
  // public, hence, not allowed.
  // double area()
  public double area()
  {
    // OBSERVATION #5
    // There are no data members in Circle with the name r.
    // Also, a type cast to double is not required as 
    // 3.14 is of double type which is the highest type, and thus
    // the result is automatically converted to double.
    // return (double)(3.14*r*r);;
    return (3.14*radius*radius);
  }
}

// OBSERVATION #6
// According to the question class Rectangle must implement 
// the interface Shape
class Rectangle implements Shape
{
  static Scanner sc = new Scanner(System.in);
  double length;
  double breadth;
 Rectangle(int l,int b)
  {
    // OBSERVATION #7
    // This class has no data member named l and b
    // this.l=l;
    // this.b=b;
    length = l;
    breadth = b;
  }
  // OBSERVATION #8
  // As the access specifier of area() is public, we can 
  // only make the inherited method area() have an access specifier
  // which is less restrictive than public. Since, there aren't
  // any, the access specifier should be made public.

  // Absence of any access specifier states that the access 
  // specifier is default, which is more restrictive than
  // public, hence, not allowed.
  // double area()
  public double area()
  {
    // OBSERVATION #9
    // There are no data members in Rectangle with the name l or b.
    // Also, a type cast to double is not required as 
    // length and breadth are of double type which is the highest 
    // type, and thus the result is automatically converted to 
    // double.
    // return (double)(l*b);;
    return (length*breadth);
  }
}

// OBSERVATION #10
// Shape is not a concrete class but an interface.
class Shape extends Circle
{
  double time;
  double rate;
  double interest;
  Simple(String Name, String Pan,double Principal,String acc_no,double time, double rate)
  {
      super(Name, Pan, Principal, acc_no);
      this.time= time;
      this.rate= rate;
      this.interest=0.0;
  }
  void calculate()
  {
      interest = (time*rate*Principal/100.0);
  }
   void show()
  {
      super.display();
      System.out.println("Time: "+time);
      System.out.println("Rate: "+rate);
      System.out.println("Interst: "+interest);
      
      
      
     
  }
}

class SpIsc2016
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name");
    String name = sc.nextLine();
    System.out.println("Enter Pan");
     String Pan = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter Principal");
     double Principal = sc.nextDouble();
    System.out.println("Enter Account Number");
     String acc_no = sc.nextLine();
     sc.nextLine();
    System.out.println("Enter time");
    double time = sc.nextDouble();
    System.out.println("Enter Rate");
    double rate = sc.nextDouble();
    Simple obj = new Simple(name,Pan,Principal,acc_no,time,rate);
    obj.show();
  }
}




