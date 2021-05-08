import java.util.*;
class switchcasesmallcomposite
{
  public static void main(String om [])
  {
    display();

  }
  static void display()
  {
    Scanner in=new Scanner(System.in);
    System.out.println("1.CHECK IF NUMBER IF A COMPOSITE NUMBER. ");
    System.out.println("2.SEARCH THE SMALLEST DIGIT OF AN INTEGER. ");
    System.out.println("3.EXIT.");
    System.out.println("ENTER YOUR CHOICE: ");
    int ch=in.nextInt();
    switchr (ch);

  }
  static void switchr(int ch)
  {
    switch(ch)
    {
      case 1: compositechecker();display();
      break;
      case 2: smallestdigit();display();
      break;
      case 3: System.out.println("PROGRAM ABORTED!");
      break;
      default: System.out.println("WRONG CHOICE!\n");
      display();break;}
  }
  static void compositechecker()
  {
    System.out.println("ENTER A NUMBER TO BE CHECKED: ");
    Scanner inn=new Scanner(System.in);
    int n=inn.nextInt();
    int c=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      c++;
    }
    if(c>2)
    {
      System.out.println("IT IS A COMPOSITE NUMBER");
    }
    else
    System.out.println("UH-OH! NOT A COMPOSITE NUMBER!");
  }
  static void smallestdigit()
  {
    System.out.println("ENTER A INTEGER NUMBER : ");
    Scanner innn=new Scanner(System.in);
    int num = innn.nextInt();
    int a,s=9;
    while(num>0)
    {
      a=num%10;
      if(a<s)
      s=a;
      num=num/10;
    }
    System.out.println("SMALLEST DIGIT IS: "+s);
  }
}
