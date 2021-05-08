import java.util.*;
class Reverse_Strng
{
  public static void main( String [] om)
  {
    Scanner inn=new Scanner(System.in);
    String s=inn.nextLine();
    System.out.println(s);
    int l=s.length();
    System.out.println(l);
    char [] ch=new char[l];
    for(int i=0;i<l;i++)
    {
      ch[i] = s.charAt(i);
    }
    for(int i=l-1;i>=0;i--)
    {
      System.out.print(ch[i]);
    }

}
}
