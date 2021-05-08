import java.util.*;
class Diffbtwtimeperiod
{
public static void main( String []om)
{
  Scanner in=new Scanner(System.in);
  System.out.println("INPUT STARTING TIME: ");
  System.out.println("ENTER HOURS: ");
  int h1=in.nextInt();
  System.out.println("ENTER MINUTES: ");
    int m1=in.nextInt();
  System.out.println("ENTER SECONDS: ");
    int s1=in.nextInt();
    System.out.println("INPUT ENDING TIME: ");
    System.out.println("ENTER HOURS: ");
    int h2=in.nextInt();
    System.out.println("ENTER MINUTES: ");
      int m2=in.nextInt();
    System.out.println("ENTER SECONDS: ");
      int s2=in.nextInt();
      System.out.print("STARTING TIME: ");
      System.out.print(+h1);
      System.out.print(" : "+m1);
      System.out.print(" : "+s1);
      System.out.println();
      System.out.println("ENDING TIME: ");
      System.out.print(+h2);
      System.out.print(" : "+m2);
      System.out.print(" : "+s2);
      System.out.println();


      int h3,m3,s3;
      if((s2-s1)<0)
      {
        s2=s2+60;
        m2=m2-1;
      }
      if((m2-m1)<0)
      {
        m2=m2+60;
        h2=h2-1;
      }
      h3=h2-h1;
      m3=m2-m1;
      s3=s2-s1;
      System.out.println("DIFFERENCE IS :");
      System.out.print(+h3);
      System.out.print(" : "+m3);
      System.out.print(" : "+s3);
}
}
