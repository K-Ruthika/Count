import java.util.*;
public class Day4_Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int result=0;
		//System.out.print(str1.compareTo(str2)); with method
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		for(int i=0 ;i<ch1.length; i++) {
			if(ch1[i]!=ch2[i]) {
				result=(int)ch1[i]-(int)ch2[i];
				break;
			}
		}
		System.out.print(result);
		}

	}
