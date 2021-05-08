import java.util.Scanner;
class Rearranger
{
public static void main(String [] om)
{
  Scanner in=new Scanner(System.in);
  System.out.println("ENTER NUMBER OF ELEMENTS: ");
  int n=in.nextInt();
  int a[]=new int[n];
  boolean flag=true;
  System.out.println("ENTER ELEMENTS: ");
  for(int i=0;i<n;i++)
  {
    a[i]=in.nextInt();
  }
  int temp;
  for(int i=0;i<n-1;i++)
  {
    for(int j=0;j<n-1;j++)
    {
    if(a[j]>0)
    {
      temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
  }
}
}
  for(int i=0;i<n;i++)
  {
    System.out.println(a[i]);
  }
}
}
