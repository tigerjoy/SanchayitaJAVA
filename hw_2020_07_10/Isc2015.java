import java.util.Scanner;
 class Plane
{
  int x1;
  int y1;
 Plane(int nx,int ny)
  {
   x1=nx;
   y1=ny;
  }
 void Show()
 {
     System.out.println("X coordinate:"+x1);
     System.out.println("Y coordinate:"+y1);
 }
  
}

class Circle extends Plane
{
    int x2;
    int y2;
    double radius;
    double area;
  Circle(int x1,int y1,int x2,int y2, double radius)
  {
    super(x1,y1);
    this.x2 = x2;
    this.y2 = y2;
    this.radius = radius;
    this.area= 0.0;
  }
  void findRadius()
  {
      radius = (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))/2.0;
  }
  void findArea()
  {
      area = 3.14*(radius*radius);
  }
  
  void Show()
  {
      super.Show();
      findRadius();
      findArea();
      System.out.println("Radius:"+radius);
      System.out.println("Area:"+area);
      
  }
}

// Scored - 10 points
class Isc2015
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x1 coordinate ");
    int x1= sc.nextInt();
    System.out.println("Enter y1 coordinate");
    int y1 = sc.nextInt();
    System.out.println("Enter x2 coordinate ");
    int x2= sc.nextInt();
    System.out.println("Enter y2 coordinate");
    int y2 = sc.nextInt();
    System.out.println("Enter the radius");
    double rad= sc.nextDouble();
    Circle obj = new Circle(x1,y1,x2,y2,rad);
    obj.Show();
  }
}


