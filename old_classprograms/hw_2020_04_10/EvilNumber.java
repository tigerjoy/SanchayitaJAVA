import java.util.Scanner;
class EvilNumber
{
    String convert(int num)
    {
        System.out.println("INPUT               :"+num);
        String bin ="";
        while(num!=0)
        {
            int rem = num%2;
            bin=(rem+bin);
            num = num/2;
        }
        
        System.out.println("BINARY EQUIVALENT   :"+bin);
        return bin;
            
    }
    int countOnes(String bin)
    {
        int count = 0;
        for(int i = 0;i<=bin.length()-1;i++)
        {
            if(bin.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println("NUMBER OF ONES      :"+count);
        return count;
    }
    void checkCount(int dig)
    {
        if(dig%2==0)
        {
            System.out.println("OUTPUT              :"+"EVIL NUMBER");
        }
        else
        {
            System.out.println("OUTPUT              :"+"NOT AN EVIL NUMBER");
        }
    }
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = sc.nextInt();
      EvilNumber obj = new EvilNumber();
      String str =obj.convert(num);
      int count1 = obj.countOnes(str);
      obj.checkCount(count1);
            
            
    }
}
