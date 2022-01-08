import java.util.Scanner;
// Scored - 10 points
public class Combine 
{
    static Scanner sc = new Scanner(System.in);
    int com[];
    int size;
    Combine(int nn)
    {
        this.size=nn;
        com = new int[size];
    }
    void inputarray()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the array element "+(i+1));
            com[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for(int i=0;i<=size-2;i++)
        {
            int small_i=i;
            for(int j=i+1;j<=size-1;j++)
            {
                if(com[j]<com[small_i])
                {
                    small_i=j;
                }
            }
            int temp = com[i];
            com[i]=com[small_i];
            com[small_i]=temp;
        }
    }
    void mix(Combine A, Combine B)
    {
        //A->obj1
        //B->obj2
        //arr1->A.com arr2 = B.com arr3 = result.com
        int index =0;
        for(int i=0;i<=A.size-1;i++)
        {
           com[index]=A.com[i];
            index++;
        }
        for(int i=0;i<=B.size-1;i++)
        {
            com[index]=B.com[i];
            index++;
        }
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(com[i]+" ");
        }
                
    }
    public static void main(String[]args)
    {
        System.out.println("Enter the size of arr1");
        int sz1 = sc.nextInt();
        Combine obj1 = new Combine(sz1);
        obj1.inputarray();
        System.out.println("Enter the size of arr2");
        int sz2 = sc.nextInt();
        Combine obj2 = new Combine(sz2);
        obj2.inputarray();
        System.out.println("The merged array is:");
        int sz3 = sz1+sz2;
        Combine result = new Combine(sz3);
        result.mix(obj1,obj2);
        result.sort();
        result.display();
        
        
    }
}
