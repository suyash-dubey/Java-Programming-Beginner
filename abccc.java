abstract class Parent
{
  abstract public void check(int n);
  abstract public void show();
}
class Palindrome extends Parent
{
  public void check(int x){
  int n=x,rev,m=0,a;
  while(n>0)
  {
    rev=n%10;
    m=m*10+rev;
    n=n/10;
  }

  if(m==x)
  System.out.println("PALINDROME");
  else
  System.out.println("NOT PALINDROME");

}
public void show()
{
  System.out.println("PALINDROME VALA SHOW");
}
}
class Armstrong extends Parent
{
  public void check(int n)
  {
    int a,x,sum=0;
    x=n;
    while(x>0)
    {
      a=x%10;
      sum=sum+a*a*a;
      x=x/10;
    }
    if(sum==n)
    System.out.println("Armstrong");
    else
    System.out.println("NOT armstrong");
  }
  public void show()
  {
    System.out.println("ARMSTRONG VALA SHOW");
  }
}
class abccc
{
  public static void main(String [] om)
  {
    Palindrome ob=new Palindrome();
    Armstrong ob2=new Armstrong();
    Parent ref;
    //ref=ob;
    ob.check(121);
  //  ref=ob2;
    ob2.check(153);
    ob.show();
    ob2.show();
  }
}
