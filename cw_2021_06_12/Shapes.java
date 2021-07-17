import java.util.Scanner;
abstract class Dimensions
{
  int noOfSides;
  double sides[];
  double area;
  
  Dimensions(int noOfSides)
  {
    this.noOfSides = noOfSides;
    sides = new double[noOfSides];
    area =0.0;
  }
  void readSides()
  {
    Scanner sc = new Scanner(System.in);
    for(int i =0;i<noOfSides;i++)
    {
      System.out.println("Enter the length of side "+(i+1));
      sides[i] = sc.nextDouble();
    }
  }
  // double calcArea()
  // {
  //   return 0.0;
  // }
  abstract double calcArea();
  // WAY 1
  // abstract void display();
}

// WAY 2
// abstract class DimensionsRedefined extends Dimensions
// {
//   abstract void display();
// }

class Square extends Dimensions
{
  Square()
  {
    super(4);
    System.out.println("-------SQUARE-------");
  }
  double calcArea()
  {
    area = sides[0]*sides[0];
    return area;
  }
  void display()
  {
    System.out.println("The area of square is:"+area);
  }
}

class Rectangle extends Dimensions
{
  Rectangle()
  {
    super(4);
    System.out.println("-------RECTANGLE-------");
  }
  double calcArea()
  {
    area = sides[0]*sides[1];
    return area;
  }
  void display()
  {
    System.out.println("The area of rectangle is:"+area);
  }
}

class Triangle extends Dimensions
{
  Triangle()
  {
    super(3);
    System.out.println("-------TRIANGLE-------");
  }
  double calcArea()
  {
    double sp = (sides[0]+sides[1]+sides[2])/3.0;
    area = Math.sqrt(sp*(sp-sides[0])*(sp-sides[1])*(sp-sides[2]));
    return area;
  }
  void display()
  {
    System.out.println("The area of triangle is:"+area);
  }
}

class Shapes 
{
  // static int coverage(Square s,double wallArea)
  // {
  //   return (int) (wallArea/s.calcArea());
  // }
  // static int coverage(Triangle t,double wallArea)
  // {
  //   return (int) (wallArea/t.calcArea());
  // }
  // static int coverage(Rectangle r,double wallArea)
  // {
  //   return (int) (wallArea/r.calcArea());
  // }

  static int coverage(Dimensions obj, double wallArea)
  {
    return (int) (wallArea/obj.calcArea());
  }
  public static void main(String args[])
  {
    Square square = new Square();
    square.readSides();
    square.calcArea();
    square.display();
    Triangle triangle = new Triangle();
    triangle.readSides();
    triangle.calcArea();
    triangle.display();
    Rectangle rectangle = new Rectangle();
    rectangle.readSides();
    rectangle.calcArea();
    rectangle.display();
    
    System.out.println("No of squares = " + coverage(square, 1000));
    System.out.println("No of triangles = " + coverage(triangle, 1000));
    System.out.println("No of rectangles = " + coverage(rectangle, 1000));
  }
}