import java.util.Scanner;
class Collection
{
  int arr[];
  int len;

  Collection()
  {
    // this.len=100;
    // this.arr=new int[this.len];
    this(100);
  }
  Collection(int len)
  {
    this.len=len;
    this.arr = new int[this.len];
  }
  void readArray()
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<len;i++)
    {
      System.out.println("Enter element"+(i+1));
      arr[i]=sc.nextInt();
    }
  }
  boolean linearSearch(int arr[], int key)
  {
    int size = arr.length;
    for(int i = 0; i <= size - 1; i++)
    {
      if(arr[i] == key){
          return true;
      }
    }
    return false;
  }
  Collection common(Collection obj2)
  {
    // size2 = obj2.len
    // arr2 = obj2.arr

    // arr1 = this.arr
    // size1 = this.len
    int maxSize=obj2.len<this.len?obj2.len:this.len;
    int temp[]= new int[maxSize];
    int tempIndex=0;
    for(int i=0;i<=obj2.len-1;i++)
    {
      if(linearSearch(this.arr,obj2.arr[i]))
      {
        temp[tempIndex]=obj2.arr[i];
        tempIndex++;
      }
    }
    // int common[] -> result.arr
    int commonSize= tempIndex;
    Collection result = new Collection(commonSize);
    for(int i=0;i<=result.len-1;i++)
    {
      result.arr[i]=temp[i];
    }
    return result;
  }
  void displayArray()
  {
    for(int i=0;i<len;i++)
    {
      System.out.print(arr[i]+",");
    }
    System.out.println();
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of arr1");
    int size1= sc.nextInt();
    Collection obj1 = new Collection(size1);
    obj1.readArray();
    System.out.println("Enter the size of arr2");
    int size2= sc.nextInt();
    Collection obj2= new Collection(size2);
    obj2.readArray();
    Collection comm = obj1.common(obj2);
    System.out.println("Elements of arr1");
    obj1.displayArray();
    System.out.println("Elements of arr2");
    obj2.displayArray();
    System.out.println("Elements of common array");
    comm.displayArray();
  }
}