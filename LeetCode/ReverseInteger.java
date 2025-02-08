import java.util.Scanner;
class ReverseInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();

		long rev = 0;
		boolean flag = false;

		if(num < 0)
		{
			num *= (-1);
			flag = true;
		}
		while(num>0)
		{
			long rem = num%10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(flag)
		{
			rev *= -1;
		}
		if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
		{
			System.out.println("0");
		}
		System.out.println((int)rev);
	}
}
