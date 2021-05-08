import java.util.*;
class Replace0with1
{
public static void main(String [] args)
{
  System.out.println("Enter a number: ");
  Scanner in=new Scanner(System.in);
  int num=in.nextInt();
  int b=0,s=0,m=1;
  while(num>0)
  {
    s=num%10;
    if(s==0)
    {
      s=1;
    }
    b=(s*m)+b;
    m=m*10;
    num=num/10;
  }
  System.out.println("Number is : "+b);
}
}
