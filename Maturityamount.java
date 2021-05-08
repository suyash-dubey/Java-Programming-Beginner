import java.util.Scanner;
class Maturityamount{
  public static void main(String args[])
  {

    int ch=choicegiver();
  }
  static int choicegiver()
  {
    System.out.println("CHOOSE ONE OF THE FOLLOWING OPTIONS");

    System.out.println("1-TERM DEPOSIT");
    System.out.println("2-RECURRING DEPOSIT");
    System.out.println("ENTER YOUR CHOICE AND PRESS ENTER: ");
    Scanner input=new Scanner(System.in);
    int choice=input.nextInt();
    choiceprocessor(choice);
    return choice;
  }
  static int choiceprocessor(int ch){
  switch (ch){
    case 1:Scanner inp=new Scanner(System.in);
             System.out.println("Principal Amount: ");
             int p=inp.nextInt();
             System.out.println("Rate of interest: ");
             int r=inp.nextInt();
             System.out.println("Time(YEARS): ");
             int n=inp.nextInt();
             int a;
             a=p*n*(1 + r / 100);
             System.out.println("RECEIVABLE : "+a);
    break;
    case 2:Scanner inpu=new Scanner(System.in);
           System.out.println("Monthly Installment: ");
           int pp=inpu.nextInt();
           System.out.println("Rate of interest: ");
           int rr=inpu.nextInt();
           System.out.println("Time(Months): ");
           int nn=inpu.nextInt();
           double aa;
           aa = pp * nn + pp * nn*(nn + 1) / 2 * rr / 100 * 1 / 12.;
           System.out.println("RECEIVABLE: "+aa);
    break;
    default:System.out.println("INCORRECT INPUT!!\nTRY AGAIN: ");
             choicegiver();
    break;
  }
  return 0;
}


}
