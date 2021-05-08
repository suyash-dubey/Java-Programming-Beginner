
import java.util.*;

class zero
{
 public static void main(String[] args)
  { int n,c=0;

  Scanner s=new Scanner(System.in);
  n=s.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++)
{
  a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{  if(a[i]==0)

 { for(int j=i+1;j<n;j++)
    {

    if (a[j]==0)
    {
        if(a[i+1]==1)
         {
           c++;
           i=j;
         }


     }

  }


}
}
System.out.println(c);
//end
}
}
