import java.util.Scanner;
class RevString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";

		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
//-------------------------------------Method-2--------------------------------------------
//-------------------------------------forward-loop----------------------------------------------------

/*	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";

		for(int i = 0;i<str.length();i++)
		{
			rev = str.charAt(i)+rev;
		}
		System.out.println(rev);
	} 
}
*/

