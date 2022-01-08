// Scored - 9 points
import java.util.Scanner;
public class Student
{
    static Scanner sc = new Scanner(System.in);
  String name;
  int age;
  // OBSERVATION #1
  // Does the question ask you to define a 
  // default constructor?
 Student()
  {
   name="";
   age=0;
  }
 void inputdetails()
 {
     System.out.println("Enter name");
     name= sc.nextLine();
     System.out.println("Enter age");
     age = sc.nextInt();
     
             
     
 }
 void show()
 {
    System.out.println("Name: " + name);
    System.out.println("Age: "+age);
 }
}

class Marks extends Student
{
  int regnum;
  int marks;
  String subject;
  
  void inputdetails()
  {
      super.inputdetails();
      System.out.println("Enter the reg. number");
      regnum= sc.nextInt();
      System.out.println("Enter the marks");
       marks = sc.nextInt();
       sc.nextLine();
      System.out.println("Enter the subject");
     subject = sc.nextLine();
  }
  
   void show()
  {
      super.show();
      System.out.println("Reg. Number"+regnum);
      System.out.println("Marks"+marks);
      System.out.println("Subject"+subject);
      
     
  }
}

class Sample
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Marks obj = new Marks();
    obj.inputdetails();
    obj.show();
  }
}



