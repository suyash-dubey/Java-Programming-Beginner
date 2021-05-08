import java.util.*;
class Pattern3
{
public static void main(String []om)
{
int i,j;
char ch='A';
System.out.println("ENTER LIMIT: ");
Scanner in=new Scanner(System.in);
int n=in.nextInt();
n=n+1;
for(i=0;i<=n;i++)
{
  for(j=1;j<n-i;j++)
  {
    System.out.print(ch);
    ch++;
  }
  System.out.println();

}
}
}
