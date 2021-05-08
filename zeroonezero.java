import java.util.Scanner;
class zeroonezero
{
  public static void main(String [] om)
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    char []ch=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
      ch[i]=s.charAt(i);
    }
    int i,j,k,count=0;
  for(i=0;i<s.length()-2;i++)
  {
    j=i+1;
    if(ch[i]=='0'&&ch[j]=='1')
    {
      for(k=j+1;j<s.length();k++)
      {
        if(ch[k]=='0')
        {
          count++;
          break;
        }
      }
    }
  }
  System.out.println(count);
  }
}
