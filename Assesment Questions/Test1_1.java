class Test1_1
{
	public static void main(String[] args) 
	{
		int n = 5;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=n-i+1;j>0;j--)
			{
				System.out.print(j+" "+"* ");
			}
			for (int k=n-i+1;k>0;k--)
			{
				System.out.print(k+" "+"* ");
			}
			System.out.println();
		}
	}
}
/*
D:\Programming>java Test1

5 * 4 * 3 * 2 * 1 * 5 * 4 * 3 * 2 * 1 *
4 * 3 * 2 * 1 * 4 * 3 * 2 * 1 *
3 * 2 * 1 * 3 * 2 * 1 *
2 * 1 * 2 * 1 *
1 * 1 *
*/