import java.util.Scanner;
class Isc2018String
{
  static Scanner sc = new Scanner(System.in);
  String arr[];
  int N;

  Isc2018String(int N)
  {
    this.N = N;
    arr = new String[N];
  }

  int lengthOfLongest()
  {
    int size = arr.length;
    int max = arr[0].length();
    for(int i = 1;i<size;i++)
    {
      if(arr[i].length()>max)
      {
        max= arr[i].length();
      }
    }
    return max;
  }

  String genSpaces(int n)
  {
    String spaces = "";
    for(int i = 1;i<=n;i++)
    {
      spaces = spaces+ " ";
    }
    return spaces;
  }

  void input()
  {
    for(int i =0;i<arr.length;i++)
    {
      System.out.print("Team "+(i+1)+": ");
      arr[i]= sc.nextLine();
    }
  }

  void displayBanner()
  {
    int length = arr[0].length();
    for(int i =0;i<length;i++)
    {
      for(String str: arr)
      {
        System.out.print(str.charAt(i)+"\t");
      }
      System.out.println();
    }
  }

  void fixPadding()
  {
    int longestLength = lengthOfLongest();
    for(int i =0;i<N;i++)
    {
      // ERROR HERE
      //int spaceLength = arr[i].length() - longestLength;
      // Should be
      int spaceLength = longestLength - arr[i].length();
      arr[i]= arr[i]+ genSpaces(spaceLength);
    }
  }

  public static void main(String[]args)
  {
    System.out.print("N = ");
    int N1 = sc.nextInt();
    sc.nextLine();
    if(N1>2 && N1<9)
    {
      Isc2018String obj = new Isc2018String(N1);
      obj.input();
      obj.fixPadding();
      obj.displayBanner();
    }
    else
    {
      System.out.println("Invalid Input");
    }
  }
}