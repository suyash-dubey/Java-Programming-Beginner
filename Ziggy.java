import java.util.Scanner;
class Ziggy
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
    if(flag)
    {
      if(a[i]>a[i+1])
    {
      temp=a[i];
      a[i]=a[i+1];
      a[i+1]=temp;
    }
  }

      else
      {
        if(a[i]<a[i+1])
      {
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
      }
      }

 flag=!flag;
  }
  for(int i=0;i<n;i++)
  {
    System.out.print(a[i]);
  }


}
}
