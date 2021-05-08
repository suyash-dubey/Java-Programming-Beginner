import java.util.Scanner;
class Voweldeleter2
{
  public static void main(String [] om)
  {
  Scanner in=new Scanner(System.in);
  String s=in.nextLine();
  String s2=s.replaceAll("[aeiouAEIOU]","");
  System.out.println(s2);

}}
