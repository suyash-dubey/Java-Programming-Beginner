import java.util.*;
class Myprograms{
public static void main(String []args)
{
  Scanner in=new Scanner(System.in);
  int ec=0,oc=0;
  String s=in.nextLine();
  int l=s.length();
  char []ch=new char[l];
  for(int i=0;i<l;i++)
  {
    ch[i]=s.charAt(i);
  }
  for(int i=0;i<l;i++)
  {
    System.out.println(ch[i]);
  }
  for(int i=0;i<l;i++)
  {
    if(i%2==0)
    {
      if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
      {
        ec++;
      }
    }
    if(i%2!=0)
    {
      if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
      {
        oc++;
      }
    }

  }
  System.out.println(ec);
  System.out.println(oc);

}
}
