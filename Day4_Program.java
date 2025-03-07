
public class Day4_Program {

	public static void main(String[] args) {
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
