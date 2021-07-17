import java.util.Scanner;
class AntiSpiralFill
{
  static Scanner sc = new Scanner(System.in);
  
  void antiSpiralFill(int arr[][])
  {
    int n = arr.length;
    int k = n*n;
    int rowStart = 0;
    int colStart = 0;
    int rowEnd = n-1;
    int colEnd = n-1;
    while(k != 0)
    {
      //Traverse Upwards
      for(int row = rowEnd; row>=rowStart;row--)
      {
        arr[row][colStart]=k;
        k--;
      }
      //Traverse Right
      for(int col=colStart+1;col<=colEnd;col++)
      {
        arr[rowStart][col]=k;
        k--;
      }
      //Traverse down
      for(int row= rowStart+1;row<=rowEnd;row++)
      {
        arr[row][colEnd]=k;
        k--;
      }
      //Traverse Left
      for(int col = colEnd-1;col>=colStart+1;col-- )
      {
        arr[rowEnd][col]=k;
        k--;
      }
      rowStart++;
      colStart++;
      rowEnd--;
      colEnd--;
    }
  }
  void display(int arr[][])
  {
    int row = arr.length;
    int col = arr[0].length;
    for(int i = 0;i<row;i++)
    {
      for(int j = 0;j<col;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void main(String[]args)
  {
    System.out.println("Enter the size of the matrix");
    int size = sc.nextInt();
    int arr[][] = new int[size][size];
    AntiSpiralFill obj = new AntiSpiralFill();
    System.out.println("The elements in Spiral order are :");
    obj.antiSpiralFill(arr);
    obj.display(arr);
  }
}