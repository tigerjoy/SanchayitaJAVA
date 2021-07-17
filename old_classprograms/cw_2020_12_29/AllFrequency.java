import java.util.Scanner;
class AllFrequency
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
  int calcFreq(int arr[], boolean isProcessed[], int key , int size)
  {
    if(size==0)
    {
      return 0;
    }
    else if(key==arr[size-1])
    {
      isProcessed[size-1]= true;
      return 1+calcFreq(arr, isProcessed , key , size-1);
    }
    else
    {
      return 0+calcFreq(arr, isProcessed , key , size-1);
    }
  }
  public static void main(String []args)
  {
    System.out.println("Enter the size of the array");
    int size = sc.nextInt(); 
    AllFrequency obj = new AllFrequency();
    int arr[] = new int[size];
    boolean isProcessed[] = new boolean[size];
    obj.input(arr);
    for(int i =0 ; i<=arr.length-1;i++)
    {
      //if(isProcessed[i]==false)
      if(!isProcessed[i])
      {
        int freq = obj.calcFreq(arr,isProcessed, arr[i],size);
        System.out.println(arr[i]+" was found "+freq+" times");
      }
    }
  }
}