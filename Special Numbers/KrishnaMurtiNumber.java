// finding the number is krishnamurtiNumber or not 

import java.util.Scanner;
class KrishnaMurtiNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number");
		int start = sc.nextInt();
		System.out.println("Enter the ending number");
		int end = sc.nextInt();

		for (;start<=end ;start++ )
		{
		int num = start;
		int dup = start;
		int sum = 0;

		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			for (int i = 1;i<=rem ;i++ )
			{
				fact *= i;
			}
			sum += fact;
			num/=10;
		}
		if (start==sum)
		{
			System.out.println(start+" is KrishMurti Number.");
		}else{
			System.out.println(start+" is not krishMurtiNUmber.");
		}

		}
	}
}
