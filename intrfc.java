import java.util.Scanner;
interface i1
{
  public void show();
  public void area(int a, int b);
  public void parameter(int a,int b);
}
class Rectangle implements i1
{
  public void area(int a,int b)
  {
     System.out.println("area is :"+a*b);
  }
  public void parameter(int a,int b)
  {
     System.out.println("Parameter  is :"+2*(a+b));
  }
  public void show()
  {
    System.out.println("JAVA JAVA JAVA");
  }
}

class intrfc
{

  public static void main(String []om)
  {
    i1 obj=new Rectangle();
    obj.area(5,6);
    obj.parameter(5,6);
  }
}
