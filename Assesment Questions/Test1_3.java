// find the most repeating digit

import java.util.Scanner;
class Test1_3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int max = Integer.MIN_VALUE;
		char ans = ' ';

		for (char ch='a';ch<='z' ;ch++ )
		{
			int cnt = 0;
			int i = 0;
			while (i<str.length())
			{
				if (ch == str.charAt(i))
				{
					cnt++;
				}
				i++;
			}
			if (cnt>max)
			{
				max = cnt;
				ans = ch;
			}
		}
		System.out.println(ans);
	}
}
