// Scored - 10 points
import java.util.Scanner;
public class Author 
{
  static Scanner sc = new Scanner(System.in);
  String authorno;
  String name;
  
  
 Author()
  {
   authorno="";
   name="";
   
  }
  Author(String authorno, String name)
  {
      this.authorno= authorno;
      this.name= name;
  }
 void show()
 {
     System.out.println("Name :"+name);
     System.out.println("Auhtor No. :"+authorno);
      
 }
}

class Booklist extends Author
{
  long bookno;
  String bookname;
  float price;
  int edition;
  Booklist(String authorno, String name,long bookno,String bookname,float price,int edition)
  {
      super(authorno,name);
      this.bookno= bookno;
      this.bookname= bookname;
      this.price=price;
      this.edition= edition;
  }
  
   void show()
  {
      super.show();
      System.out.println("Book Number"+bookno);
      System.out.println("Book Name"+bookname);
      System.out.println("Price"+price);
      System.out.println("Edition"+edition);
      
      
     
  }
}

class SpIsc2013
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Author Number");
    String authorno = sc.nextLine();
    System.out.println("Enter Author name");
     String authorname = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter Book Number");
     long bookno = sc.nextLong();
    System.out.println("Enter Book Name");
    String bookname = sc.nextLine();
    System.out.println("Enter Price");
    float price = sc.nextFloat();
    System.out.println("Enter Edition");
    int edt = sc.nextInt();
    Booklist obj = new Booklist(authorno,authorname,bookno,bookname,price,edt);
    obj.show();
  }
}




