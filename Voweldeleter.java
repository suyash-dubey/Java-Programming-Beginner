/*Write a java program to delete vowels from given string using StringBuffer class.*/
import java.util.Scanner;
class Voweldeleter
{
  public static void main(String [] om)
  {
  Scanner in=new Scanner(System.in);
  String s=in.nextLine();
  StringBuffer s1=new StringBuffer(s);
  char []ch=s.toCharArray();
  int l=0,sl=s.length();
  for(int i=0;i<sl-l;i++)
  {
    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
    {
      s1=s1.deleteCharAt(i);
      l--;
    }
    s=s1.toString();
    ch=s.toCharArray();
  }
  s=s1.toString();
  System.out.println(s);

}}
