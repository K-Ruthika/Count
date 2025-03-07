import java.util.*;
public class Day3_Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int a[]= new int[n];
		int max = 0;
		int min = 0;
		System.out.println("Entert the value of Array: ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		max = a[0];
	    min = a[0];
	    for( int i=1; i<n; i++) {
	    	if(a[i]>max) {
	    		max=a[i];
	    	}
	    	if(a[i]<min) {
	    		min=a[i];
	    	}
	    	
	    }
	    System.out.println("Maximum value of Array is : " +max);
	    System.out.println("Minimum value of Array is : " +min);
	}

}
