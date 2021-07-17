import java.util.Scanner;
class CleanString{

  String cleanString(String dirty_str){
    dirty_str = dirty_str.trim();
    String clean_str = "";
    int dirty_len = dirty_str.length();
    for(int i = 0; i < dirty_len; i++){
      char ch = dirty_str.charAt(i);
      if(Character.isLetter(ch)){
        clean_str += ch;
      }
      else {
        clean_str += " ";
      }
    }
    return clean_str.trim();
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String dirty_str = sc.nextLine();
    System.out.println("Dirty String\n" + dirty_str);
    CleanString obj = new CleanString();
    System.out.println("Dirty String\n" + 
                        obj.cleanString(dirty_str));
  }
}