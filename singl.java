import java.util.Scanner;
class singl extends child{
  void show()
  {
    System.out.println("same class wla");
  }


public static void main(String []om)
{
  singl ob=new singl();

 ob.super.show();

}

}
class child{
   int x=10;
   void show()
  {
    x=30;
  System.out.println("THIS IS MY BASE CLASS: "+x);
  }
}
/*class child2 extends child{
   void show()
  {
    System.out.println("second main vala");
    super.show();
  }
}*/
