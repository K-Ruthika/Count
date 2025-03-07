import java.util.Scanner;

public class Day2_Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a >= 85)
		{
			System.out.print("A");
		}
		else if(a >= 75)
		{
			System.out.print("B");
		}
		else if(a >=65)
		{
			System.out.print("C");
		}
		else
		{
			System.out.print("D");
		}

	}

}
