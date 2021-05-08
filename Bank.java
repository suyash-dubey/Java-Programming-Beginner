import java.util.*;
public class Bank{
	static String s, address;
 static	int acc, bal;
	Bank(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of depositor: ");
		s = sc.nextLine();
		System.out.print("Address of depositor: ");
		address = sc.nextLine();
		System.out.print("Account Number: ");
		acc = sc.nextInt();
		System.out.print("Balance in account: ");
		bal = sc.nextInt();
	}
	 static void dispaly(){
		System.out.println("name of depositor: "+ s);
		System.out.println("Address of depositor: "+address);
		System.out.println("Account Number: "+acc);
		System.out.println("Balance in account: "+bal);
	}
	static void addamt(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the amount you want to add: ");
		int amt = sc.nextInt();
		bal += amt;
		System.out.print("New balance is: "+bal);
	}
	static void withdrawamt(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the amount you want to withdraw: ");
		int wdamt = sc.nextInt();
		if(wdamt>bal){
			System.out.print("insufficient amount");

		}
		else{
			bal -= wdamt;
			System.out.print("New balance is: "+bal);
		}
	}
	static void changeadd(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the new address: ");
		address = sc.nextLine();
		System.out.print("New Address is: "+address);
	}
	public static void main(String[] args){
		//Bank obj = new Bank();
		Bank o=new Bank();
		System.out.println("--------Bank Account-------- ");
		System.out.println("1)- Display details of user");
		System.out.println("2)- Add amount");
		System.out.println("3)- Withdraw amount");
		System.out.println("4)- Change the address");
		System.out.println("5)- exit");
		System.out.print("enter choice: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a){
			case 1:
				o.dispaly();
				{break;}
			case 2:
				o.addamt();
				{break;}
			case 3:
				o.withdrawamt();
				{break;}
			case 4:
				o.changeadd();
				{break;}
			case 5:
				//exit(0);
				//{break;}
			default :
				{
				    System.out.print("INVALID OPTION  CHOOSE AGAIN BTWN 1 TO 5");
				}

		}
	}
}
