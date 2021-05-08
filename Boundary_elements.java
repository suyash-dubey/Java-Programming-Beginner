import java.util.Scanner;
class Boundary_elements
{
public static void main(String [] om)
{
System.out.println("ENTER NUMBER OF ROWS: ");
Scanner inp=new Scanner(System.in);
int row=inp.nextInt();
System.out.println("ENTER NUMBER OF Columns: ");
int col=inp.nextInt();
int arr[][]=new int[row][col];
System.out.println("ENTER THE ELEMENTS PLEASE: ");
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
    arr[i][j]=inp.nextInt();
  }
}
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
  System.out.print(arr[i][j]+" ");
  }
  System.out.println();
}
}
}
