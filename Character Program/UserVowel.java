import java.util.Scanner;
class UserVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int len = str.length();

		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				System.out.println(str.charAt(i)+" ");
			}
		}
	}
}
