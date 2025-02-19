import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		int dup = num;

		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum += rem;
		}
		
		while (num>0)
		{
			int rem = num%10;
			product*=rem;
			num/=10;
		}
		System.out.println(sum==product?(dup+" is a spyNumber"):(dup+" is not a spyNumber"));
	}
}
