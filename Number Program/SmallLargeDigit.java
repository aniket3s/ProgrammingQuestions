import java.util.Scanner;
class SmallLargeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int max  = 0;
		int min = 9 ;

		while (num > 0)
		{
			int rem = num%10;
			if (rem <= min)
			{
				min = rem;
			}
			if (rem >= max)
			{
				max = rem;
			}
			num /= 10;
		}
		System.out.println("smallest  digit = " +min);
		System.out.println("highest  digit = " +max);
	}
}
