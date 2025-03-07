import java.util.Scanner;

public class Day2_Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a % 10 == 3 || a % 10 == 8)
		{
			System.out.print("Lucky Winner");
		}
		else
		{
			System.out.print("Not a Lucky Winner");
		}

	}

}
