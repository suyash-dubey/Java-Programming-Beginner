import java.util.Scanner;
class Saddle
{
public static void main(String [] om)
{
  Scanner in=new Scanner(System.in);
  System.out.println("ENTER NUMBER OF ROWS: ");
  int m=in.nextInt();
  System.out.println("ENTER NUMBER OF COLUMNS: ");
  int n=in.nextInt();
  int a[][]=new int[m][n];
  boolean flag=true;
  System.out.println("ENTER ELEMENTS: ");
  for(int i=0;i<m;i++)
  {

    for(int j=0;j<n;j++)
    {
      a[i][j]=in.nextInt();
    }
  }
  int min;
  int index,k;
  for(int i=0;i<m;i++)
  {
    min=a[i][0];
    index=0;
    for(int j=1;j<n;j++)
    {
      if(min>a[i][j])
      {
        min=a[i][j];
        index=j;
      }
    }
    for(k=0;k<m;k++)
    {
      if(a[k][index]>min)
      break;

    }
    if(k==m)
    {
      System.out.println("SADDLE POINT IS: "+min);
    }
  }

}
}
