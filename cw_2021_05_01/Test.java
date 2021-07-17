class Test
{
  public static void main(String[]args)
  {
    String date = "02/10/2003";
    String components[] = date.split("/");
    System.out.println(components[0]);
    System.out.println(components[1]);
    System.out.println(components[2]);
  }
}