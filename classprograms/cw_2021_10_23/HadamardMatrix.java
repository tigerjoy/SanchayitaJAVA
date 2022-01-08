import java.util.Scanner;
class HadamardMatrix
{
  static Scanner sc = new Scanner(System.in);
  // log2(n) = log10(n) / log10(2)
  boolean checkBase(int n)
  {
    int index= (int)(Math.log(n)/Math.log(2));
    return((int)(Math.pow(2,index))==n);
  }
  void fillHadamardMatrix(int arr[][],int n)
  {
    arr[0][0]=1;
    int offset=1;
    while(n!=offset)
    {
      // Copy operations
      for(int r=0;r<=offset-1;r++)
      {
        for(int c=0;c<=offset-1;c++)
        {
          arr[r][c+offset]=arr[r][c];
          arr[r+offset][c]=arr[r][c];
          arr[r+offset][c+offset]=-arr[r][c];
        }
      }
      offset*=2;
    }
  }
  void display(int arr[][])
  {
    int row=arr.length;
    int col= arr[0].length;
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.printf("%4d",arr[i][j]);
      }
      System.out.println();
    }
  }
  public static void main(String[]args)
  {
    HadamardMatrix obj = new HadamardMatrix();
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    if(obj.checkBase(n))
    {
      int arr[][]=new int[n][n];
      obj.fillHadamardMatrix(arr, n);
      obj.display(arr);
    }
    else
    {
      System.out.println("n is not a power of 2");
    }
  }
}