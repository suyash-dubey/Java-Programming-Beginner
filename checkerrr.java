import java.util.*;
class checkerrr
{
  public static void main(String[] args)
  	{

      Scanner in=new Scanner(System.in);
  	  String str =in.nextLine();
      char ch[]=str.toCharArray();
      int count=1;
      for(int i=0;i<str.length();i++)
      {
        if(ch[i]==' '&& ch[i+1]!=' ')
        count++;
      }
      System.out.println(count);
}
}
