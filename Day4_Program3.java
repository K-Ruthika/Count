import java.util.Scanner;
public class Day4_Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		StringBuffer str2 = new StringBuffer(str1).reverse();
		if(str1.equals(str1.toString()))
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.print(" Not Palindrome");
		}

	}

}
