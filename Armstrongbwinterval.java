import java.util.*;
class Armstrongbwinterval
{
   public static void main(String om[])
   {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the starting interval: ");
     int a=in.nextInt();
     System.out.println("Enter the starting interval: ");
     int b=in.nextInt();
     if(a>b)
     System.out.println("WRONG INTERVAL ENTERED!\nPROGRAM ABORTED!!");
     System.out.println("ARMSTRONG NUMBERS: ");
     for(int i=a;i<b;i++)
     {
       Armstrongfinder(i);
     }
   }
   static void Armstrongfinder(int i)
   {
     int sum=0,x,i2;
     i2=i;
     while(i>0)
     {
       x=i%10;
       sum=(x*x*x)+sum;
       i=i/10;
     }
     if(sum==i2)
     {
       System.out.println(sum);
     }
   }
}
