import java.util.Scanner;
class SumOfFactors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		for(int i = 1;i<=num; i++)
		{
			if(num%i == 0 )
			{
				sum += i;
			}
		}
		System.out.print("Sum Of all Factors is : "+sum);
	}
}
