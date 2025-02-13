
//2 10 30 68 130 222
//JDE-JFFCJD-E8

class Series4 
{
	public static void main(String[] args) 
	{
		for (int i =1 ;i<7;i++ )
		{
			int ans = 0;
			int num = 1;
			for (int j=0;j<3;j++ )
			{
				num*=i;
			}
			ans = num +i;
			System.out.print(ans+" ");
		}	
	}
}
