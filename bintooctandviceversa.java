import java.util.*;
class bintooctandviceversa
{
public static void main(String om [])
{
Scanner in=new Scanner(System.in);
System.out.println("ENTER 1 FOR BINARY TO OCTAL: ");
System.out.println("ENTER 2 FOR OCTAL TO BINARY: ");
int ch=in.nextInt();
switch(ch)
{
  case 1:System.out.println("PLEASE ENTER A VALID BINARY NUMBER: ");
         int o=in.nextInt();
         bintodeci(o);
  break;
  case 2:System.out.println("PLEASE ENTER A VALID OCTAL NUMBER: ");
         int d=in.nextInt();
         octtodeci(d);
  break;
  default: System.out.println("WRONG CHOICE!\nPROGRAM ABORTED!!");
  break;
}
}
static void bintodeci(int b)
{
  int i=0,n,d=0;
  while(b>0)
  {
    n=b%10;
    if(n==0)
    {i++;}
    else
    {
      d= d+ power(2,i);
    i++;
    }
    b=b/10;
  }
  decitooct(d);
}
static void decitooct(int d)
{
  int o=0,m=1,n;
  while(d>0)
  {
    n=d%8;
    o=o+n*m;
    m=m*10;
    d=d/8;
  }
  System.out.println("OCTAL CONVERSION IS: "+o);

}
static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
    static void octtodeci(int o)
    {
      int i=0,n,d=0;
      while(o>0)
      {
        n=o%10;
        if(n==0)
        {i++;}
        else
        {
          d= d+n* power(8,i);
        i++;
        }
        o=o/10;
      }
      decitobin(d);
    }
    static void decitobin(int d)
    {
      int b=0,m=1,n;
      while(d>0)
      {
        n=d%2;
        b=b+n*m;
        m=m*10;
        d=d/2;
      }
      System.out.println("BINARY CONVERSION IS: "+b);

    }
}
