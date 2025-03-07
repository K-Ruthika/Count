import java.util.Scanner;

//sum of elements in the Upper triangular matrix
public class Day3_Program8 {

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
			for(int j=0; j<n; j++ )
			{
				if(i==j || i<j) {
				System.out.print(a[i][j]+ " " );
				sum+=a[i][j];
			}
			}
		}
		System.out.println(sum);
	}

}
