import java.util.Scanner;
class Set5Q8
{
    int n;
    int arr[][];
    int nonbound[];
    static Scanner sc = new Scanner(System.in);
    
    Set5Q8(int n)
    {
        this.n = n;
        arr = new int[n][n];
        nonbound = new int[(n-2) * (n-2)];
    }
    void fillarray()
    {
        for(int i = 0 ;i<n;i++)
        {
            for(int j = 0 ; j<n;j++)
            {
                System.out.println("Enter element" +(i+1)+","+(j+1));
                arr[i][j]= sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i =0 ;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void sumOfNon()
    {
          int index = 0;
          int sum = 0;
          for(int i = 1; i <= n - 2; i++)
          {
              for(int j = 1; j <= n - 2; j++)
              {
                  nonbound[index] = arr[i][j];
                  sum+=nonbound[index];
                   index++;
              } 
          }
          System.out.println("THE SUM IS :"+sum);
    }

    public static void main(String[] args) 
    {
        System.out.println(" n = ");
        int n = sc.nextInt();
        Set5Q8 obj = new Set5Q8(n);
        obj.fillarray();
        System.out.println("ORIGINAL MATRIX:");
        obj.display();
        obj.sumOfNon();
        
    }
}