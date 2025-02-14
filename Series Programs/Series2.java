class Series2 
{
	public static void main(String[] args) 
	{
		int square = 0;
		int cube = 0;
		int num = 12;
		for (int i =0;i<5;i++ )
		{
			
			if (num %2 ==0)
			{
				square = num*num; 
				System.out.print( square+" ");
			}
			else if(num%2 != 0)
			{
				cube = num*num*num;
				System.out.print( cube+" ");
			}
			num++;
		}
	}
}
