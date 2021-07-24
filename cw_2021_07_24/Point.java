import java.util.Scanner;
class Point
{
  static Scanner sc = new Scanner(System.in);
  double x;
  double y;
   
  public static void main(String [] args)
  {
    Point obj1 = new Point();
    System.out.println("Enter coordinates of the first point");
    obj1.readPoint();
    Point obj2 = new Point();
    System.out.println("Enter coordinates of the second point");
    obj2.readPoint();
    Point midp = obj1.midpoint(obj1,obj2);
    System.out.println("The first point is:");
    obj1.displaypoint();
    System.out.println("The second point is:");
    obj2.displaypoint();
    System.out.println("The midpoint is:");
    midp.displaypoint();
  }

  Point()
  {
    this.x=0.0;
    this.y=0.0;
  }
  
  void readPoint()
  {
    System.out.println("Enter the x coordinate ");
    x = sc.nextDouble();
    System.out.println("Enter the y coordinate ");
    y= sc.nextDouble();
  }
  
  Point midpoint(Point A, Point B)
  {
    // A ->obj1
    // B ->obj2
    // x1->A.x ,y1-> A.y
    // x2->B.x ,y2->B.y
    // x->result.x , y->result.y
    Point result = new Point();
    result.x = (A.x+B.x)/2.0;
    result.y= (A.y+B.y)/2.0;
    return result;
  }
  // P(x, y)
  void displaypoint()
  {
    System.out.printf("P(%.2f,%.2f)\n",this.x,this.y);
  }
}