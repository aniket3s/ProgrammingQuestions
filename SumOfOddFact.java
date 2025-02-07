import java.util.Scanner;
class SumOfOddFact 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while(num>0)
		{
			int fact = 1;
			int rem = num%10;
			if(rem%2 != 0)
			{
				for(int i= rem; i>0;i--)
				{
					fact *= i;
				}
				sum += fact;
			}
			num /= 10;
		}
		System.out.println("Sum of Factorial of odd digits : "+sum);
	}
}
