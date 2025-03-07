import java.util.Scanner;

public class Day4_Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		int length = str.length();
			if(length % 2!= 0)
			{
				System.out.print(str.charAt(length/2));
				
			}
			else 
			{
				System.out.print((str.charAt(length/2)-1)+""+str.charAt(length/2));
			}
		}
}
