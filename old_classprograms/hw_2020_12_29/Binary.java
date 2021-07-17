import java.util.Scanner;
public class Binary 
{
    static Scanner sc = new Scanner(System.in);
    int A[];
    int n;
    int l; 
    int u;
    Binary(int nn)
    {
        n=nn;
        l = 0;
        u = n-1;
        A = new int[n];
    }
    void readdata()
    {
        System.out.println("Enter elements in ascending order");
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1));
            A[i]= sc.nextInt();
        }
    }
    int binary_search(int v)
    {
        int mid=(l+u)/2;
        if(v== A[mid])
        {
            return mid+1;
        }
        if(l>u)
        { 
            return -1;
        }
        if(v!=A[mid])
        {
            if(v>A[mid])
            {
                l = mid+1;
            }
            if(v<A[mid])
            {
                u = mid-1;
            }
        }
        return binary_search(v);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements in the array");
        int sz = sc.nextInt();
        Binary obj = new Binary(sz);
        obj.readdata();

        System.out.println("Enter the element to be searched");
        int  key = sc.nextInt();

        int bs = obj.binary_search(key);
        System.out.println("The position of the key is "+bs);
    }
}
    

