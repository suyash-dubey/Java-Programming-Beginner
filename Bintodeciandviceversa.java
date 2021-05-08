import java.util.*;
import java.lang.Math;
class Bintodeciandviceversa
{
public static void main(String om[])
{
  Scanner in=new Scanner(System.in);
  System.out.println("ENTER 1 FOR BINARY TO DECIMAL: ");
  System.out.println("ENTER 2 FOR DECIMAL TO BINARY: ");
  int ch=in.nextInt();
  switch(ch)
  {
    case 1:System.out.println("PLEASE ENTER A VALID BINARY NUMBER: ");
           int b=in.nextInt();
           bintodeci(b);
    break;
    case 2:System.out.println("PLEASE ENTER A VALID DECIMAL NUMBER: ");
           int d=in.nextInt();
           decitobin(d);
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
  System.out.println("DECIMAL CONVERSION IS: "+d);
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
static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
}
