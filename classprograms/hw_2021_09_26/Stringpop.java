// Scored - 10 points
import java.util.Scanner;
public class Stringpop 
{
    static Scanner sc = new Scanner(System.in);
    String txt;
    String newtxt;
    Stringpop()
    {
        this.txt= "";
        this.newtxt= "";
    }
    void readString()
    {
        System.out.println("Enter the string");
        txt = sc.nextLine();
    }
    // OBSERVATION #1
    // Well done, but the code can be shortened
    // further.
    void circularDecode()
    {
        for(int i=0;i<=txt.length()-1;i++)
        {
            int ascii=(int)(txt.charAt(i));
             char ch = (char)(txt.charAt(i)+1);
             if(65<=ascii&&90>ascii)
             {
                 newtxt = newtxt+Character.toLowerCase(ch);
             }
             else if(97<=ascii&&122>ascii)
             {
                 newtxt= newtxt +Character.toUpperCase(ch);
             }
             else if(ascii==90)
             {
                 newtxt = newtxt.concat("a");
             }
              else if(ascii==122)
             {
                 newtxt = newtxt.concat("A");
             }
             else
              {
                  newtxt= newtxt+txt.charAt(i);
              }
        }
        System.out.println("New Text:"+newtxt);
    }
    public static void main(String[] args)
    {
        Stringpop obj = new Stringpop();
        obj.readString();
        obj.circularDecode();
        
    }
        
    }
