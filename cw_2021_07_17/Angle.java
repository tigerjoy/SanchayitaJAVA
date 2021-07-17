// ISC Sample Paper 3

import java.util.Scanner;
class Angle
{
  int deg;
  int min;

  Angle()
  {
    deg=0;
    min=0;
  }
  void inputAngle()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter degree");
    deg = sc.nextInt();
    System.out.println("Enter minute");
    min = sc.nextInt();
  }
  // 12 degree 32 minutes
  void dispAngle()
  {
    System.out.printf("%d degree %d minutes\n",deg,min);
  }
  Angle sumAngle(Angle A, Angle B)
  {
    // d1 -> A.deg, m1 -> A.min
    // d2 -> B.deg, m2 -> B.min
    // Angle sum, d3 -> sum.deg, m3 -> sum.min
    Angle sum = new Angle();
    sum.deg=(A.deg+B.deg)+(A.min+B.min)/60;
    sum.min=(A.min+B.min)%60;
    return sum;
  }
  public static void main(String[]args)
  {
    Angle obj1 = new Angle();
    System.out.println("Enter details for first angle");
    obj1.inputAngle();
    Angle obj2 = new Angle();
    System.out.println("Enter details for second angle");
    obj2.inputAngle();
    // int sum = obj.sumOfDigits(num);
    Angle sum = obj1.sumAngle(obj1,obj2);
    System.out.println("The first Angle:");
    obj1.dispAngle();
    
    System.out.println("The second Angle:");
    obj2.dispAngle();
    System.out.println("The sum Angle:");
    sum.dispAngle();
  }
}