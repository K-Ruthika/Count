import java.util.Scanner;

public class Day2_Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0, b=0, c=1, d=0,i;
		int n = sc.nextInt();
		System.out.print(a+" " +b+" " +c+" ");
		for(i=3; i<n; i++)
		{
			d=a+b+c;
			System.out.print(d+ " ");
			a=b;
			b=c;
			c=d;
		}

	}

}
