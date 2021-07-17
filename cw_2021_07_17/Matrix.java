// ISC 2013

import java.util.Scanner;
class Matrix
{
  int arr[][];
  int m;
  int n;
  
  Matrix(int mm,int nn)
  {
    m=mm;
    n=nn;
    arr= new int[m][n];
  }
  void fillArray()
  {
    Scanner sc = new Scanner(System.in);
    // Enter element 1,1: 
    for(int i=0;i<=m-1;i++)
    {
      for(int j=0;j<=n-1;j++)
      {
        System.out.printf("Enter element %d , %d:",i+1,j+1);
        arr[i][j]=sc.nextInt();
      }
    }
  }
  Matrix SubMat(Matrix A)
  {
    // mat1 -> this.arr, mat2 -> A.arr
    // diff -> diff.arr
    Matrix diff = new Matrix(m,n);
    for(int i=0;i<=m-1;i++)
    {
      for(int j=0;j<=n-1;j++)
      {
        diff.arr[i][j] = A.arr[i][j]- this.arr[i][j];
      }
    }
    return diff;
    
  }
  void display()
  {
    for(int i=0;i<=m-1;i++)
    {
      for(int j=0;j<=n-1;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("For Matrix 1");
    System.out.println("Enter the number of rows");
    int row1= sc.nextInt();
    System.out.println("Enter the number of columns");
    int col1= sc.nextInt();
    System.out.println("For Matrix 2");
    System.out.println("Enter the number of rows");
    int row2= sc.nextInt();
    System.out.println("Enter the number of columns");
    int col2= sc.nextInt();
    if(row1==row2 && col1==col2)
    {
      Matrix obj1 = new Matrix(row1,col1);
      System.out.println("For Matrix 1");
      obj1.fillArray();
      Matrix obj2 = new Matrix(row2,col2);
      System.out.println("For Matrix 2");
      obj2.fillArray();
      Matrix diff = obj1.SubMat(obj2);
      System.out.println("MATRIX 1:");
      obj1.display();
      System.out.println("MATRIX 2:");
      obj2.display();
      System.out.println("RESULT (MATRIX 2 - MATRIX 1):");
      diff.display();
    }
    else
    {
      System.out.println("The matrices are not compatible");
    }
  }
}