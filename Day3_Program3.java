import java.util.Scanner;

public class Day3_Program3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of Array: ");
		 int n = sc.nextInt();
		 int a[]= new int[n];
		 System.out.println("Enter the value of Array: ");
		 for(int i=0; i<n; i++)
		 {
			 a[i] = sc.nextInt();
		 }
		 boolean visited[] = new boolean[n];
		 for(int i=0; i<n; i++)
		 {
			 if(visited[i]==true)
			 {
				 continue;
			 }
			 int count=1;
			 for(int j=i+1; j<n; j++)
			 {
				 if(a[i] == a[j])
				 {
					 visited[j] = true;
					 count++;
				 }
			 }
			 System.out.println(a[i]+ " " +count);
		 }

	}

}
