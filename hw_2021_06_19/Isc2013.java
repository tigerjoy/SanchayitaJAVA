import java.util.Scanner;
class Perimeter
{
  double a;
  double b;
  
  // OBSERVATION #1
  // Was the default constructor asked in the question?
  // Perimeter()
  // {
  //   a=0.0;
  //   b=0.0;
  // }

  Perimeter(double a, double b)
  {
    this.a = a;
    this.b = b;
  }

  double Calculate()
  {
      return (2*(a+b));
  }

  void show()
  {
      System.out.println("Length"+a);
      System.out.println("Breadth"+b);
      System.out.println("Perimeter"+Calculate());
  }
}

class Area extends Perimeter
{
  double h;
  double area;
  Area(double a, double b , double h)
  {
    super(a,b);
    this.h = h;
    // OBSERVATION #2
    // Where are you getting the area parameter from?
    // this.area = area;
  }
  
  void doarea()
  {
    area =(b*h);
   
  }

  void show()
  {
      super.show();
      System.out.println("Area:"+(area));
      System.out.println("Perimeter"+2*(a+b));
  }
}

// Scored - 9 points
class Isc2013
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Length");
    double a= sc.nextDouble();
    System.out.println("Breadth");
    double b= sc.nextDouble();
    System.out.println("Height");
    double h= sc.nextDouble();
    Area obj = new Area(a,b,h);
    obj.show();
  }
}

