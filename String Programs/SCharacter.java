import java.util.Scanner;
class SCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.next().toUpperCase();

		for(int i=0;i<s.length();i++)
		{
		  System.out.println(s.charAt(i)+" ");
		}
	}
}
