import java.util.Scanner ;
public class BinSearch 
{
    static Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    BinSearch(int nn)
    {
        n = nn;
        arr = new int[n];
    }
    void fillArray()
    {
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1));
            arr[i]= sc.nextInt();
        }
        
    }
    void sort()
    {
        for(int i=0;i<=n-2;i++)
        {
            for(int j = 0;j<=n-2-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    int bin_Search( int l, int u, int v)
    {
        int mid=(l+u)/2;
        if(l>u)
        {
            return -1;
        }
        else if(v==arr[mid])
        {
            return mid;
        }
        else if(v<arr[mid])
        {
            return bin_Search(l , mid-1, v);
        }
        else
        {
            return bin_Search(mid+1 , u, v);
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of elements in the array");
        int sz = sc.nextInt();
        BinSearch obj = new BinSearch(sz);
        obj.fillArray();
        obj.bubblesort();
        System.out.println("Enter the element to be searched");
        int  key = sc.nextInt();
        int bs = obj.bin_Search(0,sz-1, key)+1;
        System.out.println("The position of the key is "+bs);
    }
}
