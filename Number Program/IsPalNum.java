import java.util.Scanner;
class IsPalNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int dup = num;

		while(num>0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num /= 10;
		}
		if(rev==dup)
		{
			System.out.println(dup+" Is Palindrome ");
		}
		else
		{
			System.out.println(dup+" Not a Palindrome ");
		}
	}
}
