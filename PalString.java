import java.util.Scanner;
class PalString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String rev = "";

		for(int i = 0; i< str.length();i++)
		{
			rev =  str.charAt(i) + rev;
		}
		
		if(rev.equals(str)) System.out.println(str +" is a Palindrome String. ");
		else System.out.println(str +" is not a palindrome String. ");
	}
}
