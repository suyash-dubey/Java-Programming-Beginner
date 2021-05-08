import java.util.*;
class Friendly_pair
{
public static void main(String args[])
{
System.out.println("ENTER FIRST NUMBER: ");
Scanner in=new Scanner(System.in);
int a=in.nextInt();
System.out.println("\nENTER SECOND NUMBER: ");
Scanner in2=new Scanner(System.in);
int b=in2.nextInt();
double sum1=0,sum2=0;
int i,j;
for( i=1;i<=a;i++)
{
  if(a%i==0)
  {
    sum1=sum1+i;
  }
}
for(j=1;j<=b;j++)
{
    if(b%j==0)
  {
    sum2=sum2+j;
  }
}
sum1=sum1/a;
sum2=sum2/b;
if(sum1 == sum2)
{
  System.out.println("FRIENDLY PAIR ");
}
else
{
  System.out.println("NON-FRIENDLY PAIR ");
}
}
}
