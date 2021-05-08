import java.util.*;
class Pattern4
{
public static void main(String [] om)
{
  int i,j,n=5;
  for(i=1;i<2*n-1;i+=2)
  {
    for(j=1;j<i+1;j-=2){
      System.out.print(j);
    }
    System.out.println();
  }
}
}
