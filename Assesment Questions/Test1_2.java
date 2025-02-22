// find the good prime numbers between 1 to given number
// good prime number is a number which is prime and all the digits are also prime.

import java.util.Scanner;
class Test1_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num2 = sc.nextInt();
		
		
	
		for (int num=1; num<=num2;num++ )
		{
		int den = 2;
		int dup = num;
		while (den<=num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if (num==den)
		{
			boolean flag = true;
			while (dup>0)
			{
				int rem = dup%10;
				int den1 = 2;
				while (den1<=rem)
				{
					if (rem%den1==0)
					{
						break;
					}
					den1++;
				}
				if (rem!=den1)
				{
					flag = false;
				}
				dup/=10;
			}
			if (flag) System.out.print(num+" ");
		}
		}
	}
}
/*

D:\Programming>java Test1_2
Enter the number
23
2 3 5 7 23
D:\Programming>java Test1_2
Enter the number
244
2 3 5 7 23 37 53 73 223 227 233
D:\Programming>java Test1_2
Enter the number
567
2 3 5 7 23 37 53 73 223 227 233 257 277 337 353 373 523 557
D:\Programming>
*/