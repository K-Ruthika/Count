import java.util.Scanner;
public class Day3_Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]= new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int count = 2*n;
		if(n % 2 != 0) {
			count-=1;
		}
		System.out.println(count);
	}

}
