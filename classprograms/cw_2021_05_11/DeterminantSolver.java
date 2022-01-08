import java.util.Scanner;
class DeterminantSolver
{
  static Scanner sc = new Scanner(System.in);
  void input(int mat[][])
  {
    int rows = mat.length;
    int cols = mat[0].length;
    for(int i = 0;i<=rows-1;i++)
    {
      for(int j = 0;j<=cols-1;j++)
      {
        System.out.printf("Enter element %d,%d : ",(i+1),(j+1));
        mat[i][j]=sc.nextInt();
      }
    }
  }

  // 2x2 det = ad - bc
  // a = mat[0][0]
  // d = mat[1][1]
  // b = mat[0][1]
  // c = mat[1][0]
  int calc2Determinant(int mat[][])
  {
     return (mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0]);
  }
  
  int calc3Determinant(int mat[][])
  {
    int minor[][] = new int [2][2];
    int det = 0;
    for(int col = 0;col<=2;col++)
    {
      // Finding the minor for element mat[0,col]
      int mCol=0;int mRow =0;
      for(int row =1;row<=2;row++)
      {
        mCol=0;
        for(int j = 0;j<=2;j++)
        {
          if(j==col)
          {
            continue;
          }
          else
          {
            minor[mRow][mCol]= mat[row][j];
            mCol++;
          }
        }
        mRow++;
      }
      // Find det of minor and add to det with proper sign
      if(col%2==0)
      {
        det+=calc2Determinant(minor);
      }
      else
      {
        det-=calc2Determinant(minor);
      }
    }
    return det;
  }
  public static void main(String[]args)
  {
    System.out.println("Enter the number of rows");
    int row = sc.nextInt();
    System.out.println("Enter the number of columns");
    int col = sc.nextInt();
    int mat[][] = new int[row][col];
    DeterminantSolver obj = new DeterminantSolver();
    obj.input(mat);
    int det = obj.calc3Determinant(mat);
    System.out.println("THE DETERMINANT IS : "+ det);
  }
}