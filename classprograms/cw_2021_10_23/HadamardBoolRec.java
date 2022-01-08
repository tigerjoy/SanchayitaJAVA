import java.util.Scanner;
class HadamardBoolRec
{
  static Scanner sc = new Scanner(System.in);
  // log2(n) = log10(n) / log10(2)
  boolean checkBase(int n)
  {
    int index= (int)(Math.log(n)/Math.log(2));
    return((int)(Math.pow(2,index))==n);
  }
  void fillHadamardMatrix(boolean arr[][],int n)
  {
    if(n==1)
    {
      arr[0][0]=true;
    }
    else
    {
      fillHadamardMatrix(arr, n/2);
      int offset = n/2;
      for(int r=0;r<offset;r++)
      {
        for(int c=0;c<offset;c++)
        {
          arr[r][c+offset]=arr[r][c];
          arr[r+offset][c]=arr[r][c];
          arr[r+offset][c+offset]=!arr[r][c];
        }
      }
    }
  }
  void display(boolean arr[][])
  {
    int row=arr.length;
    int col= arr[0].length;
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.printf("%4s",arr[i][j]==true?"T":"F");
      }
      System.out.println();
    }
  }
  public static void main(String[]args)
  {
    HadamardBoolRec obj = new HadamardBoolRec();
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    if(obj.checkBase(n))
    {
      boolean arr[][]=new boolean[n][n];
      obj.fillHadamardMatrix(arr, n);
      obj.display(arr);
    }
    else
    {
      System.out.println("n is not a power of 2");
    }
  }
}