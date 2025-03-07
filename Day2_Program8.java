import java.util.Scanner;

public class Day2_Program8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = n/10;
		 int middle = m%10;
		 if(middle % 3 == 0)
		 {
			 System.out.print(n+ "is a trendy number");
		 }
		 else
		 {
			 System.out.print(n+ " is not a trendy number");
		 }

	}

}
