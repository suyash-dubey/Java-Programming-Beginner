import java.util.Scanner;
class Scannedeg{
static  int x,y,z;

  int summ()
  {
    return x+y+z;
  }
  int sub()
  {
    return x-y-z;
  }
public static void main(String [] om)
{
  Scannedeg obj=new Scannedeg();
  Scanner in=new Scanner(System.in);
  x=in.nextInt();
  y=in.nextInt();
  z=in.nextInt();
   System.out.println(obj.summ());
   System.out.println(obj.sub());
}
}
