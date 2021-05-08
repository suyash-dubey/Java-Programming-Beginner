import java.util.*;
class All_strng_functions
{
public static void main(String []om)
{
  Scanner inn=new Scanner(System.in);
  String s=inn.nextLine();
  reverse_Strng(s);
}
static void reverse_Strng(String s)
{
  char [] ch=new char[s.length()];
  for(int i=0;i<s.length();i++)
  {
    ch[i]=s.charAt(i);
  }
  for(int i=s.length()-1;i<=0;i--)
  {
    System.out.print(ch[i]+" ");
  }
};
}
