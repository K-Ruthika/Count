import java.util.*;
public class Day3_Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int product = 1;
		System.out.println("Enter the value for Array : ");
		 for(int i=0; i<n; i++){
			 a[i]=sc.nextInt();
			 product =product*a[i];
			 System.out.println(a[i]+ " ");
			 } 
		 System.out.println("product of Array is : " +product);

	}

} 
