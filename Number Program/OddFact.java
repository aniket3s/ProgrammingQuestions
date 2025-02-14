class OddFact 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int dup = num;
		int fact = 1;
		int sum =0;
		while(num>0)
		{
			int rem = num%10;
			if(rem%2 !=0 )
			{
				for(int i= rem; i>=1;i--)
				{
					fact*= i;
					sum+= fact;
				}
			}
		 num /= 10;
		}
		System.out.println(sum);
		System.out.println(dup);
	}
        
}
