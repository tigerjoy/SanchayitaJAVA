import java.util.Scanner;
public class Admission 
{
    static Scanner sc = new Scanner(System.in);
    int Adno[];
    Admission()
    {
        Adno = new int[100];
    }
    void fillArray()
    {
         System.out.println("Enter elements in ascending order");
        for(int i = 0;i<100;i++)
        {
            System.out.println("Enter element "+(i+1));
            Adno[i]= sc.nextInt();
        }
    }
    int binSearch( int v , int lb , int ub)
    {
        int mid=(lb+ub)/2;
        if(lb>ub)
        {
            return -1;
        }
        else if(v==Adno[mid])
        {
            return mid;
        }
        else if(v<Adno[mid])
        {
            return binSearch(v , lb , mid-1);
        }
        else
        {
            return binSearch(v, mid+1 , ub);
        }
    }
    public static void main(String[] args) 
    {
        Admission obj = new Admission();
        obj.fillArray();
        System.out.println("Enter the element to be searched");
        int  key = sc.nextInt();
        int bs = obj.binSearch(key,0,99);
        System.out.println("The position of the key is "+bs);
    }
  }
  

