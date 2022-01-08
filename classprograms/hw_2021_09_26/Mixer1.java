// Scored - 10 points
import java.util.Scanner;
public class Mixer1
{
    static Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    Mixer1(int nn)
    {
        n=nn;
        arr= new int[n];
    }
    void accept()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
    }
    Mixer1 mix(Mixer1 A)
    {
        Mixer1 B= new Mixer1(this.n+A.n);
        int i, j, k;
        k = 0;
    // Copying common elements
    for(i=0, j=0;i<n && j<A.n;)
    {
      if(arr[i]>A.arr[j])
      {
        B.arr[k]=arr[i];
        i++;
      }
      else
      {
        B.arr[k]=A.arr[j];
        j++;
      }
      k++;
    }
    // Remaining Elements from arr1
    while(i<n)
    {
      B.arr[k]=arr[i];
      i++;
      k++;
    }
    // Remaining Elements from arr2
    while(j<A.n)
    {
      B.arr[k]=A.arr[j];
      j++;
      k++;
    }
    return B;
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the size of Array1");
        int s1 = sc.nextInt();
        Mixer1 A = new Mixer1(s1);
        A.accept();
        System.out.println("Enter the size of Array2");
        int s2 = sc.nextInt();
        Mixer1 B = new Mixer1(s2);
        B.accept();
        Mixer1 R = A.mix(B);
        R.display();
    }
    
}

