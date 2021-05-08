import java.util.Scanner;

class arrayss{
  static int sum=0;
  static void summer(int[] a,int x)
  {
    for(int i=0;i<x;i++)
    {
      sum=sum+a[i];
    }
  }
  public static void main(String []om)
  {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE LIMIT: ");
    n=in.nextInt();
    int a[]=new int[n];
    System.out.println("ENTER elements: ");
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
     summer(a,n);
    System.out.println(sum);

  }
}
