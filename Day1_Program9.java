
import java.util.Scanner;
public class Day1_Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary=sc.nextInt();
		int ExtraHoursOnWeekdays=10*80;
		int Weekend=(salary-ExtraHoursOnWeekdays)/(80+50);
		System.out.println("Number of hours worked on weekdays: "+(Weekend+10));
		System.out.println("Number of hours worked on weekend: "+(Weekend));
		
	}

}
