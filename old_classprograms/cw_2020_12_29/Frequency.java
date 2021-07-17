import java.util.Scanner;
class Frequency
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for(int i = 0;i<=arr.length-1;i++)
    {
       System.out.println("Enter element "+ (i+1));
       arr[i]= sc.nextInt();
    }
  }
  int calcFreq(int arr[], int size,int key)
  {
    if(size==0)
    {
      return 0;
    }
    else if(key==arr[size-1])
    {
      return 1+calcFreq(arr,size-1,key);
    }
    else
    {
      return calcFreq(arr,size-1,key);
    }
  }
  
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt(); 
    Frequency obj = new Frequency();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched");
    int key = sc.nextInt();
    int freq = obj.calcFreq(arr,size,key);
    System.out.println(key+" was found "+freq+" times");
  }
}