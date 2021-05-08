class Parent
{
  String str;
  Parent(String s)
  {
    str=s;
  }
  void show()
  {
    System.out.println(str);
  }
  void swap(Parent ob2)
  {
    String temp;
    temp=str;
    str=ob2.str;
    ob2.str=temp;    
  }
}
class abcc
{
  public static void main(String []om)
  {
    Parent ob=new Parent("SUYASH");
    Parent ob2=new Parent("DUBEY");
    ob.show();
    ob2.show();
    ob.swap(ob2);
    ob.show();
    ob2.show();
  }
}
