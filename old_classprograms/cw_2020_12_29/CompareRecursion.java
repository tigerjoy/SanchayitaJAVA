import java.util.Scanner;
class CompareRecursion
{
  long genFibo(int t)
  {
    if(t==0)
    {
      return 0;
    }
    else if(t==1)
    {
      return 1;
    }
    else
    {
      return genFibo(t-1)+genFibo(t-2);
    }
  }
  long iterativeFibo(int t)
  {
    if(t == 0){
      return 0;
    }
    else if(t == 1){
      return 1;
    }
    else{
      long t1 = 0, t2 = 1, t3 = 1;
      for(int i = 2; i <= t; i++){
        t3 = t1 + t2;
        t1 = t2;
        t2 = t3;
      }
      return t3;
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    CompareRecursion obj = new CompareRecursion();
    
    System.out.println("obj.genFibo(5) = " + obj.genFibo(5));
    System.out.println("obj.genFibo(10) = " + obj.genFibo(10));
    System.out.println("obj.genFibo(14) = " + obj.genFibo(14));
    System.out.println("obj.genFibo(50) = " + obj.genFibo(50));
    
    
    /*
    System.out.println("obj.iterativeFibo(5) = " + obj.iterativeFibo(5));
    System.out.println("obj.iterativeFibo(10) = " + obj.iterativeFibo(10));
    System.out.println("obj.iterativeFibo(14) = " + obj.iterativeFibo(14));
    System.out.println("obj.iterativeFibo(50) = " + obj.iterativeFibo(50));
    */
  }
}