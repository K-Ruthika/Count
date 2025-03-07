import java.util.Scanner;
public class Day1_Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int m2 = m+m1;
		int n2 = n+n1;
		int TotalnoofApples = m+m2;
		int TotalnoofOranges = n+n2;
		int remainingApples = TotalnoofApples-x;
		int remainingOranges = TotalnoofOranges-y;
		System.out.println(remainingApples);
		System.out.println(remainingOranges);
		

	}

}
