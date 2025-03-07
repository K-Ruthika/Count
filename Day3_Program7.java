import java.util.Scanner;

//sum of elements in the lower triangular matrix
public class Day3_Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int a[][]= new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++ )
			{
				System.out.print(a[i][j]+ " " );
				sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(sum);
	}

}
