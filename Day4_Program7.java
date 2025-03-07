import java.util.Scanner;
public class Day4_Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length();
		char x = str.charAt(0);//x=a;
		char y = str.charAt(1);//y=b;
		int flag = 0;
		if(x==y) {
			flag=1;
		}
		else
		{
			for(int i=2; i<length; i++ )
			{
				if(i%2==0)
				{
					if(x==str.charAt(i))
					{
					 flag=1;
					 break;
					}
				}
				else if(y==str.charAt(i))
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print("Yes");
			}
			else
			{
				System.out.print("No");
			}
		}

	}

}
