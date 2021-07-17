import java.util.Scanner;
public class CaesarCipher 
{
    String rot13(String str)
    {
        String Str = "";
        for(int i = 0;i<= str.length()-1;i++)
        {
            char ch = str.charAt(i);
             
            if(('a'<=ch)&&(ch<='m'))
            {
                ch+=13;
                Str = Str +ch;
            }
            else if(('A'<=ch)&&(ch<='M'))
            {
                ch+=13;
                Str = Str +ch;
            }
            else if(('N'<=ch)&&(ch<='Z'))
            {
                ch-=13;
                Str = Str +ch;
            }
            else if(('n'<=ch)&&(ch<='z'))
            {
                ch-=13;
                Str = Str +ch;
            }
            else
            {
                Str = Str +ch;
            }
            
                    
        }
        return Str;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CaesarCipher obj = new CaesarCipher();
        System.out.println("INPUT :");
        String str = sc.nextLine();
        int L = str.length();
        System.out.println("OUTPUT :");
        if(L>3&&L<100)
        {
            System.out.println(obj.rot13(str));
        }
        else
        {
            System.out.println("INVALID LENGTH");
        }
        
    }
}
