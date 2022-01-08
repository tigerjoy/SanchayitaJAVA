import java.util.Scanner;
// Scored - 10 points
public class Student
{
    static Scanner sc = new Scanner(System.in);
  String name;
  String sex;
  int age;
  
 Student()
  {
   name="";
   sex="";
   age=0;
  }
 void inputDetails()
 {
     System.out.println("Enter name");
     name= sc.nextLine();
     System.out.println("Enter sex");
     sex= sc.nextLine();
     System.out.println("Enter age");
     age = sc.nextInt(); 
 }
 void show()
 {
    System.out.println("Name: " + name);
    System.out.println("Sex: " + sex);
    System.out.println("Age: "+age);
 }
}

class Marks extends Student
{
  int rollno;
  int marks;
  String subject;
  
  void readDetails()
  {
      System.out.println("Enter the roll number");
      rollno = sc.nextInt();
      System.out.println("Enter the marks");
       marks = sc.nextInt();
      System.out.println("Enter the subject");
     subject = sc.nextLine();
  }
  int point()
  {
      if(marks>=90)
      {
          return 1;
      }
      else if(marks<90&&marks>=70)
      {
          return 2;
      }
      else if(marks<70&&marks>=50)
      {
          return 3;
      }
      else if(marks<50&&marks>=40)
      {
          return 4;
      }
      else
      {
          return 5;
      }
  }
   void show()
  {
      super.show();
      System.out.println("Roll Number"+rollno);
      System.out.println("Marks"+marks);
      System.out.println("Subject"+subject);
      System.out.println("Point"+point());
      
     
  }
}

class Sample3
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Marks obj = new Marks();
    obj.inputDetails();
    obj.readDetails();
    obj.show();
  }
}



