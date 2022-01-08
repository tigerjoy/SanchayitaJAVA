import java.util.Scanner;
class Shift
{
  static Scanner sc = new Scanner(System.in);
  int mat[][];
  int m;
  int n;
  Shift(int mm, int nn)
  {
    m = mm;
    n = nn;
    mat = new int[m][n];
  }
  void input()
  {
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.println("Enter element "+(i+1)+" "+(j+1));
        mat[i][j]= sc.nextInt();
      }
    }
  }
  // Shift obj1 = ...;
  // Shift obj2 = ....;
  // obj2.cyclic(obj1)
  void cyclic(Shift P)
  {
    // this.mat <- obj2
    // P.mat <- P
    // 1. Copy contents from P.mat to this.mat
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        this.mat[i][j]=P.mat[i][j];
      }
    }
    // 2. Apply cyclic shift to this.mat
    for(int i=0;i<m-1;i++)
    {
      int temp[]=mat[i];
      mat[i]=mat[i+1];
      mat[i+1]=temp;
    }
  }
  void display()
  {
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(mat[i][j]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of rows");
    int row = sc.nextInt();
    System.out.println("Enter the no. of columns");
    int col = sc.nextInt();
    Shift obj1 = new Shift(row,col);
    Shift obj2 = new Shift(row,col);
    obj1.input();
    obj2.cyclic(obj1);
    System.out.println("BEFORE ROW-WISE SHIFTING:");
    obj1.display();
    System.out.println("AFTER ROW-WISE SHIFTING:");
    obj2.display();
  }
}