import java.util.Scanner;
// Scored - 6 points
public class MyArray 
{
    static Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    int lb;
    int ub;
  // OBSERVATION #1
  // The question says, "MyArray contains an array of 
  // n integers (n <= 100)...", so why should you take
  // the size of the array as input from the user, if
  // only the default constructor is specified?
  MyArray()
  {
    // System.out.println("Enter the size of the array");
    // n = sc.nextInt();
    n = 7;
   arr = new int[this.n];
  }
  void readArray()
  {
     
     for(int i=0;i<n;i++)
    {
      System.out.println("Enter element"+(i+1));
      arr[i]=sc.nextInt();
    }
  }
  void displayArray()
  {
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+",");
    }
    System.out.println();
  }
  // OBSERVATION #2
  // Did you run this program?
  int binarySearch(int key)
  {
      // int lb =0;
      // int ub = arr.length-1;
      // int pos =-1;
      int mid=(lb+ub)/2;
    if(lb>ub)
    {
      return -999;
    }
    else if(key==arr[mid])
    {
      return mid;
    }
    else if(key<arr[mid])
    {
        ub= mid-1;
       return binarySearch( key );
    }
    else
    {
        lb=mid+1;
      return binarySearch( key );
    }
    
  }
    public static void main(String[] args) 
    {
        
        MyArray obj1 = new MyArray();
        obj1.readArray();
        obj1.displayArray();
        System.out.println("Enter the key");
        int k= sc.nextInt();
        obj1.lb = 0;
        obj1.ub = obj1.arr.length - 1;
       int res = obj1.binarySearch(k);
        System.out.println("The position is "+(res+1));
    }
}

