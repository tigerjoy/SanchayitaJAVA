class MatrixMultiplication
{
  public static void main(String args[])
  {
    int mat1[][] = {
      {1, 2, 3, 4},
      {4, 5, 6, 7},
      {8, 9, 10, 11}
    };
    int r1 = 3, c1 = 4;
    int mat2[][] = {
      {1, 2, 3},
      {4, 5, 6},
      {8, 9, 10},
      {5, 7, 8}
    };
    int r2 = 4, c2 = 3;

    if(c1 == r2)
    {
      int r3 = r1;
      int c3 = c2;
      int prod[][]= new int[r3][c3];
      for(int i=0;i<r3;i++)
      {
        for(intj =0;j<c3;j++)
        {
          prod[i][j] = 0;
          for(int k=0;k<r2;k++)
          {
            prod[i][j]+=(mat1[i][k]*mat2[k][j]);
          }
        }
      }
    }
    else
    {
      System.out.println("The matrices are not comfortable for multiplication");
    }
  }
}