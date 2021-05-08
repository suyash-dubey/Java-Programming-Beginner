import java.util.*;
class Special2digitnumber
{
   public static void main(String [] om)
   {
     Scanner in=new Scanner(System.in);
     System.out.println("ENTER A TWO DIGIT NUMBER: ");
     int n=in.nextInt();
     int ncopy=n;
     int a,prod=1,sum=0;
     while(n>0)
     {
       a=n%10;
       prod=a*prod;
       sum=sum+a;
       n=n/10;
     }
     if(sum+prod==ncopy)
     System.out.println("SPECIAL TWO DIGIT NUMBER !!");
     else
     System.out.println("uh-oh! NOT A SPECIAL TWO DIGIT NUMBER!!");
   }

}
