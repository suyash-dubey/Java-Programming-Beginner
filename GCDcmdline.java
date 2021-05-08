class GCDcmdline
{
   public static void main(String []om)
   {
     int a,b,gcd=1,s,i;
     a=Integer.parseInt(om[0]);
     b=Integer.parseInt(om[1]);
     s=a;
     if(b<a)
     s=b;
     for(i=1;i<s+1;i++)
     {
       if((a%i==0) && (b%i==0))
       gcd=i;
     }
     System.out.println("GCD="+gcd);

   }
}
