class TechNumber 
{
	public static void main(String[] args) 
	{
		int num = 2025;
		int len = 0;
		int div = 1;

		for (int i = num;i>0 ;i/=10 )
		{
			len++;
		}
		if (len%2==0)
		{
			for (int i =1; i<=(len/2); i++ )
			{
				div*=10;
			}
			int fh = num/div;
			int lh = num%div;
			int sum = fh + lh;
			int sqr = sum*sum;

			System.out.println(sqr==num ? num+" is a Tech Number": num+" is not a Tech Number");
		}
		else
		{
			System.out.println(num+" is not a tech Number");
		}
	}
}
