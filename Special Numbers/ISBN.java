class ISBN 
{
	public static void main(String[] args) 
	{
		long num = 1259060977l;
		int sum = 0;
		for (long i = num,  j =1;i>0 ;i/=10,j++ )
		{
			long rem  = num%10;
			sum +=(rem*j);
		}
		System.out.println(sum+" sum is this");
		if (sum%11==0)
		{
			System.out.println(num + " is a valid ISBN number");
		}
		else
		{
			System.out.println(num + "is not a valid ISBN number");
		}
	}
}
