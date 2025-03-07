import java.util.Scanner;

public class Day3_Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
		{
			sum=sum+a[i][j];
		}
			
		System.out.println(sum);
		}

	}

}
