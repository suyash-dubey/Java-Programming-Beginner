import java.util.Scanner;
class pattern
{
  public static void main(String [] om)
  {
    System.out.println("Enter N for which pattern is to be printed: ");
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int i,j;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
