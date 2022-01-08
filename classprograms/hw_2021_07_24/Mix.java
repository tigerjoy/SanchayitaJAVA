import java.util.Scanner;
// Scored - 4 points for structure
public class Mix
{
    static Scanner sc = new Scanner(System.in);
    String wrd;
    int len;
    Mix()
    {
        this.wrd="";
        this.len=0;
    }
    
    // OBSERVATION #1
    // Where are you storing the user input
    // in wrd? If you print the value of wrd
    // of any object anywhere in the program,
    // what would you see?
    void feedwords()
    {
      System.out.println("Enter the word");
      wrd=sc.nextLine().toUpperCase();
      len = wrd.length();
    }
    // OBSERVATION #2
    // Wrong logic used to mix the two strings.
    void mix_words(Mix P, Mix Q)
    {
      int len1 = P.len;
      int len2 = Q.len;
      int smallLength=len1<len2?len1:len2;
      String res="";
      for(int i=0;i<=smallLength-1;i++)
      {
        res+=P.wrd.charAt(i)+""+Q.wrd.charAt(i);
      }
      res+=P.wrd.substring(smallLength)+Q.wrd.substring(smallLength);
      this.wrd=res;
      // int large;
      // String str="";
      // if(P.len<Q.len)
      // {
      //     large=Q.len;
      //     str=Q.wrd.substring(0, large);
      // }
      // else if(P.len>Q.len)
      // {
      //     large= P.len;
      //     str=P.wrd.substring(0, large);
      // }
      // else
      // {
      //     large=Q.len;
      // }
      // for(int i=0;i<=large-1;i++)
      // {
      //     this.wrd+= P.wrd.charAt(i);
      //     this.wrd+=Q.wrd.charAt(i);
      // }
      // this.wrd=wrd.concat(str);
    }
    void display()
    {
        System.out.println("Word:"+wrd);
    }
    public static void main(String[]args)
    {
        Mix obj1 = new Mix();
        Mix obj2 = new Mix();
        // OBSERVATION #3
        // When NetBeans shows you a yello triangle
        // beside lines 58 and 61, read them, you'll
        // understand where the problem lies.
        // System.out.println("Enter the first word");
        // String wrd1 = sc.nextLine();
        obj1.feedwords();
        // System.out.println("Enter the second word");
        // String wrd2 = sc.nextLine();
        obj2.feedwords();
        Mix result = new Mix();
        result.mix_words(obj1,obj2);
        result.display();
    } 
}


