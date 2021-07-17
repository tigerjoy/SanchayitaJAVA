import java.util.Scanner;
interface Data
{
  public static final double pi = 3.14;
  public double volume();
}

class Base
{
  double rad;
  Base(double rad)
  {
    this.rad = rad;
  }
  void show()
  {
    System.out.println("Radius ="+rad);
  }
}

class CalVol extends Base implements Data
{
  double ht;
  CalVol(double ht, double rad)
  {
    super(rad);
    this.ht= ht;
  }
  // The access specifier has to be public
  public double volume()
  {
    return pi*rad*rad*ht;
  }
  void show()
  {
    super.show();
    System.out.println("Volume:"+volume());
  }
}

class Isc2020
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius");
    double rad = sc.nextDouble();
    System.out.println("Enter the height");
    double ht = sc.nextDouble();
    CalVol obj = new CalVol(ht,rad);
    obj.show();
  }
}