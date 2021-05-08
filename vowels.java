import java.util.Scanner;
class vowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.print("Enter the string: ");
		s1 = sc.nextLine();
		StringBuffer str1 = new StringBuffer(" ");
		str1.append(s1);
		String[] s2 = s1.split("[aeiouAEIOU]");
		System.out.print("The new string is: ");
		for(String w: s2)
		{
			System.out.print(w);
		}
	}
}
