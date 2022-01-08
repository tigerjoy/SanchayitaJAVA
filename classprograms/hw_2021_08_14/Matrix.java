// Scored - 10 points
import java.util.Scanner;
class Matrix
{
    static Scanner sc = new Scanner(System.in);
    int arr[][];
    int m;
    int n;
    Matrix(int mm,int nn)
    {
        m= mm;
        n= nn;
        arr = new int[m][n];
    }
    void input()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element "+ (i+1)+" "+(j+1));
                arr[i][j]= sc.nextInt();
            }
        }
                
    }
    Matrix add(Matrix A)
    {
        // 1st object -> A
        // 2nd object -> this
        if(this.m == A.m && this.n == A.n){
          Matrix res = new Matrix(m,n);
          for(int i=0;i< m;i++)
          {
              for(int j=0;j< n;j++)
              {
                  res.arr[i][j]=A.arr[i][j]+arr[i][j] ;
              }
          }
          return res;
        }
        System.out.println("The matrices are not comfortable for addition.");
        return null;
    }
    Matrix subtract(Matrix A)
    { 
      if(this.m == A.m && this.n == A.n){
        Matrix res = new Matrix(m,n);
        for(int i=0;i< m;i++)
        {
            for(int j=0;j< n;j++)
            {
                res.arr[i][j]=A.arr[i][j]-arr[i][j] ;
            }
        }
        return res;
      }
      System.out.println("The matrices are not comfortable for subtraction.");
      return null;
    }
    Matrix multiply(Matrix A)
    {
      // int mat1[][] -> this.arr
      // int mat2[][] -> A.arr
      // int prod[][] -> prod.arr 
      if(n == A.m)
      {
        int row = this.m;
        int col = A.n;
        // B.m = m;
        // B.n= A.m;
        Matrix prod = new Matrix(row,col);
        for(int i=0;i<prod.m;i++)
        {
          for(int j =0;j<prod.n;j++)
          {
            prod.arr[i][j] = 0;
            for(int k=0;k<A.m;k++)
            {
              prod.arr[i][j]+=(arr[i][k]*A.arr[k][j]);
            }
          }
        }
        return prod;
      }
      else
      {
        System.out.println("The matrices are not comfortable for multiplication");
        return null;
      }
  }
  Matrix scalarProduct(int scalar)
  {
      Matrix B= new Matrix(m,n);
      for(int i=0;i<m;i++)
      {
          for(int j =0;j<n;j++)
          {
              B.arr[i][j]= scalar*arr[i][j];
          }
      }
      return B;
  }
  void show()
  {
      for(int i=0;i<m;i++)
      {
          for(int j =0;j<n;j++)
          {
              System.out.print(arr[i][j]+"\t");
          }
          System.out.println();
      }
  }
  public static void main(String[] args) 
  {
      System.out.println("Enter number of rows for MATRIX 1");
      int row1 = sc.nextInt();
      System.out.println("Enter number of columns for MATRIX 1");
      int col1 = sc.nextInt();
      Matrix A = new Matrix(row1,col1);
      A.input();
      System.out.println("Enter number of rows for MATRIX 2");
      int row2 = sc.nextInt();
      System.out.println("Enter number of columns for MATRIX 2");
      int col2 = sc.nextInt();
      Matrix B = new Matrix(row2,col2);
      B.input();
      System.out.println("ADDITION");
      Matrix res = A.add(B);
      if(res != null){
        res.show();
      }
      System.out.println("SUBTRACTION");
      Matrix res1= A.subtract(B);
      if(res1 != null){
        res1.show();
      }
      System.out.println("MULTIPLICATION");
      Matrix res2 = A.multiply(B);
      if(res2 != null){
        res2.show();
      }
      System.out.println("SCALAR MULTIPLICATION");
      System.out.println("Enter the number to be multiplied");
      int scl = sc.nextInt();
      Matrix res3 = A.scalarProduct(scl);
      res3.show(); 
  }
}