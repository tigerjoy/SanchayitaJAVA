import java.util.Scanner;
class Denomination
{
  void amountToWords(int amount)
  {
    String digit[] ={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    String amt_str = amount+"";
    for(int i = 0;i<amt_str.length();i++)
    {
      int dig = (amt_str.charAt(i)-'0');
      System.out.print(digit[dig] +" ");
    }
    System.out.println();
  }
  void displayDenomination(int amount)
  {
    int currency[] = {2000,500,200,100,50,20,10,5,2,1};
    int count = 0;
    int temp = amount;
    for(int i = 0;i<currency.length;i++)
    {
      int note = amount/currency[i];
      amount = amount%currency[i];
      count += note;
      if(note>0)
      {
        System.out.printf("%-15d X %-15d = %-15d\n",currency[i],note,(currency[i]*note));
      }
    }
    System.out.println("TOTAL = "+ temp);
    System.out.println("TOTAL NUMBER OF NOTES = "+count);
  }

  public static void main(String[]args)
  {
    Scanner sc = new  Scanner(System.in);
    System.out.print("INPUT :" );
    int amt = sc.nextInt();
    if(amt<=99999)
    {
      Denomination obj = new Denomination();
      obj.amountToWords(amt);
      obj.displayDenomination(amt); 
    }
    else
    {
      System.out.println("INVALID AMOUNT");
    }
  }
}