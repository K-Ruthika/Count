import java.util.Scanner;

public class Day2_Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int given_year = sc.nextInt();
		int ry = 0;
		int ly = 0;
		y = (y-1)-given_year;
		ly = y/4;
		ry = y-ly;
		int totalDays = (ry*365)+(ly*366)+1;
		int day = totalDays%7;
		if(day == 0) {
			System.out.print("Monday");
		}
		else if(day == 1) {
			System.out.print("Tuesday");
		}
		else if(day == 2)
		{
			System.out.print("Wednesday");
		}
		else if(day == 3)
		{
			System.out.print("Thursday");
		}
		else if(day == 4) 
		{
			System.out.print("Friday");
			
		}
		else if(day == 5)
		{
			System.out.print("Saturday");
		}
		else if(day == 6)
		{
			System.out.print("Sunday");
		
		}
		else
		{
			System.out.print("Wrong input");
		}

	}

}
