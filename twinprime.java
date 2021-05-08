import java.util.*;
class twinprime
{
   public static void main(String [] om)
   {
     Scanner in=new Scanner(System.in);
     System.out.println("ENTER THE FIRST NUMBER: ");
     int a=in.nextInt();
     System.out.println("ENTER THE SECOND NUMBER: ");
     int b=in.nextInt();
     if((primecheck(a))==1&&(primecheck(b)==1))
     {
       if(a-b==2||b-a==2)
       System.out.println("TWIN PRIME!!");
       else
       System.out.println("OH!UH!...NOT A TWIN PRIME!");
     }
     else
     System.out.println("EITHER OF THE NUMBERS ENTERED ARE NOT PRIME\nPROGRAM ABORTED!");


   }
   static int primecheck(int n)
   {
     int i,c=0;
     for(i=1;i<=n;i++)
     {
       if(n%i==0)
       c++;
     }
     if(c>2)
     return 0;
     else
     return 1;
   }
}
