import java.util.Scanner;
class Carton
{
  
  void displayCarton(int num)
  {
    int carton[] = {48,24,12,6};
    int count = 0;
    int counter = 0;
    int temp = num;
    for(int i = 0;i<carton.length;i++)
    {
      int box = temp/carton[i];
      temp = temp%carton[i];
     
      counter += box;
      if(box>0)
      {
        System.out.printf("%-15d X %-15d = %-15d\n",carton[i],box,(carton[i]*box));
         count += carton[i]*box;
      }
    }
    if(num !=count)
    {
        int residual = num-count;
        System.out.print("REMAINING BOXES = ");
        System.out.printf("%-15d X 1 = %-15d\n",residual,(residual *1));
        System.out.println("TOTAL NUMBER OF BOXES   = "+ num);
        counter+=1;
        System.out.println("TOTAL NUMBER OF CARTONS = "+counter);
    }
    else
    {
      System.out.println("REMAINING BOXES   = 0");
      System.out.println("TOTAL NUMBER OF BOXES   = "+ num);
      System.out.println("TOTAL NUMBER OF CARTONS = "+counter);
    }
    
  }
  

  public static void main(String[]args)
  {
    Scanner sc = new  Scanner(System.in);
    System.out.print("N = " );
    int amt = sc.nextInt();
    if(amt<=1000)
    {
      Carton obj = new Carton();
      obj.displayCarton(amt); 
    }
    else
    {
      System.out.println("INVALID INPUT");
    }
  }
}