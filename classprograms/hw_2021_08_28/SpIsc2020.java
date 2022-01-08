// Scored - 5 points
// Please refer to hw_2021_08_14/SpIsc2020.java
import java.util.Scanner;

interface Shape
{
    double area();
}
class Circle implements Shape
{
    double radius;
    Circle(int r)
    {
        this.r=r;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shape
{
    double length;
    double breadth;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    double area()
    {
        return length*breadth;
    }
}
public class SpIsc2020 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int rad = sc.nextInt();
        Circle obj1 = new Circle();
        System.out.println("Enter the length");
        int l= sc.nextInt();
        System.out.println("Enter the breadth");
        int b= sc.nextInt();
        Rectangle obj2 = new Rectangle();
        System.out.println("Area of Circle:"+obj1.area(rad));
        System.out.println("Area of Rectangle:"+obj1.area(l,b));
        
    }
}
