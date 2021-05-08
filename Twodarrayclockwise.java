import java.util.Scanner;
class Twodarrayclockwise
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
  //CODE FOR ROTATING 2D ARRAY CLOCKWSIE
//FIRST WE SIMPLY DO A TRANSPOSE AND PRINT IT!
//lets save this transpose into another 2D matrix;
int trans[][]=new int[row][col];
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
  trans[i][j]=arr[j][i];
  }
}

//Lets swap the border elements now::
int temp;
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
    temp=trans[i][0];
    trans[i][0]=trans[i][col-1];
    trans[i][col-1]=temp;
  }
}
System.out.println("rotated matrix:");
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
  System.out.print(trans[i][j]+" ");
  }
  System.out.println();
}

}
}
