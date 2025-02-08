//sum of factorial of digit 

import java.util.Scanner;
class SumOfFact 
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
			for(int i = rem; i>0;i--)
			{
				fact*= i;	
			}
			sum += fact;
			System.out.println(fact);
			num /= 10; 
		}
		System.out.println("Sum of factorial of digits : "+sum);
	}
}
