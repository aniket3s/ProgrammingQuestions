import java.util.Scanner;

class Ey2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt0 = 0;
		int cnt1 = 0;

		for (int i =0;i<str.length() ;i++ )
		{
			if (str.charAt(i)=='0')
			{
				cnt1 = 0;
				cnt0++;
			}
			else if (str.charAt(i)=='1')
			{
				cnt0 = 0;
				cnt1++;
			}
		}
		if (cnt0 == 7 || cnt1 == 7) System.out.println("Yes");
			else System.out.println("Yes");
	}
}
