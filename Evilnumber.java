import java.util.*;
class Evilnumber{
public static void main(String []om)
{
 Scanner in=new Scanner(System.in);
 System.out.println("ENTER A NUMBER: ");
 int n=in.nextInt();
 if(n>2&&n<100)
 {System.out.println("INPUT: "+n);
 n=decitobin(n);
 n=numberonecounter(n);
 if(n%2==0)
 System.out.println("EVIL NUMBER");
 else
 System.out.println("NOT A EVIL NUMBER");
}
else
System.out.println("NUMBER OUT OF RANGE!");
}
static int decitobin(int d)
{
  int b=0,m=1,n;
  while(d>0)
  {
    n=d%2;
    b=b+n*m;
    m=m*10;
    d=d/2;
  }
  System.out.println("BINARY EQUIVALENT: "+b);
  return b;
}
static int numberonecounter(int n)
{
  int count=0,a;
  while(n>0)
  {
    a=n%10;
    if(a==1)
    count++;
    n=n/10;
  }
  System.out.println("NUMBER OF 1'S: "+count);
  return count;
}
}
