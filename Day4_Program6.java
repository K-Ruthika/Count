import java.util.Scanner;
public class Day4_Program6 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String email = sc.nextLine();
		        if(email.contains("com") || email.contains("in") || email.contains("net") || email.contains("org"))
		        {
		        	System.out.println("Valid email address");
		        }
		        else
		        {
		        	System.out.println("Invalid email address");
		        }
		    }
	}
