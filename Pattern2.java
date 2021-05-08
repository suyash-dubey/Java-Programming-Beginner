import java.util.*;
class Pattern2
{
public static void main(String []om)
{
int i,j,k,l;
Scanner in=new Scanner(System.in);
System.out.println("ENTER LIMIT: ");
int n=in.nextInt();
for(i=1;i<=n;i++)
{
  for(k=n-i;k>0;k--)
  {
    System.out.print(" ");
  }
  for(j=1;j<=i;j++)
  {
    System.out.print(j);
  }
  for(l=i-1;l>0;l--)
  {
    System.out.print(l);
  }
  System.out.println();
}
}
}
